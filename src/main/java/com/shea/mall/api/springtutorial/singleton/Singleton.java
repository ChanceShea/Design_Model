package com.shea.mall.api.springtutorial.singleton;

import java.io.Serializable;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/2 21:54
 */
public class Singleton implements Serializable {

    private Singleton() {}

    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }

    public Object readResolve() {
        return Holder.INSTANCE;
    }
}
