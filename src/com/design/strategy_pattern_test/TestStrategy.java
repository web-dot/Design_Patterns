package com.design.strategy_pattern_test;

public class TestStrategy {
	
	
	public static void main(String[] args) {		
		CollegeStudentEnroll collegeStudentEnroll = new CollegeStudentEnroll();
		
		CollegeStudent collegeStudent = new CollegeStudent(collegeStudentEnroll);
		collegeStudent.enroll.enroll();
		
	}
	
}
