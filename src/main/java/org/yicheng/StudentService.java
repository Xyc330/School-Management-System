package org.yicheng;

public class StudentService {
    // These methods create a new instance of a student provided with their name and grade
    // Adding their teacher is optional
    public static void createNewStudent(String name, int grade){
        new Student(name, grade);
    }
    public static void createNewStudent(String name, int grade, String teacher){
        new Student(name, grade);
        TeacherService.assignStudent(teacher, name);
    }

    // prints and returns the mark of a student, given their name
    public static int checkMyMark(String name){
        Student s = Student.getStudent(name);
        if(s == null) {
            System.out.println("No student found");
            return -1;
        }
        System.out.printf("%s has a mark of %d%n", name, s.getMark());
        return s.getMark();
    }

    // prints and returns the number of times a student has been absent, given their name
    public static int checkMyAttendance(String name) {
        Student s = Student.getStudent(name);
        if(s == null) {
            System.out.println("No student found");
            return -1;
        }

        System.out.printf("%s has been absent %d times.%n", s.getName(), s.getAbsents());
        return s.getAbsents();
    }


}
