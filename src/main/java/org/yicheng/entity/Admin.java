package org.yicheng.entity;

public class Admin extends Person{
    public Admin(){

    }

    public Admin(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
