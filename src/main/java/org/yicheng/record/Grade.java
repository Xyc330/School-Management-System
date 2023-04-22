package org.yicheng.record;

public class Grade {
    private String name;
    private Integer studentId;
    private String exam;
    private Integer grade;

    public Grade(String name, Integer id, String exam, Integer grade) {
        this.name = name;
        this.studentId = id;
        this.exam = exam;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getExam() {
        return exam;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getGrade() {
        return grade;
    }


    @Override
    public String toString() {
        return "Grade{" +
                "name='" + name + '\'' +
                ", id=" + studentId +
                ", exam='" + exam + '\'' +
                ", grade=" + grade +
                '}';
    }
}
