package com.example.javafinalproject;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import org.springframework.stereotype.Service;


@Service
public class CourseFileService implements ICourseFileService {

    List<Student> studentList = new ArrayList<>();
    List<Course> courseList = new ArrayList<>();
    
    
    public List<Student> readStudentsFromFile(String filePath) throws FileNotFoundException{

        File studentFile = new File(filePath);
        Scanner scanner = new Scanner(studentFile);

        while(scanner.hasNextLine())
        {
            String[] row = scanner.nextLine().split(" ");
            studentList.add(new Student(row[0], row[1]));
  
        }

        scanner.close();
        return studentList;
    }

    public List<Course> readCoursesFromFile(String filePath) throws FileNotFoundException {
        
        File courseFile = new File(filePath);
   
        Scanner scanner = new Scanner(courseFile);
        List<Student> studentCourse = new ArrayList<>();

      

        while(scanner.hasNextLine())
        {
            
            String[] row = scanner.nextLine().split(" -- ");
   
            courseList.add(new Course(row[0], row[1], row[2], studentCourse));

        }
        scanner.close();
        return courseList;
    }


}
