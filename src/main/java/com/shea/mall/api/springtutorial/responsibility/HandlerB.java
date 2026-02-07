package com.shea.mall.api.springtutorial.responsibility;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/7 16:10
 */
public class HandlerB extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request <= 20){
            System.out.println("HandlerB 处理请求" + request);
        }else if(successor != null){
            successor.handleRequest(request);
        }
    }
}
