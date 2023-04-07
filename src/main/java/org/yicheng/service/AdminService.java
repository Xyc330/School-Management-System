package org.yicheng.service;

import org.yicheng.dao.*;
import org.yicheng.entity.Admin;
import org.yicheng.entity.Staff;
import org.yicheng.entity.Student;
import org.yicheng.entity.Teacher;
import org.yicheng.entity.record.Attendance;
import org.yicheng.entity.record.Grade;


import java.util.Optional;
import java.util.Set;

public class AdminService {

    public static Integer createNewStudent(String name){
        StudentDao studentDao = new StudentDao();
        Student student = new Student();
        Integer id = (int) Math.floor(Math.random()*Integer.MAX_VALUE);
        student.setId(id);
        student.setName(name);
        studentDao.create(student);
        System.out.println("New student created: " + student);
        return id;
    }

    // creates a new instance of a teacher
    public static Integer createNewTeacher(String name){
        TeacherDao teacherDao = new TeacherDao();
        Teacher teacher = new Teacher("teacherName");
        Integer id = (int) Math.floor(Math.random()*Integer.MAX_VALUE);
        teacher.setId(id);
        teacher.setName(name);
        teacherDao.create(teacher);
        System.out.println("New teacher created: " + teacher);
        return id;
    }
    // creates a new instance of a staff
    public static Integer createNewStaff(String name, String role){
        StaffDao staffDao = new StaffDao();
        Staff staff = new Staff();
        Integer id = (int) Math.floor(Math.random()*Integer.MAX_VALUE);
        staff.setId(id);
        staff.setName(name);
        staff.setRole(role);
        staffDao.create(staff);
        System.out.println("New staff created: " + staff);
        return id;
    }
    // creates a new instance of an admin
    public static Integer createNewAdmin(String name){
        AdminDao adminDao = new AdminDao();
        Admin admin = new Admin();
        Integer id = (int) Math.floor(Math.random()*Integer.MAX_VALUE);
        admin.setId(id);
        admin.setName(name);
        adminDao.create(admin);
        System.out.println("New admin created: " + admin);
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

    // Attendance

    public static void addAttendance(String studentName, Integer studentId, String date, Attendance.State state){
        StudentDao dao = new StudentDao();
        Attendance newAttendance = new Attendance(studentName, studentId, date, state);
        dao.addAttendance(newAttendance);
        System.out.println("New attendance added: " + newAttendance);
    }

    // Performance
    public static void addPerformance(String studentName, Integer studentId, String exam, Integer grade){
        StudentDao dao = new StudentDao();
        Grade newGrade = new Grade(studentName, studentId, exam, grade);
        dao.addPerformance(newGrade);
        System.out.println("New grade added: " + newGrade);
    }

    // Retrieve

    public static Optional<Student> getStudentById(Integer id){
        StudentDao sd = new StudentDao();
        return sd.get(id);
    }

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
