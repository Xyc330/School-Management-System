package org.yicheng;


public class ClientApp {

    public static void main(String[] args) {
        Student s1 = new Student("John", 1);
        Student s2 = new Student("Bob", 2);
        Student s3 = new Student("Sophia", 3);
        Student s4 = new Student("Carlos", 4);
        Student s5 = new Student("Olivia", 1);
        Student s6 = new Student("Ava", 4);

        Teacher t1 = new Teacher("Alice");
        Teacher t2 = new Teacher("William");

        // Teacher operations
        t1.addStudent(s1);
        t1.addStudent(s2);
        t1.addStudent(s3);
        t2.addStudent(s4);
        t2.addStudent(s5);
        t2.addStudent(s6);

        t1.changeStudentMark("John", 70);
        t1.changeStudentMark("Bob", 90);
        t1.changeStudentMark("Sophia", 95);
        t2.changeStudentMark("Carlos", 85);
        t2.changeStudentMark("Olivia", 70);
        t2.changeStudentMark("Ava", 60);
        // Invalid student name
        t1.changeStudentMark("Jack", 90);


        t1.printAllStudents(Teacher.SortingOptions.BY_MARK); // Sorting by mark
        t2.printAllStudents(Teacher.SortingOptions.BY_GRADE); // Sorting by grade

        t2.takeAttendance("Olivia", "Carlos"); // Olivia and Carlos are absent today
        s5.checkMyAttendance(); // let's check their absents


        // Student operations
        s1.checkMyMark();
        s1.checkMyAttendance();

        Staff st1 = new Staff("Joe", "Janitor");


        // Admin operations
        Admin adm = new Admin("Steve");
        adm.changeStudentAbsents("Carlos", 2);
        adm.getStudentAbsents("Carlos");
        adm.changeStudentMark("John", 80);
        adm.getStudentMark("John");

        // Adding student to teacher
        adm.addStudentToTeacher(new Student("Sergey", 5), "William");
        t2.printAllStudents(Teacher.SortingOptions.BY_NAME);

        // Removing student from a teacher
        adm.removeStudentFromTeacher("Carlos", "William");
        t2.printAllStudents(Teacher.SortingOptions.BY_NAME);

        // Changing role of a staff member
        adm.changeStaffRole("Joe", "Secretary");
    }

}
