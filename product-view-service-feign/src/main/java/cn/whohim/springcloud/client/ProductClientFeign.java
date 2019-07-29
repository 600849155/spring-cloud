package cn.whohim.springcloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import cn.whohim.springcloud.pojo.Product;

import java.util.List;


/**
 * PRODUCT-DATA-SERVICE 既不是域名也不是ip地址，而是 数据服务在 eureka 注册中心的名称。
 * <p>
 * 如果访问的PRODUCT-DATA-SERVICE服务不可用，则调用ProductClientFeignHystrix来进行反馈
 * </p>
 *
 * @author WhomHim
 */
@FeignClient(value = "PRODUCT-DATA-SERVICE", fallback = ProductClientFeignHystrix.class)
public interface ProductClientFeign {

    /**
     * 调用product-data-service服务中的接口
     *
     * @return 调用product-data-service服务中的接口
     */
    @GetMapping("/products")
    List<Product> listProducts();

}
