package org.yicheng;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TeacherService {



    // changes a student's mark, given their name
    public static void setStudentMark(String studentName, int mark) {
        Student s = Student.getStudent(studentName);
        if(s == null) {
            System.out.println("No student found");
            return;
        }

        s.setMark(mark);
        System.out.printf("Set student %s's mark to %d%n", studentName, mark);
    }

    // Prints the mark of a student given their name
    public static int getStudentMark(String studentName) {
        try {
            return StudentService.getMyMark(studentName);
        }catch(Exception e){
            System.out.printf("Student %s not found%n", studentName);
            return -1;
        }
    }

    // Given the name of the teacher and an array of absent students, marks one absence in their records
    public static void takeAttendance(String teacherName, String ...absentStudentNames) {
        Teacher t = Teacher.getTeacher(teacherName);
        if(t == null) {
            System.out.println("No teacher found");
            return;
        }

        Iterator<Student> iter = t.students.iterator();
        Student current;
        System.out.println("Taking Attendance...");
        while(iter.hasNext()) {
            current = iter.next();
            for(String s : absentStudentNames) {
                if(current.getName().equalsIgnoreCase(s)) {
                    markAbsence(current.getName());
                    System.out.printf("Marked %s as absent%n", s);
                }
            }
        }


    }

    // Marks one absence for a student
    private static void markAbsence(String name) {
        Student s = Student.getStudent(name);
        if(s == null) {
            System.out.println("No student found");
            return;
        }
        s.setAbsents(s.getAbsents() + 1);
    }

    // Prints all the students of a teacher in one of three ways, sorting by name, by mark or by grade
    public static void printAllStudents(String teacherName, Teacher.SortingOptions sortingOption) {
        Teacher t = Teacher.getTeacher(teacherName);
        if (t == null) {
            System.out.println("No teacher found");
            return;
        }
        List<Student> list = new ArrayList<>(t.students);


        // Sorting students depending on the sorting option chosen
        if (sortingOption == Teacher.SortingOptions.BY_NAME) {
            list.sort(Comparator.comparing(Person::getName));
        } else if (sortingOption == Teacher.SortingOptions.BY_GRADE) {
            list.sort((s1, s2) -> {
                if (s1.getGrade() != s2.getGrade()) {
                    return s1.getGrade() - s2.getGrade();
                } else if (s1.getMark() != s2.getMark()) {
                    return s2.getMark() - s1.getMark();
                } else {
                    return s1.getName().compareTo(s2.getName());
                }
            });
        } else if (sortingOption == Teacher.SortingOptions.BY_MARK) {
            list.sort((s1, s2) -> {
                if (s1.getMark() != s2.getMark()) {
                    return s2.getMark() - s1.getMark();
                }
                if (s1.getGrade() != s2.getGrade()) {
                    return s1.getGrade() - s2.getGrade();
                } else {
                    return s1.getName().compareTo(s2.getName());
                }
            });
        }

        System.out.printf("%n------ALL STUDENTS OF PROFESSOR %s--------%n", t.name);
        System.out.println("Sorting " + sortingOption.toString());
        for(Student s : list) {
            System.out.printf("- %s | grade %d, mark: %d%n", s.getName(), s.getGrade(), s.getMark());
        }
        System.out.println();
    }

}
