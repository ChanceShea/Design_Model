package com.shea.mall.api.springtutorial.observer;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/8 10:19
 */
public class Subscription implements Subject{

    private Set<Observer> observers = new HashSet<>();
    private ExecutorService executor = Executors.newFixedThreadPool(10);

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        observers.forEach(observer -> observer.update(message));
        // 用户多时，可以使用多线程通知
//        CompletableFuture[] array = observers.stream().map(
//                observer -> CompletableFuture.runAsync(
//                        () -> observer.update(message), executor
//                )
//        ).toArray(CompletableFuture[]::new);
//        CompletableFuture.allOf(array).join();
    }

    public void shutdown() {
        executor.shutdown();
        try {
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
