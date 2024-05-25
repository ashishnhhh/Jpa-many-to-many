package com.spring.Jpa_many.to.many.Controller;

import com.spring.Jpa_many.to.many.Entity.Course;
import com.spring.Jpa_many.to.many.Entity.Student;
import com.spring.Jpa_many.to.many.Repository.CourseRepository;
import com.spring.Jpa_many.to.many.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/course")
public class StudentCourseController {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;

    @PostMapping
    public Student saveStudentWithCourse(@RequestBody Student student){
        return  studentRepository.save(student);
    }

    @GetMapping
    public List<Student> findAllstudents(){
        return studentRepository.findAll();
    }

    @GetMapping("/{studentId}")
    public Student findStudentById(@PathVariable Long studentId){
        return studentRepository.findById(studentId).orElseThrow(null);
    }

    @GetMapping("/find/{name}")
    public List<Student> findstudentsContainingByName(@PathVariable String name){
        return studentRepository.findByNameContaining(name);
    }

    @GetMapping("/search/{price}")
    public List<Course> findCourseLessThanPrice(@PathVariable double price){
        return courseRepository.findByFeeLessThan(price);
    }
}


