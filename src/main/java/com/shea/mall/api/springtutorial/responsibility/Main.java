package com.shea.mall.api.springtutorial.responsibility;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/7 16:11
 */
public class Main {
    public static void main(String[] args) {
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        Handler handlerC = new HandlerC();
        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);
        int[] request = {5,15,25,35};
        for (int i : request) {
            handlerA.handleRequest(i);
        }
    }
}
