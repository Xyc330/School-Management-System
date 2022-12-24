package org.yicheng;


public class Student extends Person{

    private int grade;
    private int mark;
    private int absents;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
        this.mark = -1;
        this.absents = 0;
        School.addPerson(this);
    }


    public int checkMyMark() {
        System.out.printf("%s's mark is %d%n", this.name, this.mark);
        return this.mark;
    }

    public void checkMyAttendance() {
        System.out.printf("%s has been absent %d times.%n", this.name, this.getAbsents());
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getAbsents() {
        return absents;
    }

    public void setAbsents(int absents) {
        this.absents = absents;
    }

    public void markAbsence() {
        this.absents += 1;
    }


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
