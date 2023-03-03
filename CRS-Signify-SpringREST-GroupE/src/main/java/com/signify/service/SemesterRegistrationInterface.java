/**
 * 
 */
package com.signify.service;

import java.util.Date;

/**
 * @author GROUP-E-CRS-SIGNIFY
 *
 */
public interface SemesterRegistrationInterface {
	/**
	 * 
	 * @param studentId
	 * @param Semester
	 * @param dateOfJoining
	 */
	public void registerCourses(String studentId, int Semester, Date dateOfJoining);
	/**
	 * 
	 * @param studentId
	 * @param Semester
	 * @param courseCode
	 * add course in the respective semester
	 */
	public void addCourse(String studentId, int Semester, String courseCode);
	/**
	 * To drop course
	 * @param studentId
	 * @param Semester
	 * @param courseCode
	 */
	public void dropCourse(String studentId, int Semester, String courseCode);
	/**
	 * To view course details
	 */
	public void viewCourseDetails();
	/**
	 * To optCourse details
	 */
	public void optCourse();
	/**
	 * To registration details
	 */
	public void registration();
	/**
	 * To payfees details
	 */
	public void payfees();
	/**
	 * To generateRegistionId details
	 */
	public void generateRegistionId();
	/**
	 * To getSemesterDetails details
	 */
	public void getSemesterDetails();
}
