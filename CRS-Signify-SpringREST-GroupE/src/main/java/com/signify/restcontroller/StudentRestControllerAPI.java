/**
 * 
 */
package com.signify.application;

import java.util.List;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.signify.bean.Admin;
import com.signify.bean.Course;
import com.signify.bean.Student;
import com.signify.service.StudentInterface;

/**
 * @author GROUP-E-CRS-SIGNIFY
 *
 */

@RestController
public class StudentRestControllerAPI {
	
	@Autowired
	private StudentInterface studentService;
	@Autowired
	private Student student;
	@Autowired
	private Course course;
	
	
	@RequestMapping(
			value = "/createStudent",
			method = RequestMethod.POST
			)
	@ResponseBody
	/*
		AddStudentAPI
		@params name,id
		@return ResponseEntity 
	*/
	public ResponseEntity<String> addStudent(Map<String, String> param) {
		student.setBatch(param.get("batch"));
		student.setBranchName(param.get("branchName"));
		student.setPassword(param.get("password"));
		student.setPhoneNumber(param.get("phoneNumber"));
		student.setSemester(param.get("semester"));
		student.setStudentName(param.get("studentName"));
		student.setAddress(param.get("address"));
		studentService.addStudent(student);

		return new ResponseEntity<String>("added", HttpStatus.OK);
	}
	
	@RequestMapping(
			produces = MediaType.APPLICATION_JSON, 
		    method = RequestMethod.GET,
		    value ="/viewGrades/{id}")
	/*
		StudentViewGradeAPI
		@params id
		@return ResponseEntity 
	*/
	public ResponseEntity<List<Course>> viewGrades(@PathVariable String id) {
		List<Course> courses =studentService.viewGrades(id);
		if(courses == null)			
			return new ResponseEntity<>(courses, HttpStatus.BAD_REQUEST);
		else
			return new ResponseEntity<>(courses, HttpStatus.OK);
	}
	
	@RequestMapping(
			produces = MediaType.APPLICATION_JSON, 
		    method = RequestMethod.GET,
		    value ="/Catalog")
	/*
		StudentViewCatalogAPI
		@return ResponseEntity 
	*/
	public ResponseEntity<List<Course>> viewCatalog() {
		List<Course> courses =studentService.viewCatelogs();
		if(courses == null)			
			return new ResponseEntity<>(courses, HttpStatus.BAD_REQUEST);
		else
			return new ResponseEntity<>(courses, HttpStatus.OK);
	}
	
	@RequestMapping(

			produces = MediaType.APPLICATION_JSON, 
			value = "/addCourse/{id}",
			method = RequestMethod.GET
			)
	/*
		StudentviewingAvailableCoursesAPI
		@params id
		@return ResponseEntity 
	*/
	public ResponseEntity<List<Course>> viewingAvailableCourses(@PathVariable String id){

		    String sem = studentService.getSem(id);
			List<Course> courses = studentService.viewCourseForSem(sem);
			if(courses == null)			
				return new ResponseEntity<>(courses, HttpStatus.BAD_REQUEST);
			else
				return new ResponseEntity<>(courses, HttpStatus.OK);
	}
	
	
	@RequestMapping(

			produces = MediaType.APPLICATION_JSON, 
			value = "/addCourse/{id}",
			method = RequestMethod.POST
			)
	/*
		StudentaddcourseAPI
		@params id,name
		@return ResponseEntity 
	*/
	
	public ResponseEntity<String> addCoure(@PathVariable String id, @RequestBody Map<String, String> param) {
		
		 String sem = studentService.getSem(id);
		 String response = studentService.addCourse(id, param.get("courseCode"), Integer.parseInt(sem));
		 return new ResponseEntity<String> (response,HttpStatus.OK);
	}
	
	@RequestMapping(

			produces = MediaType.APPLICATION_JSON, 
			value = "/dropCourse/{id}",
			method = RequestMethod.GET
			)
			/*
		StudentviewingAddedCoursesAPI
		@params id
		@return ResponseEntity 
	*/
	public ResponseEntity<List<Course>> viewingAddedCourses(@PathVariable String id){

			List<Course> courses = studentService.viewAddedCoursesBtStudent(id);
			if(courses == null)			
				return new ResponseEntity<>(courses, HttpStatus.BAD_REQUEST);
			else
				return new ResponseEntity<>(courses, HttpStatus.OK);
	}
	
	
	@RequestMapping(

			produces = MediaType.APPLICATION_JSON, 
			value = "/dropCourse/{id}/{courseCode}",
			method = RequestMethod.GET
			)
			/*
		StudentdropCoursesAPI
		@params id,courseCode
		@return ResponseEntity 
	*/
	public ResponseEntity<String> dropCourse(@PathVariable String id, String courseCode) {
		
		 String response = studentService.dropCourse(id, courseCode);
		 return new ResponseEntity<String> (response,HttpStatus.OK);
	}
	
	// details
	//payment
	
}
