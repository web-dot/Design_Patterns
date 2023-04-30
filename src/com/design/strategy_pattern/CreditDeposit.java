package com.design.strategy_pattern;

public class CreditDeposit implements DepositMoneyStrategy {

	@Override
	public double deposit(double balance, double amt) {
		balance = balance + amt;
		System.out.println("DEPOSIT: SUCCESS | DEPOSITED - INR: " + amt +  " | BALANCE - INR: " + balance);
		return balance;
	}

}
