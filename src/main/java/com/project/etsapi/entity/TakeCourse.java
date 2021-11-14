package com.project.etsapi.entity;

public class TakeCourse {
    private String student_ID;
    private String course_ID;
    private boolean authority;

    public TakeCourse(String student_ID, String course_ID, boolean authority) {
        this.student_ID = student_ID;
        this.course_ID = course_ID;
        this.authority = authority;
    }

    public TakeCourse() {

    }

    public String getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(String student_ID) {
        this.student_ID = student_ID;
    }

    public String getCourse_ID() {
        return course_ID;
    }

    public void setCourse_ID(String course_ID) {
        this.course_ID = course_ID;
    }

    public boolean isAuthority() {
        return authority;
    }

    public void setAuthority(boolean authority) {
        this.authority = authority;
    }
}