package com.shea.mall.api.springtutorial.visitor;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/11 17:06
 */
public class Cat implements Animal {

    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("Cat is being fed");
    }
}
