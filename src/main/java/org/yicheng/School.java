package org.yicheng;


import java.util.HashSet;


public class School {

    private static final HashSet<Student> students;
    private static final HashSet<Staff> staves;
    private static final HashSet<Teacher> teachers;
    private static final HashSet<Admin> admins;

    static {
        students = new HashSet<>();
        staves = new HashSet<>();
        teachers = new HashSet<>();
        admins = new HashSet<>();
    }



    public static void addPerson(Person p) {
        if(p instanceof Student) {
            students.add((Student) p);
        }
        else if(p instanceof Teacher) {
            teachers.add((Teacher) p);
        }
        else if(p instanceof Staff) {
            staves.add((Staff) p);
        }
        else if(p instanceof Admin) {
            admins.add((Admin) p);
        }
    }

    public static HashSet<Student> getStudents(){
        return students;
    }
    public static HashSet<Staff> getStaves(){
        return staves;
    }
    public static HashSet<Teacher> getTeachers(){
        return teachers;
    }
    public static HashSet<Admin> getAdmins(){
        return admins;
    }


}
