package com.shea.mall.api.springtutorial.proxy.jdkProxy;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/4 16:15
 */
public class Main {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        UserService userService = proxyFactory.getUserService();
        userService.sayHello();
    }
}
