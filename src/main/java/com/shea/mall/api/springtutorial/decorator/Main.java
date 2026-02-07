package com.shea.mall.api.springtutorial.decorator;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/4 21:52
 */
public class Main {

    public static void main(String[] args) {
        Coffee coffee = new AmericanCoffee();
        System.out.println(coffee.getDesc() + " $" + coffee.getPrice());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDesc() + " $" + coffee.getPrice());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDesc() + " $" + coffee.getPrice());
    }
}
