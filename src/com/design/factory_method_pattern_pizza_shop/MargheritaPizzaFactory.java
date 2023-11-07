package com.design.factory_method_pattern_pizza_shop;

public class MargheritaPizzaFactory implements PizzaFactory {
	@Override
	public Pizza preparePizza() {
		return new MargheritaPizza();
	}
}
