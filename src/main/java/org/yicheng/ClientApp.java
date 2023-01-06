package org.yicheng;

public class ClientApp {
    public static void main(String[] args) {
        AdminService.createNewAdmin("Mrs.Smith");

        AdminService.createNewTeacher("Mr.Senay");
        AdminService.createNewStudent("John", 1, "Mr.Senay");
        AdminService.createNewStudent("Alice", 1, "Mr.Senay");
        AdminService.createNewStudent("Matthew", 1, "Mr.Senay");

        TeacherService.takeAttendance("Mr.Senay", "John");
        TeacherService.setStudentMark("Alice", 89);
        TeacherService.setStudentMark("Matthew", 86);
        TeacherService.setStudentMark("John", 90);

        TeacherService.printAllStudents("Mr.Senay", Teacher.SortingOptions.BY_NAME);

        StudentService.getMyMark("Alice");
        StudentService.getMyAttendance("John");

        AdminService.createNewStaff("Joe", "Janitor");

        AdminService.removeTeacher("Mr.Senay");


    }
}
