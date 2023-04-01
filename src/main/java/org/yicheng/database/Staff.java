package org.yicheng.database;

public class Staff extends Person{

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




}