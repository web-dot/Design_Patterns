package com.design.strategy_pattern;

public interface LoanStrategy {
	public double getLoan(double balance, double loanAmt);
}
