package com.shea.mall.api.springtutorial.decorator;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/4 21:51
 */
public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 2.0;
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ", Milk";
    }
}
