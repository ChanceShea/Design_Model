package com.shea.mall.api.springtutorial.template;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/6 19:56
 */
public class Main {

    public static void main(String[] args) {
        Cabbage cabbage = new Cabbage();
        cabbage.cook();
        System.out.println("================================");
        ChineseCabbage chineseCabbage = new ChineseCabbage();
        chineseCabbage.cook();
    }
}
