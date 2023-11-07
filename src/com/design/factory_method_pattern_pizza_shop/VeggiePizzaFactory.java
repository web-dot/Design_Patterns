package com.design.factory_method_pattern_pizza_shop;

public class VeggiePizzaFactory implements PizzaFactory {
	@Override
	public Pizza preparePizza() {
		return new VeggiePizza();
	}
}
