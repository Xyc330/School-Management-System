package org.yicheng.teacher;

import org.yicheng.entity.Person;

public class Teacher extends Person {

    public Teacher(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}