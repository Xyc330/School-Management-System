package org.yicheng.teacher;


public class TeacherService {

//
//    // Prints all the students of a teacher in one of three ways, sorting by name, by mark or by grade
//    public static void printAllStudents(String teacherName, Teacher.SortingOptions sortingOption) {
//        Teacher t = Teacher.getTeacher(teacherName);
//        if (t == null) {
//            System.out.println("No teacher found");
//            return;
//        }
//        List<Student> list = new ArrayList<>(t.students);
//
//
//        // Sorting students depending on the sorting option chosen
//        if (sortingOption == Teacher.SortingOptions.BY_NAME) {
//            list.sort(Comparator.comparing(Person::getName));
//        } else if (sortingOption == Teacher.SortingOptions.BY_GRADE) {
//            list.sort((s1, s2) -> {
//                if (s1.getGrade() != s2.getGrade()) {
//                    return s1.getGrade() - s2.getGrade();
//                } else if (s1.getMark() != s2.getMark()) {
//                    return s2.getMark() - s1.getMark();
//                } else {
//                    return s1.getName().compareTo(s2.getName());
//                }
//            });
//        } else if (sortingOption == Teacher.SortingOptions.BY_MARK) {
//            list.sort((s1, s2) -> {
//                if (s1.getMark() != s2.getMark()) {
//                    return s2.getMark() - s1.getMark();
//                }
//                if (s1.getGrade() != s2.getGrade()) {
//                    return s1.getGrade() - s2.getGrade();
//                } else {
//                    return s1.getName().compareTo(s2.getName());
//                }
//            });
//        }
//
//        System.out.printf("%n------ALL STUDENTS OF PROFESSOR %s--------%n", t.getName());
//        System.out.println("Sorting " + sortingOption.toString());
//        for(Student s : list) {
//            System.out.printf("- %s | grade %d, mark: %d%n", s.getName(), s.getGrade(), s.getMark());
//        }
//        System.out.println();
//    }

}
