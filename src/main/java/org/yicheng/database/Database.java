package org.yicheng.database;

import org.yicheng.entity.Admin;
import org.yicheng.entity.Staff;
import org.yicheng.entity.Student;
import org.yicheng.entity.Teacher;

import java.util.HashMap;


public class Database {

    public static HashMap<Integer, Teacher> teachers = new HashMap<>();
    public static HashMap<Integer, Admin> admins = new HashMap<>();
    public static HashMap<Integer, Student> students = new HashMap<>();
    public static HashMap<Integer, Staff> staves = new HashMap<>();


}
