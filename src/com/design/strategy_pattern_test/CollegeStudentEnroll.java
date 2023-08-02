package com.design.strategy_pattern_test;

public class CollegeStudentEnroll implements InterfaceEnroll {
	
	@Override
	public void enroll() {
		System.out.println("College student getting enrolled");
	}
}
