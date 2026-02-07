package com.shea.mall.api.springtutorial.adapt.class_adapter;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/4 20:12
 */
public class USBImpl implements USB{
    @Override
    public void connectUSB() {
        System.out.println("USB connected");
    }
}
