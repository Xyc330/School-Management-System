package org.yicheng;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TeacherService {
    public static void createNewTeacher(String name){
        new Teacher(name);
    }
    public static void assignStudent(String teacherName, String studentName){
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
        System.out.printf("Assigned student %s to teacher %s!%n", studentName, teacherName);

    }

    public static int changeStudentMark(String teacherName, String studentName, int mark) {
        Teacher t = Teacher.getTeacher(teacherName);
        if(t == null) {
            System.out.println("No teacher found");
            return -1;
        }
        Student s = t.getStudent(studentName);
        if(s == null) {
            System.out.println("No student found");
            return -1;
        }

        s.setMark(mark);
        System.out.printf("Set student %s's mark to %d%n", studentName, mark);
        return s.getMark();
    }

    public static int getStudentMark(String teacherName, String studentName) {
        Teacher t = Teacher.getTeacher(teacherName);
        if(t == null) {
            System.out.println("No teacher found");
            return -1;
        }
        Student s = t.getStudent(studentName);
        if(s == null) {
            System.out.printf("No student found for the teacher %s%n", teacherName);
            return -1;
        }

        try {
            return StudentService.checkMyMark(studentName);
        }catch(Exception e){
            System.out.printf("Student %s not found%n", studentName);
            return -1;
        }
    }

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

    private static void markAbsence(String name) {
        Student s = Student.getStudent(name);
        if(s == null) {
            System.out.println("No student found");
            return;
        }
        s.setAbsents(s.getAbsents() + 1);
    }


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
