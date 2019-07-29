package cn.whohim.springcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.whohim.springcloud.client.ProductClientRibbon;

/**
 * @author Whomhim
 */
@Service
public class ProductService {

    private final
    ProductClientRibbon productClientRibbon;

    @Autowired
    public ProductService(ProductClientRibbon productClientRibbon) {
        this.productClientRibbon = productClientRibbon;
    }

    public List listProducts() {
        return productClientRibbon.listProdcuts();

    }
}
