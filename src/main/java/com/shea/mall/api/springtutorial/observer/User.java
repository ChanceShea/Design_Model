package com.shea.mall.api.springtutorial.observer;

import java.util.Objects;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/8 10:18
 */
public class User implements Observer {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
