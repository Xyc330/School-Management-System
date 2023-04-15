package org.yicheng.entity.record;

import java.util.LinkedList;
import java.util.Objects;

public class PersonalAttendanceRecord{
    private String studentName;
    private Integer studentId;
    private LinkedList<Attendance> record;

    public PersonalAttendanceRecord(String studentName, Integer studentId){
        this.studentName = studentName;
        this.studentId = studentId;
        this.record = new LinkedList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public LinkedList<Attendance> getRecord() {
        return record;
    }

    public void setRecord(LinkedList<Attendance> record) {
        this.record = record;
    }
}
