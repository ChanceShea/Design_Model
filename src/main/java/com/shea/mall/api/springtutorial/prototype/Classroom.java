package com.shea.mall.api.springtutorial.prototype;

import java.io.Serializable;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/4 14:24
 */
public class Classroom implements Cloneable, Serializable {

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public Classroom clone() {
        try {
            return (Classroom) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
