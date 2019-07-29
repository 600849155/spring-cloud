package cn.whohim.springcloud.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.whohim.springcloud.service.ProductService;

/**
 * @author Whomhim
 */

@Controller
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public Object products(Model m) {
        List ps = productService.listProducts();
        m.addAttribute("ps", ps);
        return "products";
    }
}