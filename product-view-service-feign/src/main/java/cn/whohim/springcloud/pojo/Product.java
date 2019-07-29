package cn.whohim.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author:WhomHim
 * @Description:
 * @Date: Create in 2019-7-9 01:18:47
 * @Modified by:
 */
@Data
@AllArgsConstructor
public class Product {

    private int id;

    private String name;

    private int price;
}
