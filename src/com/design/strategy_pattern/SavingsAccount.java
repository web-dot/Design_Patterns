package com.design.strategy_pattern;

public class SavingsAccount {
	
	private double balance;
	SavingsDeposit deposit;
	SavingsWithdraw withdraw;
	SavingsLoan loan;
	
	public SavingsAccount(SavingsDeposit deposit, SavingsWithdraw withdraw, SavingsLoan loan) {
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.loan = loan;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
