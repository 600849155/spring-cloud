package cn.whohim.springcloud.util;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.http.HttpUtil;

/**
 * @author whohim
 */
public class AccessViewService {

    public static void main(String[] args) {

        while (true) {
            ThreadUtil.sleep(1000);
            try {
                String html = HttpUtil.get("http://127.0.0.1:8012/products");
                System.out.println("html length:" + html.length());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        }

    }
}
