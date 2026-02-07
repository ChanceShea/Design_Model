package com.shea.mall.api.springtutorial.proxy.jdkProxy;

import java.lang.reflect.Proxy;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/4 16:16
 */
public class ProxyFactory {

    private final UserServiceImpl userServiceImpl = new UserServiceImpl();

    public UserService getUserService() {
        UserService userService = (UserService) Proxy.newProxyInstance(
                userServiceImpl.getClass().getClassLoader(),
                userServiceImpl.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("开始代理，记录日志 " + System.currentTimeMillis());
                    return method.invoke(userServiceImpl, args);
                }
        );
        return userService;
    }
}
