package org.yicheng;

import org.yicheng.database.Database;
import org.yicheng.record.Attendance;
import org.yicheng.admin.AdminService;
import org.yicheng.record.SummaryAttendanceRecord;
import org.yicheng.student.StudentDao;
import org.yicheng.student.StudentService;


public class ClientApp {
    public static void main(String[] args) {
        Integer student1Id = AdminService.createNewStudent("John");
//        AdminService.getAllStudents().forEach(System.out::println);

        AdminService.addAttendance("John", student1Id, "2023/04/06", Attendance.State.PRESENT);
        AdminService.addAttendance("John", student1Id, "2023/04/07", Attendance.State.LATE);
        AdminService.addPerformance("John", student1Id, "exam1", 80);
        AdminService.addPerformance("John", student1Id, "exam2", 85);




        // Testing create people
//        AdminService.createNewAdmin("Mrs.Smith");
//        AdminService.createNewTeacher("Mr.Senay");
//        AdminService.createNewStudent("John", 1, "Mr.Senay");
//        AdminService.createNewStudent("Alice", 1, "Mr.Senay");
//        AdminService.createNewStudent("Matthew", 1, "Mr.Senay");
//        AdminService.createNewStaff("Joe", "Janitor");
//
//        // Testing teacher actions
//        TeacherService.takeAttendance("Mr.Senay", "John");
//        TeacherService.setStudentMark("Alice", 89);
//        TeacherService.setStudentMark("Matthew", 86);
//        TeacherService.setStudentMark("John", 90);
//        TeacherService.getStudentMark("Alice");
//        TeacherService.printAllStudents("Mr.Senay", Teacher.SortingOptions.BY_NAME);
//
//        // Testing student actions
//        StudentService.getMyMark("Alice");
//        StudentService.getMyAttendance("John");
//
//
//        //// Testing Admin actions
//
//        // change role of a staff
//        AdminService.setStaffRole("Joe", "Secretary");
//
//        // Set student attendance
//        AdminService.setStudentAttendance("John", 0);
//
//        // remove student from teacher's class
//        AdminService.removeStudentFromTeacher("Matthew", "Mr.Senay");
//        TeacherService.printAllStudents("Mr.Senay", Teacher.SortingOptions.BY_NAME);
//
//        // remove people
//        AdminService.removeStudent("Bob"); // Invalid name
//        AdminService.removeStudent("Matthew");
//        AdminService.removeTeacher("Mr.Senay");
//        AdminService.removeStaff("Joe");
//        AdminService.removeAdmin("Mrs.Smith");
//
//
//
//        //// TESTING INVALID ARGUMENTS
//        AdminService.setStudentAttendance("Matthew", 4); // Student is already removed
//        AdminService.setStudentAttendance("John", -1); // Invalid absents
//        AdminService.setStudentMark("Alice", -10); // Invalid mark
//        TeacherService.takeAttendance("Mr.Lopez"); // Invalid teacher name




    }
}
