package com.example.springbootrestapi.bean;

public class Student {
    private int stuId;
    private String stuName;
    private  String stuSchool;

    public Student(int stuId, String stuName, String stuSchool) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuSchool = stuSchool;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSchool() {
        return stuSchool;
    }

    public void setStuSchool(String stuSchool) {
        this.stuSchool = stuSchool;
    }
}
