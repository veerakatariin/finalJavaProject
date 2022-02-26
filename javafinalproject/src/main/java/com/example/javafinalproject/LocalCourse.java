package com.example.javafinalproject;
import java.util.List;


public class LocalCourse extends Course {

    private String courseName;
    private String teacherName;
    private String location;
    private List<Student> studentList;

    public LocalCourse(String courseName, String teacherName, String location, List<Student> studentList) {
        super(courseName, teacherName, location, studentList);

        this.courseName = courseName;
        this.teacherName = teacherName;
        this.location = location;
        this.studentList = studentList;
    }

    public String getLocalCourse(){

        return( this.courseName.toString() + this.location.toString());
    }

    public void setLocalCourse(){

    }

    @Override
    public boolean addStudentList(Student newStudent){

        if(studentList.size()>24){
            return false;
        } else{
            this.studentList.add(newStudent);
            return true;
        }
    }
    
}



//extends course
//getterit ja setterit 
//max 25 opiskelijaa kurssille, tarkistetaan onnistuuko lisääminen ja palautetaan boolean
//opiskelijan lisääminen ylikirjoitetaan course luokasta

//ehkä palauttaa myös luokkatilan numeron??
//palauttamiseen käytetään tostring metodia 
