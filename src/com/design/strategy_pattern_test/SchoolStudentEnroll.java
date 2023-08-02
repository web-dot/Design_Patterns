package com.design.strategy_pattern_test;

public class SchoolStudentEnroll implements InterfaceEnroll {

	@Override
	public void enroll() {
		System.out.println("School student getting enrolled");
	}
}
