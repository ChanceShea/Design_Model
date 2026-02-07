package com.shea.mall.api.springtutorial.responsibility;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/7 16:09
 */
public class HandlerA extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request <= 10){
            System.out.println("HandlerA 处理请求" + request);
        }else if(successor != null){
            successor.handleRequest(request);
        }
    }
}
