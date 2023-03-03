package com.signify.service;
/**
 * @author GROUP-E-CRS-SIGNIFY
 *
 */
public interface GradeCardInterface {
 //to view grades
 /**
 * method ViewGrades
 
 *
 */
	public void viewGrades();
	//to add grades by the professor
	/**
 * method addGrades
 
 *
 */
	public void addGrades();
	// approving grades by admin
	/**
 * method approveGrades
 
 *
 */
	public void approveGrades();
	/**
 * method generateReportCard
 
 *
 */
	//generating reportcard for student
	public void generateReportCard();
}
