package cn.whohim.springcloud.service;




import cn.whohim.springcloud.client.ProductClientFeign;
import cn.whohim.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:WhomHim
 * @Description:
 * @Date: Create in 2019-7-10 00:05:18
 * @Modified by:
 */

@Service
@SuppressWarnings("SpringJavaAutowiringInspection")
public class ProductService {

    private final
    ProductClientFeign productClientFeign;

    @Autowired
    public ProductService(ProductClientFeign productClientFeign) {
        this.productClientFeign = productClientFeign;
    }

    public List<Product> listProducts(){
        return productClientFeign.listProducts();
    }
}