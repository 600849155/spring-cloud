package cn.whohim.springcloud.web;

import cn.whohim.springcloud.pojo.Product;
import cn.whohim.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



import java.util.List;

/**
 * @Author:WhomHim
 * @Description:
 * @Date: Create in 2019-7-10 00:09:14
 * @Modified by:
 */
@Controller
public class ProductController {

    private final
    ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /**
     * 增加这个属性，就可以从 config-server 去获取 version 信息了。
     */
    @Value("${version}")
    String version;

    @RequestMapping("/products")
    public Object product(Model model) {
        List<Product> productList = productService.listProducts();
        model.addAttribute("ps", productList);
        model.addAttribute("version", version);
        return productList;
    }
}
