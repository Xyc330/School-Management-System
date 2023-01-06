package org.yicheng;

public class StudentService {


    // prints and returns the mark of a student, given their name
    public static int getMyMark(String name){
        Student s = Student.getStudent(name);
        if(s == null) {
            System.out.println("No student found");
            return -1;
        }
        System.out.printf("%s has a mark of %d%n", name, s.getMark());
        return s.getMark();
    }

    // prints and returns the number of times a student has been absent, given their name
    public static int getMyAttendance(String name) {
        Student s = Student.getStudent(name);
        if(s == null) {
            System.out.println("No student found");
            return -1;
        }

        System.out.printf("%s has been absent %d times%n", s.getName(), s.getAbsents());
        return s.getAbsents();
    }


}
