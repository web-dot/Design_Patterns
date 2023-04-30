package com.design.strategy_pattern;

public class SavingsWithdraw implements WithdrawMoneyStrategy {

	@Override
	public double withdraw(double balance, double amt) {
		if(balance > 10000) {
			balance = balance - amt;
			System.out.println("WITHDRAWL: SUCCESS | WITHDRAWN - INR: " + amt + " | BALANCE - INR: " + balance);
		}
		else {
			System.out.println("Balance is low to withdraw this amount");
		}
		return balance;
	}

}
