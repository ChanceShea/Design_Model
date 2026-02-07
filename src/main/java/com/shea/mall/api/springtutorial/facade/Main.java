package com.shea.mall.api.springtutorial.facade;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/5 18:27
 */
public class Main {

    public static void main(String[] args) {
        SmartAssistFacade smartAssistFacade = new SmartAssistFacade();
        smartAssistFacade.on();
        smartAssistFacade.off();
    }
}
