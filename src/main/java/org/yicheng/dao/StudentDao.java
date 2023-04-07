package org.yicheng.dao;

import org.yicheng.entity.Student;
import org.yicheng.database.Database;
import org.yicheng.entity.record.Attendance;
import org.yicheng.entity.record.Grade;

import java.util.Optional;

public class StudentDao extends BaseDao<Student> {
    public StudentDao(){
        super.map = Database.students;
    }

    public void addAttendance(Attendance att){
        Student student = Database.students.get(att.getStudentId());
        student.getAttendanceRecord().getRecord().add(att);
    }

    public void addPerformance(Grade g){
        Student student = Database.students.get(g.getStudentId());
        student.getPerformanceRecord().getRecord().add(g);
    }

    public Optional<Attendance> getAttendance(Integer studentId, String date){
        Student student = Database.students.get(studentId);
        Optional<Attendance> res = Optional.empty();
        for(Attendance att : student.getAttendanceRecord().getRecord()){
            if(att.getDate().equalsIgnoreCase(date)){
                res = Optional.of(att);
                break;
            }
        }
        return res;
    }

    public Optional<Grade> getPerformance(Integer studentId, String exam){
        Student student = Database.students.get(studentId);
        Optional<Grade> res = Optional.empty();
        for(Grade g : student.getPerformanceRecord().getRecord()){
            if(g.getExam().equalsIgnoreCase(exam)){
                res = Optional.of(g);
                break;
            }
        }
        return res;
    }

    public Attendance getLastAttendance(Integer studentId){
        Student student = Database.students.get(studentId);
        return student.getAttendanceRecord().getRecord().getLast();
    }

    public Grade getLastGrade(Integer studentId){
        Student student = Database.students.get(studentId);
        return student.getPerformanceRecord().getRecord().getLast();
    }
}
