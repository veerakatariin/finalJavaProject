package com.example.javafinalproject;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    CourseService service;

    @GetMapping("students")
    public List<Student> getStudentList(){

        return service.getStudents();
    }

    @GetMapping("courses")
    public List<Course> getCourseList(){

        return service.getCourses();
    }

    @GetMapping("onlinecourses")
    public String OnlineCourse(){

        return ("mo");
    }
    
    
    @GetMapping("students/{id}")
    public String getStudentById(@PathVariable long id){

        List<String> coursesinfo = new ArrayList<>();
        Student studentsinfo = service.getStudentById(id);


        for(Course crs : service.getCourseOfStudent(id))
        {
            coursesinfo.add(" <br> " + crs.getCourseName());
        }
        return("<h3>" + studentsinfo.getLastName() + " " + studentsinfo.getFirstName()
        + "</h3>" + coursesinfo );

    
    }

    @GetMapping("courses/{id}")
    public String getCourseById(@PathVariable long id){

        List<String> studentsinfo = new ArrayList<>();
        Course coursesinfo = service.getCourseById(id);

        for(Student sdt : coursesinfo.getStudentList())
        {
            studentsinfo.add("<br>" + sdt.getFirstName() + " " + sdt.getLastName());
        }
        System.out.println("mo" + studentsinfo + " " + coursesinfo.getCourseName());

        return("<h3>" + coursesinfo.getCourseName().toString()
        + "</h3>" + studentsinfo.toString().replace("[", "").replace("]", ""));

    }

    @PostMapping("add")
    public boolean addStudentToCourse(@RequestBody Map <String, Long> jsonMapping){
        
        return(service.addStudentToCourse(jsonMapping.get("sid"),jsonMapping.get("cid")));
    }
}
