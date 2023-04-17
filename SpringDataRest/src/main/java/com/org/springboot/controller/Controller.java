package com.org.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.org.springboot.entity.Course;
import com.org.springboot.service.CourseService;

@RestController
public class Controller {
	@Autowired
	private CourseService courseService;
	
	// Fetch the Courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses() ;
		
	}
	// Fetch single Course
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId)) ;
	}
	// Add course
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course c) {
		return this.courseService.addCourse(c);
	}
	// Update Course
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course c) {
		return this.courseService.updateCourse(c);
	}
	//delete Course
	@DeleteMapping("/courses/{courseId}")
	public void  deleteCourse(@PathVariable String courseId) {
		 this.courseService.deleteCourse(Long.parseLong(courseId));
	}
	
}
