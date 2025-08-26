package com.example.dockerDemo.controller;

import com.example.dockerDemo.entity.Course;
import com.example.dockerDemo.service.CourseDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CourseController {

    @Autowired
    public CourseDetailsService courseService;

    @GetMapping("/")
    public List<Course> showCourses() {
        return courseService.getCourses();
    }

    @GetMapping("/{id}")
    public Optional<Course> showCoursesById(@PathVariable int id) {
        return courseService.getCourseById(id);
    }

    @PostMapping("/")
    public Course addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
        return course;
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable int id) {
         courseService.deleteCourse(id);
    }
}
