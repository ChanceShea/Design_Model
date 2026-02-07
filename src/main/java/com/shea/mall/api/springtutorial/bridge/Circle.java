package com.shea.mall.api.springtutorial.bridge;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/5 10:39
 */
public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        color.show();
        System.out.println("Circle");
    }
}
