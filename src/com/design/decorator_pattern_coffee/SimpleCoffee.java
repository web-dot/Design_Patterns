package com.design.decorator_pattern_coffee;

public class SimpleCoffee implements Coffee {

	@Override
	public double getCost() {
		return 1;
	}
	
	@Override
	public String getIngredients() {
		return "Coffee";
	}
}
