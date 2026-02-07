package com.shea.mall.api.springtutorial.adapt.object_adapter;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/4 20:15
 */
public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        USB usb = new USBImpl();
        computer.connectAdapter(usb);
        TypeC2USBAdapter adapter = new TypeC2USBAdapter(new TypeCImpl());
        computer.connectAdapter(adapter);
    }
}
