package com.design.strategy_pattern;

public class CreditAccount {
	
	private double balance;
	CreditDeposit deposit;
	CreditWithdraw withdraw;
	CreditLoan loan;
	
	public CreditAccount(CreditDeposit deposit, CreditWithdraw withdraw, CreditLoan loan) {
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
