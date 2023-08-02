package com.design.strategy_pattern_test;

public class SchoolStudent extends Student {
	
	SchoolStudentEnroll enroll;
	public SchoolStudent(SchoolStudentEnroll enroll) {
		this.enroll = enroll;
	}
}
