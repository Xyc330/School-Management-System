package org.yicheng.service;

import org.yicheng.dao.*;
import org.yicheng.database.*;

import java.util.Optional;
import java.util.Set;

public class AdminService {

    public static int createNewStudent(String name){
        StudentDao studentDao = new StudentDao();
        Student student = new Student();
        int id = (int) Math.floor(Math.random()*Integer.MAX_VALUE);
        student.setId(id);
        student.setName(name);
        studentDao.create(student);
        return id;
    }

    // creates a new instance of a teacher
    public static int createNewTeacher(String name){
        TeacherDao teacherDao = new TeacherDao();
        Teacher teacher = new Teacher("teacherName");
        int id = (int) Math.floor(Math.random()*Integer.MAX_VALUE);
        teacher.setId(id);
        teacher.setName(name);
        teacherDao.create(teacher);
        return id;
    }
    // creates a new instance of a staff
    public static int createNewStaff(String name, String role){
        StaffDao staffDao = new StaffDao();
        Staff staff = new Staff();
        int id = (int) Math.floor(Math.random()*Integer.MAX_VALUE);
        staff.setId(id);
        staff.setName(name);
        staff.setRole(role);
        staffDao.create(staff);
        return id;
    }
    // creates a new instance of an admin
    public static int createNewAdmin(String name){
        AdminDao adminDao = new AdminDao();
        Admin admin = new Admin();
        int id = (int) Math.floor(Math.random()*Integer.MAX_VALUE);
        admin.setId(id);
        admin.setName(name);
        adminDao.create(admin);
        return id;
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

    // Retrieve

    public static Set<Student> getAllStudents(){
        StudentDao sd = new StudentDao();
        return sd.getAll();
    }

    public static Set<Teacher> getAllTeachers(){
        TeacherDao td = new TeacherDao();
        return td.getAll();
    }

    public static Set<Staff> getAllStaves(){
        StaffDao sd = new StaffDao();
        return sd.getAll();
    }

    public static Set<Admin> getAllAdmins(){
        AdminDao ad = new AdminDao();
        return ad.getAll();
    }

}
