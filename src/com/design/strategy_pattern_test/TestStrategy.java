package com.design.strategy_pattern_test;


/**
 * 						Interface{behavior}	(InterfaceEnroll)	
 * 							/|\						  /\
 * 							 |i							\i
 * 			 				Class(SchoolStudentEnroll)   Class(CollegeStudentEnroll)
 * 							/|\							   /|\
 *			uses			 |								|
 *Client ---------->	 	instance1						|		
 *(SchoolStudent)											|
 * 															|
 *Client 			 uses behavior from instance2			|					
 * (CollegeStudent)---------------------------------->    instance2
 * 
 * 
 * */




public class TestStrategy {
	
	public static void main(String[] args) {		
		CollegeStudentEnroll collegeStudentEnroll = new CollegeStudentEnroll();
		
		CollegeStudent collegeStudent = new CollegeStudent(collegeStudentEnroll);
		collegeStudent.enroll.enroll();
		
	}
	
}
