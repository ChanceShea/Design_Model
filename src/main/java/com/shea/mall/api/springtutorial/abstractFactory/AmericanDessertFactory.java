package com.shea.mall.api.springtutorial.abstractFactory;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/3 19:59
 */
public class AmericanDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
