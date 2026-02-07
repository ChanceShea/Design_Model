package com.shea.mall.api.springtutorial.proxy.cglibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/4 19:40
 */
public class ProxyFactory implements MethodInterceptor {

    private final UserServiceImpl target = new UserServiceImpl();

    public UserServiceImpl getProxyObject(){
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象
        enhancer.setSuperclass(UserServiceImpl.class);
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        UserServiceImpl userService = (UserServiceImpl) enhancer.create();
        return userService;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("打印日志，当前时间："+ System.currentTimeMillis());
        return method.invoke(target, args);
    }
}
