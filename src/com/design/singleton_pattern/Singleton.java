package com.design.singleton_pattern;

public class Singleton {
	
	private static Singleton INSTANCE;
	private String name;
	
	private Singleton(String name) {
		this.name = name;
	}
	
	public static Singleton getInstance(String name) {
		if(INSTANCE == null) {
			INSTANCE = new Singleton(name);
		}
		return INSTANCE;
	}
	
	public String getName() {
		return this.name;
	}
}
