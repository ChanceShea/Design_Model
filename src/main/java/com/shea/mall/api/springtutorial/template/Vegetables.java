package com.shea.mall.api.springtutorial.template;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/6 19:52
 */
public abstract class Vegetables {

    public final void cook(){
        pourOil();
        headOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    public void pourOil(){
        System.out.println("倒油");
    }
    public void headOil(){
        System.out.println("加热");
    }
    public abstract void pourVegetable();
    public abstract void pourSauce();

    public void fry(){
        System.out.println("翻炒");
    }
}
