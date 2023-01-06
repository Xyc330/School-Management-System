package org.yicheng;

public class ClientApp {
    public static void main(String[] args) {
        TeacherService.createNewTeacher("Mr.Senay");
        StudentService.createNewStudent("John", 1, "Mr.Senay");
        StudentService.createNewStudent("Alice", 1, "Mr.Senay");
        StudentService.createNewStudent("Matthew", 1, "Mr.Senay");

        TeacherService.takeAttendance("Mr.Senay", "John");
        TeacherService.setStudentMark("Alice", 89);
        TeacherService.setStudentMark("Matthew", 86);
        TeacherService.setStudentMark("John", 90);

        TeacherService.printAllStudents("Mr.Senay", Teacher.SortingOptions.BY_NAME);

        StudentService.checkMyMark("Alice");
        StudentService.checkMyAttendance("John");


    }
}
