package cn.whohim.springcloud.client;

import cn.whohim.springcloud.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:WhomHim
 * @Description:
 * @Date: Create in 2019-7-27 22:24:20
 * @Modified by:
 */
@Component
public class ProductClientFeignHystrix implements ProductClientFeign {

    @Override
    public List<Product> listProducts() {
        List<Product> result = new ArrayList<>();
        result.add(new Product(0, "产品数据微服务不可用", 0));
        return result;
    }
}
