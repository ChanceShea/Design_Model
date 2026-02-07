package com.shea.mall.api.springtutorial.flyweight;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/6 14:54
 */
public abstract class AbstractBox {

    // 获取图形
    public abstract String getShape();
    // 显示图形及颜色
    public void display(String color){
        System.out.println("Shape: " + getShape() + ", Color: " + color);
    }
}
