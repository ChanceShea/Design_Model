package com.shea.mall.api.springtutorial.visitor;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/11 17:06
 */
public interface Animal {

    // 接收访问者访问的功能
    void accept(Person person);
}
