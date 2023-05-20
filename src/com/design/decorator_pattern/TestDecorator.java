package com.design.decorator_pattern;

public class TestDecorator {
	
	public static void main(String[] args) {
		// caramel `Decorated` espresso
		Beverage b = new Caramel(new Espresso());
		int cost = b.cost();
		System.out.println("cost of caramel decorated espresso is : " + cost);
		Thread.currentThread().getName();
	}
	
}
