package com.org.springboot.service;

import java.util.List;

import com.org.springboot.entity.Course;

public interface CourseService  {
	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course c);
	public Course updateCourse( Course c);
	public void deleteCourse(long parseLong);
	
}
