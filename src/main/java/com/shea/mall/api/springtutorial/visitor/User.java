package com.shea.mall.api.springtutorial.visitor;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/11 17:07
 */
public class User implements Person {
    @Override
    public void feed(Cat cat) {
        System.out.println("User is feeding cat");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("User is feeding dog");
    }
}
