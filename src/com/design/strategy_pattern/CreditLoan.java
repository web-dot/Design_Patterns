package com.design.strategy_pattern;

public class CreditLoan implements LoanStrategy {

	@Override
	public double getLoan(double balance, double loanAmt) {
		balance = balance - loanAmt;
		if(balance > 0) {
			System.out.println("LOAN: SUCCESS | LOAN AMT - INR " + loanAmt + " | BALANCE - INR: " + balance);
		}
		else {
			System.out.println("LOAN: SUCCESS | LOAN AMT - INR " + loanAmt + " | BALANCE - INR: " + balance + " | WARNING: NEGETIVE BALANCE");
		}
		return balance;
	}

}
