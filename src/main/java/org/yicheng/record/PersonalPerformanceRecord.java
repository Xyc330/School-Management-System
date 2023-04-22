package org.yicheng.record;

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
    public void addGrade(Grade grade){
        this.record.add(grade);
    }
    public void addGrade(String exam, Integer grade){
        this.record.add(new Grade(studentName, studentId, exam, grade));
    }
}
