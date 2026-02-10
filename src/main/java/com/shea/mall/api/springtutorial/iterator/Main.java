package com.shea.mall.api.springtutorial.iterator;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/10 21:18
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("Shea", 18, "Shanghai", "12345678901");
        for (String field : user) {
            System.out.println(field);
        }
    }
}
