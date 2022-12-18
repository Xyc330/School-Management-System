package org.yicheng;

import java.util.Iterator;

public class Admin extends Person{

    public Admin(String name) {
        super(name);
        School.addPerson(this);
    }


    // Methods for finding a person in the school
    private static Student getStudentFromSchool(String name) {
        Iterator<Student> iter = School.getStudents().iterator();
        Student current;
        while(iter.hasNext()) {
            current = iter.next();
            if(current.getName().equalsIgnoreCase(name)) {
                return current;
            }
        }
        return null;
    }
    private static Teacher getTeacherFromSchool(String name) {
        Iterator<Teacher> iter = School.getTeachers().iterator();
        Teacher current;
        while(iter.hasNext()) {
            current = iter.next();
            if(current.getName().equalsIgnoreCase(name)) {
                return current;
            }
        }
        return null;
    }
    private static Staff getStaffFromSchool(String name) {
        Iterator<Staff> iter = School.getStaves().iterator();
        Staff current;
        while(iter.hasNext()) {
            current = iter.next();
            if(current.getName().equalsIgnoreCase(name)) {
                return current;
            }
        }
        return null;
    }

    // Accessing/Manipulating student info
    public void getStudentMark(String name) {
        try {
            int mark = getStudentFromSchool(name).checkMyMark();
            System.out.printf("Student %s has a mark of %d%n", name, mark);
        }catch(Exception e) {
            System.out.printf("Student %s not found%n", name);
        }
    }

    public void changeStudentMark(String name, int mark) {
        try {
            getStudentFromSchool(name).setMark(mark);
            System.out.printf("Changed %s's mark to %d%n", name, mark);
        }catch(Exception e){
            System.out.printf("Student %s not found%n", name);
        }
    }

    public void getStudentAbsents(String name) {
        try {
            getStudentFromSchool(name).checkMyAttendance();
        }catch(Exception e){
            System.out.printf("Student %s not found%n", name);
        }
    }

    public void changeStudentAbsents(String name, int absents) {
        try {
            getStudentFromSchool(name).setAbsents(absents);
            System.out.printf("Changed %s\'s absents to %d%n", name, absents);
        }catch(Exception e){
            System.out.printf("Student %s not found%n", name);
        }
    }

    // Accessing/Manipulating Teacher info
    public void addStudentToTeacher(Student student, String teacherName) {
        try {
            getTeacherFromSchool(teacherName).addStudent(student);
            System.out.printf("Added Student %s to the class of Professor %s%n", student.getName(), teacherName);
        }catch(Exception e){
            System.out.printf("Teacher %s not found%n", name);
        }
    }

    public void removeStudentFromTeacher(String studentName, String teacherName) {
        try {
            Student s = getStudentFromSchool(studentName);
            Teacher t = getTeacherFromSchool(teacherName);
            assert t != null; // The IDE suggested this I have no idea what this is
            t.getStudents().remove(s);
            System.out.printf("Removed Student %s from the class of Professor %s%n", studentName, teacherName);
        }catch(Exception e){
            System.out.printf("Teacher %s or Student %s not found%n", teacherName, studentName);
        }
    }


    // Accessing/Manipulating Staff info
    public void changeStaffRole(String staffName, String role) {
        try {
            getStaffFromSchool(staffName).setRole(role);
            System.out.printf("Set the role of staff member %s to %s", staffName, role);
        }catch(Exception e){
            System.out.printf("Staff %s not found%n", staffName);
        }
    }

}
