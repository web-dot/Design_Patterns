package com.design.singleton_pattern;

public class TestSingleton {
	
	public static void main(String[] args) {
		
		Singleton t1 = Singleton.getInstance("snowy");
		System.out.println(t1.getName());
		
		Singleton t2 = Singleton.getInstance("pooh");
		System.out.println(t2.getName());
	}
}
