package org.yicheng;

import java.util.HashMap;

public class Admin extends Person{

    public static HashMap<String, Admin> admins;

    static{
        admins = new HashMap<>();
    }

    public Admin(String name) {
        super(name);
        admins.put(name, this);
        System.out.printf("New admin created: %s%n", name);
    }


}
