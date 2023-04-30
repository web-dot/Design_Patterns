package com.design.strategy_pattern;

public class SavingsWithdraw implements WithdrawMoney {

	@Override
	public double withdraw(double balance, double amt) {
		if(balance > 10000) {
			balance = balance - amt;
		}
		return balance;
	}

}
