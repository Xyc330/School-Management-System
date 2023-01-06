package org.yicheng;

public class StudentService {

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
    public int MarkAbsence(String name) {
        Student s = Student.getStudent(name);
        if(s == null) {
            System.out.println("No student found");
            return -1;
        }
        s.setAbsents(s.getAbsents() + 1);
        return s.getAbsents();
    }


}
