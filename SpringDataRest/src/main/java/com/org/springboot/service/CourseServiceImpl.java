package com.org.springboot.service;

import java.util.ArrayList;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.springboot.DAO.CourseDao;
import com.org.springboot.entity.Course;
@Service
public class CourseServiceImpl implements CourseService {
//	List<Course> list;
	@Autowired
	private  CourseDao courseDao;
	public CourseServiceImpl() {
//		list=new ArrayList<>();
//		list.add(new Course(101,"java","core java"));
//		list.add(new Course(102,"python","core python"));
//		list.add(new Course(103,"javaScript","es6 Concept"));
	}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
		//return list;
	}
	public Course getCourse(long couseId) {
		
		
//		Course c=null;
//		for (Course course : list) {
//			if (course.getId()==couseId) {
//				c=course;
//				break;
//		}
//	
//	}
//		return c;
		return courseDao.getOne(couseId);
  }
	public Course addCourse(Course c) {
		// list.add(c);
		//return c;
		courseDao.save(c);
		return c;
		
	}
	public Course updateCourse(Course c) {
//		for (Course course : list) {
//			if (course.getId()==c.getId()) {
//				course.setTitle(c.getTitle());
//				course.setDescription(c.getDescription());
//			}
//		}
//		return c;
		courseDao.save(c);
		return c;
	}
	public void deleteCourse(long parseLong) {
	//	list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity=courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}
	
}

