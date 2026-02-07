package com.shea.mall.api.springtutorial.abstractFactory;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/3 20:00
 */
public class Main {

    public static void main(String[] args) {
        ItalyDessertFactory italyDessertFactory = new ItalyDessertFactory();
        Coffee latte = italyDessertFactory.createCoffee();
        Dessert tiramisu = italyDessertFactory.createDessert();
        System.out.println(latte);
        System.out.println(tiramisu);
    }
}
