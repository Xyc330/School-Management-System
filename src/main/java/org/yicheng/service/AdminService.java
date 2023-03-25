package org.yicheng.service;

import org.yicheng.dao.*;
import org.yicheng.database.*;

import java.util.Optional;

public class AdminService {

    public static void createNewStudent(String name){
        StudentDao studentDao = new StudentDao();
        Student student = new Student();
        student.setId((int) Math.floor(Math.random()*Integer.MAX_VALUE));
        student.setName(name);
        studentDao.create(student);
    }

    // creates a new instance of a teacher
    public static void createNewTeacher(String name){
        TeacherDao teacherDao = new TeacherDao();
        Teacher teacher = new Teacher();
        teacher.setId((int) Math.floor(Math.random()*Integer.MAX_VALUE));
        teacher.setName(name);
        teacherDao.create(teacher);
    }
    // creates a new instance of a staff
    public static void createNewStaff(String name, String role){
        StaffDao staffDao = new StaffDao();
        Staff staff = new Staff();
        staff.setId((int) Math.floor(Math.random()*Integer.MAX_VALUE));
        staff.setName(name);
        staff.setRole(role);
        staffDao.create(staff);
    }
    // creates a new instance of an admin
    public static void createNewAdmin(String name){
        AdminDao adminDao = new AdminDao();
        Admin admin = new Admin();
        admin.setId((int) Math.floor(Math.random()*Integer.MAX_VALUE));
        admin.setName(name);
        adminDao.create(admin);
    }


    // The admin giveth, and the admin taketh away
    public static void removeStudent(Integer id){
        StudentDao studentDao = new StudentDao();
        studentDao.delete(id);
    }
    public static void removeTeacher(Integer id){
        TeacherDao teacherDao = new TeacherDao();
        teacherDao.delete(id);
    }
    public static void removeStaff(Integer id){
        StaffDao staffDao = new StaffDao();
        staffDao.delete(id);
    }
    public static void removeAdmin(Integer id){
        AdminDao adminDao = new AdminDao();
        adminDao.delete(id);
    }

    public static void setStaffRole(Integer id, String role){
        StaffDao staffDao = new StaffDao();
        Optional<Staff> s = staffDao.get(id);

        if(s.isPresent()){
            Staff newStaff = s.get();
            newStaff.setRole(role);
            staffDao.update(id, newStaff);
            System.out.printf("Staff %s's role set to %s%n", newStaff.getName(), role);
        }else{
            System.out.println("No staff found");
        }

    }

}
