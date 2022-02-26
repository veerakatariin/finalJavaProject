package com.example.javafinalproject;
import java.util.List;

public class OnlineCourse extends Course{

    private String courseName;
    private String teacherName;
    private String location;
    private List<Student> courseList;

    public OnlineCourse(String courseName, String teacherName, String location, List<Student> courseList) {
        super(courseName, teacherName, location, courseList);
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.location = location;
        this.courseList = courseList;
    }

    public String getOnlineCourse(){
        return this.getCourseName();

    }

    public void setOnlineCourse(String course){

    }
    
}

