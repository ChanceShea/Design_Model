package com.shea.mall.api.springtutorial.factory;

import com.shea.mall.api.springtutorial.abstractFactory.Coffee;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/3 16:07
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
