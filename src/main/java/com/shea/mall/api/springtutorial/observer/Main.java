package com.shea.mall.api.springtutorial.observer;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/8 10:23
 */
public class Main {
    public static void main(String[] args) {
        Subscription subscription = new Subscription();
        subscription.attach(new User("Alice"));
        subscription.attach(new User("Bob"));
        subscription.attach(new User("Charlie"));
        subscription.attach(new User("Alice"));
        subscription.notifyObservers("Hello, observers!");
        // subscription.shutdown();
    }
}
