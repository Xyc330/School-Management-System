package org.yicheng.entity.record;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.LinkedList;

public abstract class PersonalRecord {
    private String studentName;
    private Integer studentId;

    public PersonalRecord(String studentName, Integer studentId){
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public abstract void add();

    public abstract void remove();

}
