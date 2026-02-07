package com.shea.mall.api.springtutorial.flyweight;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/6 14:59
 */
public class Main {

    public static void main(String[] args) {
        BoxFactory instance = BoxFactory.getInstance();
        AbstractBox i = instance.getShape("I");
        AbstractBox o = instance.getShape("O");
        AbstractBox l = instance.getShape("L");
        i.display("Red");
        o.display("Blue");
        l.display("Green");
        AbstractBox i1 = instance.getShape("I");
        i1.display("Gray");
        System.out.println(i == i1);
    }
}
