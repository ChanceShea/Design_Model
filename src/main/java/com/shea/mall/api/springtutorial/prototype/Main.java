package com.shea.mall.api.springtutorial.prototype;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/3 20:35
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Classroom classroom = new Classroom();
        Student stu = new Student();
        stu.setName("Shea");
        classroom.setStudent(stu);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\xgw\\Desktop\\shea\\a.txt"));
        oos.writeObject(classroom);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\xgw\\Desktop\\shea\\a.txt"));
        Classroom clone = (Classroom) ois.readObject();
        ois.close();
        oos.close();
        clone.getStudent().setName("Shea11");
        System.out.println("原对象:" + classroom.getStudent().getName());
        System.out.println("克隆对象:" + clone.getStudent().getName());
    }
}
