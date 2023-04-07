package org.yicheng.entity;

import org.yicheng.entity.record.PersonalAttendanceRecord;
import org.yicheng.entity.record.PersonalPerformanceRecord;

public class Student extends Person{
    private PersonalAttendanceRecord attendanceRecord;
    private PersonalPerformanceRecord performanceRecord;
    public Student(){
        this.attendanceRecord = new PersonalAttendanceRecord(this.name, this.id);
        this.performanceRecord = new PersonalPerformanceRecord(this.name, this.id);
    }

    public Student(String name) {
        super(name);
    }

    public PersonalAttendanceRecord getAttendanceRecord() {
        return attendanceRecord;
    }

    public PersonalPerformanceRecord getPerformanceRecord() {
        return performanceRecord;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
