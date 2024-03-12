package com.design.decorator_pattern_coffee;

public class WithSprinkles extends CoffeeDecorator {
	public WithSprinkles(Coffee c) {
		super(c);
	}
	@Override
	public double getCost() {
		return super.getCost() + 0.2;
	}
	
	@Override
	public String getIngredients() {
		return super.getIngredients() + ", Sprinkles";
	}
}
