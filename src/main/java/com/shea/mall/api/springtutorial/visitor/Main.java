package com.shea.mall.api.springtutorial.visitor;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/11 17:07
 */
public class Main {
    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Cat());
        home.add(new Dog());
        User user = new User();
        home.action(user);
    }
}
