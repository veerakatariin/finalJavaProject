package com.example.javafinalproject;
import java.util.List;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class CourseService implements ICourseService {
    List<Student> studentList = new ArrayList<>();
    List<Course> courseList = new ArrayList<>();

    public CourseService() throws FileNotFoundException {
        CourseFileService courseFileService = new CourseFileService();
        this.courseList = courseFileService.readCoursesFromFile("src\\files\\courses.txt");
        this.studentList = courseFileService.readStudentsFromFile("src\\files\\students.txt");
    }


    public List<Student> getStudents() {
 
        return this.studentList;
    }

    public List<Course> getCourses() {

        return this.courseList;
    }

    public Student getStudentById(long studentId) {

        int id = (int) studentId;
        return studentList.get(id);

    }

    public Course getCourseById(long courseId) {
 
        int id = (int) courseId;
        return courseList.get(id);
    }

    public List<Course> getCourseOfStudent(long studentId) {

        List<Course> addedCourse = new ArrayList<>();
        for(Course crs : this.courseList)
        {
            for(Student sdt : crs.getStudentList())
            {
                if(sdt.getAutomaticID() == studentId){
                    addedCourse.add(crs);
                }
            }
        }
        return addedCourse;

    }

    public boolean addStudentToCourse(long studentId, long courseId) {

        List<Course> addToCourse = new ArrayList<>();
        List<Student> addToStudent = new ArrayList<>();

        for(Course crs : this.courseList)
        {
            if (addToCourse.isEmpty()){
                return false;
            }
            else if(courseId == crs.getAutomaticID()){
                addToCourse.add(crs);
            }
          }

        for(Student sdt : this.studentList)
        {
            if(addToStudent.isEmpty()){
                return false;
            }
            else if(studentId == sdt.getAutomaticID()){
                addToStudent.add(sdt);
            }
        }
        return addToCourse.get(0).addStudentList(addToStudent.get(0));
    
    }
}
