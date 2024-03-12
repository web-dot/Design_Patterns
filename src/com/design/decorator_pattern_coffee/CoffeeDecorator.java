package com.design.decorator_pattern_coffee;

public abstract class CoffeeDecorator implements Coffee {
	
	private final Coffee decoratedCoffee;
	
	public CoffeeDecorator(Coffee c) {
		this.decoratedCoffee = c;
	}
	
	@Override
	public double getCost() {
		return decoratedCoffee.getCost();
	}
	
	@Override
	public String getIngredients() {
		return decoratedCoffee.getIngredients();
	}
}
