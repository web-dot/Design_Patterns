package com.design.factory_method_pattern_pizza_shop;

public class PizzaShop {
	/**
	 * Use Case: Pizza ordering system
	 * 
	 * imagine you are developing a pizza ordering system for a pizzeria. In this system, customers
	 * can order different types of pizzas, such as Margherita, Pepperoni, and Veggie. The goal is to
	 * create a flexible system that allows the addition of new pizza types without modifying
	 * the existing codebase. This is where the Factory Method Pattern comes in.
	 * */
	public static void main(String[] args) {
		PizzaFactory factory = new MargheritaPizzaFactory();
		Pizza pizza = factory.preparePizza();
		pizza.prepare();
	}
}
