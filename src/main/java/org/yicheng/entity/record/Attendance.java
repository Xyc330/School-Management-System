package org.yicheng.entity.record;

public class Attendance {
    public enum State{
        PRESENT,
        LATE,
        ABSENT
    }
    private String name;
    private Integer studentId;
    private String date;
    private State state;

    public Attendance(String name, Integer studentId, String date, State state) {
        this.name = name;
        this.studentId = studentId;
        this.date = date;
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", state=" + state +
                '}';
    }
}
