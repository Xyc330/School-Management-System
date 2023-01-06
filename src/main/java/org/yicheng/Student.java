package org.yicheng;
import java.util.HashMap;
public class Student extends Person{
    private int grade;
    private int mark;
    private int absents;
    public static final HashMap<String, Student> students;

    static{
        students = new HashMap<>();
    }
    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
        this.mark = 0;
        this.absents = 0;
        students.put(name, this);
        System.out.printf("New student created: %s, grade: %d%n", name, grade);
    }

    public static Student getStudent(String name){
        return students.get(name);
    }
    public int getGrade() {return grade;}

    public void setGrade(int grade) {this.grade = grade;}

    public int getMark() {return mark;}

    public void setMark(int mark) {this.mark = mark;}

    public int getAbsents() {return absents;}

    public void setAbsents(int absents) {this.absents = absents;}

    public int hashcode() {
        return this.name.hashCode();
    }

    public boolean equals(Object o) {
        if(o instanceof Student s) {
            return s.name.equals(this.name);
        }else {
            return false;
        }
    }



}
