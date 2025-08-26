package com.example.dockerDemo.service.impl;

import com.example.dockerDemo.entity.Course;
import com.example.dockerDemo.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Component
public class CourseDetailsImpl {

    @Autowired
    public BooksRepository repository;

    Set<Course> listOfCourses = new HashSet<>();

    public List<Course> getCourses() {
        return repository.findAll();
    }

    public Optional<Course> getCoursesById(int courseId) {
        return repository.findById(courseId);
    }

    public void addCourse(Course course) {
        repository.save(course);
    }

    public void deleteCourse(int courseId) {
        repository.deleteById(courseId);
    }

}
