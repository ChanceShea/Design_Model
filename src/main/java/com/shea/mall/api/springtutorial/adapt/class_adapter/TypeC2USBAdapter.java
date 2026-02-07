package com.shea.mall.api.springtutorial.adapt.class_adapter;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/4 20:09
 */
public class TypeC2USBAdapter extends TypeCImpl implements USB{
    @Override
    public void connectUSB() {
        System.out.println("适配器将TypeC转换为USB");
        connectTypeC();
    }
}
