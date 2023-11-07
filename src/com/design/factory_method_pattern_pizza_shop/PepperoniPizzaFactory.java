package com.design.factory_method_pattern_pizza_shop;

public class PepperoniPizzaFactory implements PizzaFactory {
	@Override
	public Pizza preparePizza() {
		return new PepperoniPizza();
	}
}
