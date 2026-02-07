package com.shea.mall.api.springtutorial.decorator;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/4 21:52
 */
public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 1.0;
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ", Sugar";
    }
}
