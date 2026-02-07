package com.shea.mall.api.springtutorial.template;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/6 19:55
 */
public class ChineseCabbage extends Vegetables {
    @Override
    public void pourVegetable() {
        System.out.println("倒入白菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("加入蒜蓉");
    }
}
