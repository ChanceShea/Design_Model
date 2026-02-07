package com.shea.mall.api.springtutorial.bridge;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/5 10:40
 */
public class Tangle extends Shape {

    public Tangle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        color.show();
        System.out.println("Tangle");
    }
}
