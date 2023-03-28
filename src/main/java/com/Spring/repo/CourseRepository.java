package com.Spring.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.entity.Course;

public interface CourseRepository extends JpaRepository<Course,Serializable>{

}
