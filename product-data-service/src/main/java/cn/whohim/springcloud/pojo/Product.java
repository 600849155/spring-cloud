package cn.whohim.springcloud.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Whomhim
 */
@Data
@AllArgsConstructor
public class Product {

    private int id;
    private String name;
    private int price;

}
