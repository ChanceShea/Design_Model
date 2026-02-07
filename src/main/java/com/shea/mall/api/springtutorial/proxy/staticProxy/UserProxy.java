package com.shea.mall.api.springtutorial.proxy.staticProxy;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/4 16:06
 */
public class UserProxy implements UserService {

    private UserService userService;

    public UserProxy(UserService userService) {
        this.userService = userService;
    }
    @Override
    public void sayHello() {
        System.out.println("开始代理，记录日志 " + System.currentTimeMillis());
        userService.sayHello();
        System.out.println("代理结束，记录日志 " + System.currentTimeMillis());
    }
}
