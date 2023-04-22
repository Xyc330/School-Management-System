package org.yicheng.student;

import org.yicheng.entity.Person;
import org.yicheng.record.PersonalAttendanceRecord;
import org.yicheng.record.PersonalPerformanceRecord;

public class Student extends Person {
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
