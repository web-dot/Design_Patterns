package com.design.strategy_pattern;

public class SavingsDeposit implements DepositMoneyStrategy {

	@Override
	public double deposit(double balance, double amt) {
		if(amt > 5000) {
			balance = balance + amt;
			System.out.println("DEPOSIT: SUCCESS | DEPOSITED - INR: " + amt +  " | BALANCE - INR: " + balance);
		}
		else {
			System.out.println("AMOUNT TOO LOW");
		}
		return balance;
	}

}
