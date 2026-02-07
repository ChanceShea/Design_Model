package com.shea.mall.api.springtutorial.bridge;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/5 10:41
 */
public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(new Blue());
        Shape circle2 = new Circle(new Green());
        Shape tangle = new Tangle(new Blue());
        Shape tangle2 = new Tangle(new Green());
        circle.draw();
        circle2.draw();
        tangle.draw();
        tangle2.draw();
    }
}
