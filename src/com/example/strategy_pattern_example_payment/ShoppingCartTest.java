package com.example.strategy_pattern_example_payment;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Item item1 = new Item("1234", 10);
		Item item2 = new Item("5678", 20);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by credit card
		cart.pay(new CreditCardStrategy("Pankaj kumar", "123456789", "786", "12/15"));
		
		//pay by paypal
		cart.pay(new PayPalStrategy("test@gmail.com", "1234"));
	}

}
