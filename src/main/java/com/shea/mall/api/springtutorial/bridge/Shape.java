package com.shea.mall.api.springtutorial.bridge;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/5 10:38
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}
