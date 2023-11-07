package com.design.factory_method_pattern_pizza_shop;

public class VeggiePizza implements Pizza {
	@Override
	public void prepare() {
		System.out.println("preparing pepperoni pizza");
	}
}
