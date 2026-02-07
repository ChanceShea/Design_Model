package com.shea.mall.api.springtutorial.prototype;

import java.io.Serializable;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/3 20:34
 */
public class Student implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
