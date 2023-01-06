package org.yicheng;

public class StudentService {
    public static void createNewStudent(String name, int grade){
        new Student(name, grade);
    }
    public static void createNewStudent(String name, int grade, String teacher){
        new Student(name, grade);
        TeacherService.assignStudent(teacher, name);
    }

    public static int checkMyMark(String name){
        Student s = Student.getStudent(name);
        if(s == null) {
            System.out.println("No student found");
            return -1;
        }

        return s.getMark();
    }

    public int checkMyAttendance(String name) {
        Student s = Student.getStudent(name);
        if(s == null) {
            System.out.println("No student found");
            return -1;
        }

        System.out.printf("%s has been absent %d times.%n", s.getName(), s.getAbsents());
        return s.getAbsents();
    }

    // Shouldn't these be in TeacherService?



}
