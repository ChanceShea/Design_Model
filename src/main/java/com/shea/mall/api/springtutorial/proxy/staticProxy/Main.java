package com.shea.mall.api.springtutorial.proxy.staticProxy;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/4 16:08
 */
public class Main {

    public static void main(String[] args) {
        UserProxy proxy = new UserProxy(new UserServiceImpl());
        proxy.sayHello();
    }
}
