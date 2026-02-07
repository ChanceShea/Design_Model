package com.shea.mall.api.springtutorial.decorator;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/4 21:50
 */
abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public Double getPrice() {
        return coffee.getPrice();
    }

    @Override
    public String getDesc() {
        return coffee.getDesc();
    }
}
