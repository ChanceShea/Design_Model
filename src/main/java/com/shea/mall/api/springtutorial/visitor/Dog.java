package com.shea.mall.api.springtutorial.visitor;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/11 17:06
 */
public class Dog implements Animal {

    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("Dog is being fed");
    }
}
