package com.shea.mall.api.springtutorial.builder;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/4 14:43
 */
public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .cpu("Intel i9")
                .ram("16GB")
                .disk("512GB")
                .keyboard("Logitech")
                .mouse("Logitech")
                .build();
        System.out.println(computer);
    }
}
