package org.yicheng.staff;

import org.yicheng.entity.Person;

public class Staff extends Person {

    private String role;
    public Staff(){

    }

    public Staff(String name) {
        super(name);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "Staff{" +
                "role='" + role + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}