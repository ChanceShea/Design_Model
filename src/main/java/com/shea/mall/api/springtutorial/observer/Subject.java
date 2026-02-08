package com.shea.mall.api.springtutorial.observer;

/**
 * @author : Shea.
 * @description : TODO
 * @since : 2026/2/8 10:17
 */
public interface Subject {
    // 添加订阅者
    void attach(Observer observer);

    // 删除订阅者
    void detach(Observer observer);

    // 通知所有订阅者
    void notifyObservers(String message);
}
