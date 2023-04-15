package org.yicheng.entity.record;

import java.util.LinkedList;

public class PersonalPerformanceRecord {
    private String studentName;
    private Integer studentId;
    private LinkedList<Grade> record;

    public PersonalPerformanceRecord(String studentName, Integer studentId){
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

    public LinkedList<Grade> getRecord() {
        return record;
    }

    public void setRecord(LinkedList<Grade> record) {
        this.record = record;
    }
}
