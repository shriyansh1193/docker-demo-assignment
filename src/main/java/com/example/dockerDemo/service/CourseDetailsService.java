package com.example.dockerDemo.service;

import com.example.dockerDemo.entity.Course;
import com.example.dockerDemo.service.impl.CourseDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseDetailsService {

    @Autowired
    public CourseDetailsImpl courseImpl;

    public List<Course> getCourses() {
        return courseImpl.getCourses();
    }

    public void deleteCourse(int course) {
        courseImpl.deleteCourse(course);
    }

    public void addCourse(Course course) {
        courseImpl.addCourse(course);
    }

    public Optional<Course> getCourseById(int id) {
        return courseImpl.getCoursesById(id);
    }
}
