package com.design.strategy_pattern;

public class SavingsLoan implements LoanStrategy {

	@Override
	public double getLoan(double balance, double loanAmt) {
		if(balance > 50000 && loanAmt < balance) {
			balance = balance - loanAmt;
			System.out.println("LOAN: SUCCESS | LOAN AMT - INR " + loanAmt + " | BALANCE - INR: " + balance);
		}
		else {
			System.out.println("balance is too low for the loan");
		}
		return balance;
	}

}
