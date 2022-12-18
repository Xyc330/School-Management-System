package org.yicheng;

import java.util.*;

public class Teacher extends Person{
    public static enum SortingOptions{
        BY_NAME,
        BY_GRADE,
        BY_MARK
    }
    private final HashSet<Student> students;

    public Teacher(String name){
        super(name);
        this.students = new HashSet<>();
        School.addPerson(this);
    }

    public Teacher(String name, Student ...students){
        super(name);
        this.students = new HashSet<>();

        this.students.addAll(Arrays.asList(students));
    }


    // Accessing/Manipulating student info
    public void changeStudentMark(String name, int mark) {
        try {
            getStudent(name).setMark(mark);
        }catch(Exception e){
            System.out.printf("Student %s not found%n", name);
        }

    }

    public int getStudentMark(String name) {
        try {
            return getStudent(name).checkMyMark();
        }catch(Exception e){
            System.out.printf("Student %s not found%n", name);
            return -1;
        }
    }

    public Student getStudent(String name) {
        Iterator<Student> iter = this.students.iterator();
        Student current;
        while(iter.hasNext()) {
            current = iter.next();
            if(current.getName().equalsIgnoreCase(name)) {
                return current;
            }
        }

        return null;
    }

    public void takeAttendance(String ...absentStudentNames) {
        Iterator<Student> iter = this.students.iterator();
        Student current;
        System.out.println("Taking Attendance...");
        while(iter.hasNext()) {
            current = iter.next();
            for(String s : absentStudentNames) {
                if(current.getName().equalsIgnoreCase(s)) {
                    current.markAbsence();
                    System.out.printf("Marked %s as absent%n", s);
                }
            }
        }
    }


    public void printAllStudents(SortingOptions sortingOption) {
        List<Student> list = new ArrayList<>(this.students);


        // Sorting students depending on the sorting option chosen
        if(sortingOption == SortingOptions.BY_NAME) {
            list.sort(new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    return s1.getName().compareTo(s2.getName());
                }
            });
        }else if(sortingOption == SortingOptions.BY_GRADE) {
            list.sort(new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    if (s1.getGrade() != s2.getGrade()) {
                        return s1.getGrade() - s2.getGrade();
                    } else if (s1.getMark() != s2.getMark()) {
                        return s2.getMark() - s1.getMark();
                    } else {
                        return s1.getName().compareTo(s2.getName());
                    }
                }
            });
        }else if(sortingOption == SortingOptions.BY_MARK) {
            Collections.sort(list, new Comparator<Student>() {
                @Override
                public int compare(Student s1, Student s2) {
                    if(s1.getMark() != s2.getMark()) {
                        return s2.getMark() - s1.getMark();
                    }if(s1.getGrade() != s2.getGrade()) {
                        return s1.getGrade() - s2.getGrade();
                    }else {
                        return s1.getName().compareTo(s2.getName());
                    }
                }
            });
        }


        System.out.printf("%n------ALL STUDENTS OF PROFESSOR %s--------%n", this.name);
        System.out.println("Sorting " + sortingOption.toString());
        for(Student s : list) {
            System.out.printf("- %s | grade %d, mark: %d%n", s.getName(), s.getGrade(), s.getMark());
        }
        System.out.println();

    }


    public HashSet<Student> getStudents() {
        return students;
    }


    public void addStudent(Student student) {
        this.students.add(student);
        System.out.printf("%s added to the class of Professor %s%n", student.getName(), this.name);
    }
}
