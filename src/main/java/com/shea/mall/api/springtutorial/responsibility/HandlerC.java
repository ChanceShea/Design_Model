package com.shea.mall.api.springtutorial.responsibility;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/7 16:10
 */
public class HandlerC extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request <= 30){
            System.out.println("HandlerC 处理请求" + request);
        } else {
            System.out.println("无处理请求的方法 " + request);
        }
    }
}
