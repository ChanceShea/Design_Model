package com.shea.mall.api.springtutorial.proxy.staticProxy;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/4 16:06
 */
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello() {
        System.out.println("Hello World");
    }
}
