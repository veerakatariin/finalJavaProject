package com.example.javafinalproject;
import java.util.List;
import java.util.ArrayList;


public class Course {

    private long automaticID = 0;
    private long counter = 0;
    private List<Student> studentList = new ArrayList<>();
    private String courseName; 
    private String teacherName;
    private String location;
    


    public Course(String courseName, String teacherName, String location, List<Student> studentList){

        this.courseName = courseName;
        this.teacherName = teacherName;
        counter = counter + 1;
        this.automaticID = counter;
    }

    public List<Student> getStudentList(){

        return this.studentList;
    }

    public void setStudentList(List<Student> studentList){

        this.studentList = studentList;
    }

    public boolean addStudentList(Student newStudent){

        if(studentList.size()>24){
            return false;
        } else{
            this.studentList.add(newStudent);
            return true;
        }
    }

    public String getCourseName(){

        return this.courseName;
    }
    
    public void setCourseName(String name){

        this.courseName = name;
    }

    public String getTeacherName(){

        return this.teacherName;
    }

    public void setTeacherName(String name){

        this.teacherName = name;
    }

    public long getAutomaticID(){

        return this.automaticID;
    }

    
}