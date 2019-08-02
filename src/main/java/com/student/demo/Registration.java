package com.student.demo;


public class student {
    private Long id;
    private String studentName;
    

    public student(String studentName, double latitude, double longitude) {
        this.studentName = studentName;

    }

    public student(String universityName, String location, int capacity) {
        this.studentName = universityName;

    }

    private student() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;

    }

    public String getstudentName() {
        return studentName;
    }

    public void setUniversityName(String universityName) {
        this.studentName = studentName;

}


}
