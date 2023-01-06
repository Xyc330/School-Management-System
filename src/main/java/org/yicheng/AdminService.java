package org.yicheng;

import java.util.Iterator;

public class AdminService {
    // These methods create a new instance of a student provided with their name and grade
    // Adding their teacher is optional
    public static void createNewStudent(String name, int grade){
        new Student(name, grade);
    }
    public static void createNewStudent(String studentName, int grade, String teacherName){
        new Student(studentName, grade);
        AdminService.assignStudentToTeacher(studentName, teacherName);
    }

    // creates a new instance of a teacher
    public static void createNewTeacher(String name){
        new Teacher(name);
    }
    // creates a new instance of a staff
    public static void createNewStaff(String name, String role){
        new Staff(name, role);
    }
    // creates a new instance of an admin
    public static void createNewAdmin(String name){
        new Admin(name);
    }


    // The admin giveth, and the admin taketh away
    public static void removeStudent(String name){
        if(Student.students.remove(name) == null){
            System.out.printf("Could not remove student %s%n", name);
        }
        System.out.printf("Removed student %s", name);
    }
    public static void removeTeacher(String name){
        if(Teacher.teachers.remove(name) == null){
            System.out.printf("Could not remove teacher %s%n", name);
        }
        System.out.printf("Removed teacher %s", name);
    }
    public static void removeStaff(String name){
        if(Staff.staves.remove(name) == null){
            System.out.printf("Could not remove staff %s%n", name);
        }
        System.out.printf("Removed staff %s", name);
    }
    public static void removeAdmin(String name){
        if(Admin.admins.remove(name) == null){
            System.out.printf("Could not remove admin %s%n", name);
        }
        System.out.printf("Removed admin %s", name);
    }


    public static int getStudentMark(String name) {
        return StudentService.getMyMark(name);
    }
    public static void setStudentMark(String name, int mark) {
        TeacherService.setStudentMark(name, mark);
    }

    public static int getStudentAttendance(String name) {
        return StudentService.getMyAttendance(name);
    }

    // Directly sets the number of absences of a student
    public static void setStudentAttendance(String name, int absents){
        Student s = Student.getStudent(name);
        if(s == null) {
            System.out.println("No student found");
            return;
        }
        s.setAbsents(absents);
        System.out.printf("Student %s's absents set to %d%n", name, absents);
    }

    // assigns a student to the class of a teacher, provided both their names
    public static void assignStudentToTeacher(String studentName, String teacherName){
        Teacher t = Teacher.getTeacher(teacherName);
        if(t == null) {
            System.out.println("No teacher found");
            return;
        }
        Student s = Student.getStudent(studentName);
        if(s == null) {
            System.out.println("No student found");
            return;
        }

        t.students.add(s);
        System.out.printf("Assigned student %s to teacher %s%n", studentName, teacherName);
    }

    // removes a student from the class of a teacher
    public static void removeStudentFromTeacher(String studentName, String teacherName) {
        Teacher t = Teacher.getTeacher(teacherName);
        if(t == null) {
            System.out.println("No teacher found");
            return;
        }
        Student s = Student.getStudent(studentName);
        if(s == null) {
            System.out.println("No student found");
            return;
        }

        t.students.remove(s);
        System.out.printf("Removed student %s from teacher %s%n", studentName, teacherName);
    }

    public static void setStaffRole(String name, String role){
        Staff s = Staff.getStaff(name);
        if (s == null) {
            System.out.println("No staff found");
            return;
        }

        s.setRole(role);
        System.out.printf("Staff %s's role set to %s", name, role);
    }

}
