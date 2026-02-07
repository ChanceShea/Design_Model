package com.shea.mall.api.springtutorial.facade;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/5 18:26
 */
public class SmartAssistFacade {

    private final Light light;
    private final TV tv;
    private final AirCondition airCondition;

    public SmartAssistFacade() {
        this.light = new Light();
        this.tv = new TV();
        this.airCondition = new AirCondition();
    }

    public void on(){
        light.on();
        tv.on();
        airCondition.on();
    }

    public void off(){
        light.off();
        tv.off();
        airCondition.off();
    }
}
