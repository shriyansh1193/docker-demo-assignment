package com.example.dockerDemo.controller;

import com.example.dockerDemo.entity.Course;
import com.example.dockerDemo.service.CourseDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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
