package com.shea.mall.api.springtutorial.iterator;

import java.lang.reflect.Field;
import java.util.Iterator;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/10 20:40
 */
public class User implements Iterable<String>{

    private String name;
    private int age;
    private String address;
    private String phone;

    public User(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public Iterator<String> iterator() {
        return new UserIterator();
    }

    class UserIterator implements Iterator<String> {

        int count = 0;
        static Field[] fields;

        static{
            fields = User.class.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
            }
        }

        @Override
        public boolean hasNext() {
            return count < fields.length;
        }

        @Override
        public String next() {
            Field field = fields[count++];
            try {
                return String.valueOf(field.get(User.this));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
