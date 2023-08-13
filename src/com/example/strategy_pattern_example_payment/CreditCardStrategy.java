package com.example.strategy_pattern_example_payment;

public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;
	private String cvv;
	private String datOfExpiary;
	
	public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate) {
		this.name = nm;
		this.cardNumber = ccNum;
		this.cvv = cvv;
		this.datOfExpiary = expiryDate;
	}
	
	@Override
	public void pay(int amt) {
		System.out.println(amt + " paid with credit/debit card");
	}
}
