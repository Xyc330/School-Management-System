package org.yicheng.database;

import org.yicheng.admin.Admin;
import org.yicheng.record.PersonalAttendanceRecord;
import org.yicheng.staff.Staff;
import org.yicheng.student.Student;
import org.yicheng.teacher.Teacher;

import java.util.HashMap;


public class Database {

    public static HashMap<Integer, Teacher> teachers = new HashMap<>();
    public static HashMap<Integer, Admin> admins = new HashMap<>();
    public static HashMap<Integer, Student> students = new HashMap<>();
    public static HashMap<Integer, Staff> staves = new HashMap<>();

}
