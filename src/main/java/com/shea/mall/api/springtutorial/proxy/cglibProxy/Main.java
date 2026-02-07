package com.shea.mall.api.springtutorial.proxy.cglibProxy;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/4 19:43
 */
public class Main {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        UserServiceImpl proxyObject = proxyFactory.getProxyObject();
        proxyObject.sayHello();
    }
}
