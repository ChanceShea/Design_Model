package com.shea.mall.api.springtutorial.responsibility;

/**
 * @author : Shea.
 * @description : TODO
 * @since : 2026/2/7 16:07
 */
public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}
