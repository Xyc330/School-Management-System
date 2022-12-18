package org.yicheng;

public class Staff extends Person{

    private String role;

    public Staff(String name, String role) {
        super(name);
        this.role = role;

        School.addPerson(this);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



}