package com.design.factory_method_pattern_pizza_shop;

public class MargheritaPizza implements Pizza {
	@Override
	public void prepare() {
		System.out.println("preparing margherita pizza");	
	}
}
