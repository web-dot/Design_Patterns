package com.design.decorator_pattern;

public class Caramel extends AddonDecorator {
	Beverage beverage;
	public Caramel(Beverage b) {
		this.beverage = b;
	}
	
	
	@Override
	public int cost() {
		return this.beverage.cost() + 2;
	}
}
