package com.example.strategy_pattern_example_payment;

public class PayPalStrategy implements PaymentStrategy {

	private String emailId;
	private String password;
	
	
	public PayPalStrategy(String email, String pwd) {
		this.emailId = email;
		this.password = pwd;
	}
	
	
	@Override
	public void pay(int amt) {
		System.out.println(amt + " paid using PayPal");
	}

}
