package com.shea.mall.api.springtutorial.factory;

import com.shea.mall.api.springtutorial.abstractFactory.Coffee;
/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/3 16:14
 */
public class Main {

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        coffeeStore.setCoffeeFactory(new LatteCoffeeFactory());
        Coffee latte = coffeeStore.order();
        coffeeStore.setCoffeeFactory(new AmericanCoffeeFactory());
        Coffee american = coffeeStore.order();
        System.out.println(latte);
        System.out.println(american);
    }
}
