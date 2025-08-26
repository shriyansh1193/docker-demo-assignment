package com.example.dockerDemo.repository;

import com.example.dockerDemo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Course, Integer> {
}
