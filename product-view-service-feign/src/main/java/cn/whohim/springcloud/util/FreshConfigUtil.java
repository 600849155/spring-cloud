package cn.whohim.springcloud.util;

import cn.hutool.http.HttpUtil;

import java.util.HashMap;

/**
 * @Author:WhomHim
 * @Description:
 * @Date: Create in 2019-7-27 17:32:55
 * @Modified by:
 */
public class FreshConfigUtil {
    public static void main(String[] args) {
        HashMap<String, String> headers = new HashMap<>(16);
        headers.put("Content-Type", "application/json; charset=utf-8");
        System.out.println("因为要去git获取，还要刷新config-server, 会比较卡，所以一般会要好几秒才能完成，请耐心等待");

        String result = HttpUtil.createPost("http://localhost:8012/actuator/bus-refresh").addHeaders(headers).execute().body();
        System.out.println("result:" + result);
        System.out.println("refresh 完成");
    }
}
