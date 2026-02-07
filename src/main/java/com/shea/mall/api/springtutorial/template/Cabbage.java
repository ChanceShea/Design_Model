package com.shea.mall.api.springtutorial.template;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/6 19:54
 */
public class Cabbage extends Vegetables{
    @Override
    public void pourVegetable() {
        System.out.println("倒入包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("加入辣椒");
    }
}
