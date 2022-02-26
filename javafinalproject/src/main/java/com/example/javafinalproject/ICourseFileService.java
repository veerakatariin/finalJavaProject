package com.example.javafinalproject;

import java.io.FileNotFoundException;
import java.util.List;

public interface ICourseFileService {
    
    List<Student> readStudentsFromFile(String filePath) throws FileNotFoundException;

    List<Course> readCoursesFromFile(String filePath) throws FileNotFoundException;
}
