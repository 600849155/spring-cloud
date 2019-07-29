package cn.whohim.springcloud.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author Whomhim
 */
@Component
public class ProductClientRibbon {

    private final
    RestTemplate restTemplate;

    @Autowired
    public ProductClientRibbon(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public List listProdcuts() {
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
    }

}
