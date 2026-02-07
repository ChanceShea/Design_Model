package com.shea.mall.api.springtutorial.adapt.object_adapter;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/4 20:09
 */
public class TypeC2USBAdapter implements USB {

    private TypeC typeC;

    public TypeC2USBAdapter(TypeC typeC) {
        this.typeC = typeC;
    }

    @Override
    public void connectUSB() {
        System.out.println("适配器将TypeC转换为USB");
        typeC.connectTypeC();
    }
}
