package com.org.springboot.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.springboot.entity.Course;
public interface CourseDao extends JpaRepository<Course, Long>{

}
