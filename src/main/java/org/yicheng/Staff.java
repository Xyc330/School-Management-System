package org.yicheng;

import java.util.HashMap;

public class Staff extends Person{

    private String role;
    public static HashMap<String, Staff> staves;

    static{
        staves = new HashMap<>();
    }

    public Staff(String name, String role) {
        super(name);
        this.role = role;
        staves.put(name, this);
        System.out.printf("New Staff created: %s, role: %s%n", name, role);
    }

    public static Staff getStaff(String name){
        return staves.get(name);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }




}