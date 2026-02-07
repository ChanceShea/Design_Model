package com.shea.mall.api.springtutorial.singleton;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        writeObject();
        Singleton singleton1 = readObject();
        Singleton singleton2 = readObject();
        System.out.println(singleton1 == singleton2);
    }

    public static Singleton readObject() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\xgw\\Desktop\\shea\\a.txt"));
        Singleton singleton = (Singleton) ois.readObject();
        ois.close();
        return singleton;
    }


    public static void writeObject() throws IOException {
        Singleton singleton = Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\xgw\\Desktop\\shea\\a.txt"));
        oos.writeObject(singleton);
        oos.close();
    }
}
