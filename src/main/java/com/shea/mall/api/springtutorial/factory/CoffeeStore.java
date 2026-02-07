package com.shea.mall.api.springtutorial.factory;

import com.shea.mall.api.springtutorial.abstractFactory.Coffee;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/3 16:08
 */
public class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee order(){
        return coffeeFactory.createCoffee();
    }
}
