package org.yicheng;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Iterator;

public class Teacher extends Person{

    public enum SortingOptions{
        BY_NAME,
        BY_GRADE,
        BY_MARK
    }
    public final HashSet<Student> students;
    public static HashMap<String, Teacher> teachers;

    static{
        teachers = new HashMap<>();
    }

    public Teacher(String name){
        super(name);
        this.students = new HashSet<>();
        teachers.put(name, this);
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

    public static Teacher getTeacher(String name){
        return teachers.get(name);
    }


}
