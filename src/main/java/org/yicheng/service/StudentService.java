package org.yicheng.service;



import org.yicheng.dao.StudentDao;

import org.yicheng.entity.record.Attendance;
import org.yicheng.entity.record.Grade;


import java.util.Optional;

public class StudentService {


    public static Attendance getLastAttendance(Integer studentId){
        StudentDao studentDao = new StudentDao();
        Attendance att = studentDao.getLastAttendance(studentId);
        System.out.println(att);
        return att;
    }

    public static Attendance getAttendance(Integer studentId, String date){
        StudentDao studentDao = new StudentDao();
        Optional<Attendance> att = studentDao.getAttendance(studentId, date);
        if(att.isPresent()){
            System.out.println(att.get());
            return att.get();
        }
        System.out.println("No attendance date found");
        return null; // This is probably not good
    }

    public static Grade getLastGrade(Integer studentId){
        StudentDao studentDao = new StudentDao();
        Grade g = studentDao.getLastGrade(studentId);
        System.out.println(g);
        return g;
    }

    public static Grade getGrade(Integer studentId, String exam){
        StudentDao studentDao = new StudentDao();
        Optional<Grade> g = studentDao.getPerformance(studentId, exam);
        if(g.isPresent()){
            System.out.println(g.get());
            return g.get();
        }
        System.out.println("No exam found");
        return null; // This is probably not good
    }



}
