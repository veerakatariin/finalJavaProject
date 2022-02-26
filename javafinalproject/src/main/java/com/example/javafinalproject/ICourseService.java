package com.example.javafinalproject;
import java.util.List;

public interface ICourseService {

    List<Student> getStudents(); 

    List<Course> getCourses(); 

    Student getStudentById(long studentId); 

    Course getCourseById(long courseId); 

    List<Course> getCourseOfStudent(long studentId);

    boolean addStudentToCourse(long studentId, long courseId);


}