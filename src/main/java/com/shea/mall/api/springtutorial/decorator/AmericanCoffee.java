package com.shea.mall.api.springtutorial.decorator;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/4 21:50
 */
public class AmericanCoffee implements Coffee {
    @Override
    public Double getPrice() {
        return 9.9;
    }

    @Override
    public String getDesc() {
        return "American Coffee";
    }
}
