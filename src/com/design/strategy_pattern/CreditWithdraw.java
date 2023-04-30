package com.design.strategy_pattern;

public class CreditWithdraw implements WithdrawMoney {
	
	@Override
	public double withdraw(double balance, double amt) {
		if(balance > 0) {
			balance = balance - amt;
		}
		return balance;
	}
}
