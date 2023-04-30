package com.design.strategy_pattern;

public class TestStrategyPattern {
	
	/**
	 * What is Strategy-Pattern:
	 *  
	 * 1. 	A family of algorithms(deposit(), withdraw(), getLoan()), 
	 * 2. 	Encapsulates each one, and makes them interchangeable(whenever you take a strategy, 
	 * 		you can take any of the concrete algorithms), and thus 
	 * 3. 	`Strategy` lets the algorithm vary independently from the clients that use 
	 * 		it(SavingsAccount or CreditAccount).
	 * 
	 * */
	
	
	/**
	 * Strategy-Pattern in Spring Framework:
	 * 
	 *Spring transaction management module, you can define different transactional behaviors 
	 *(such as read-only or propagation rules) using the TransactionDefinition interface. 
	 *Spring provides several concrete implementations of this interface, 
	 *such as DefaultTransactionDefinition, AnnotationTransactionAttributeSource, 
	 *and RuleBasedTransactionAttribute. Each of these implementations encapsulates 
	 *a different algorithm for defining transaction behavior, and they can be used 
	 *interchangeably by the client code.
	 *
	 *Similarly, in the Spring security module, you can define different authentication 
	 *and authorization strategies using the AuthenticationManager and AccessDecisionManager 
	 *interfaces. Spring provides several concrete implementations of these interfaces, 
	 *such as ProviderManager, AffirmativeBased, and RoleVoter. Each of these implementations 
	 *encapsulates a different algorithm for handling authentication and authorization, 
	 *and they can be used interchangeably by the client code.
	 *
	 *In both cases, the client code can select the appropriate strategy implementation 
	 *at runtime based on its needs, without being tightly coupled to any specific 
	 *implementation. This allows the Spring Framework to provide flexible and 
	 *customizable transaction management and security features to its users.
	 * 
	 * */
	
	public static void main(String[] args) {
		
		
		System.out.println("SAVINGS TRANSACTIONS--------");
		SavingsDeposit savingsDeposit = new SavingsDeposit();
		SavingsWithdraw savingsWithdraw = new SavingsWithdraw();
		SavingsLoan savingsLoan = new SavingsLoan();
		
		SavingsAccount savingsAccount = new SavingsAccount(savingsDeposit, savingsWithdraw, savingsLoan);
		
		savingsAccount.setBalance(savingsAccount.deposit.deposit(savingsAccount.getBalance(), 100000));
		savingsAccount.setBalance(savingsAccount.withdraw.withdraw(savingsAccount.getBalance(), 5000));
		savingsAccount.setBalance(savingsAccount.loan.getLoan(savingsAccount.getBalance(), 30000));
		
		System.out.println("CREDIT TRANSACTIONS--------");
		
		CreditDeposit creditDeposit = new CreditDeposit();
		CreditWithdraw creditWithdraw = new CreditWithdraw();
		CreditLoan creditLoan = new CreditLoan();
		
		
		CreditAccount creditAccount = new CreditAccount(creditDeposit, creditWithdraw, creditLoan);
		
		creditAccount.setBalance(creditAccount.deposit.deposit(creditAccount.getBalance(), 50000));
		creditAccount.setBalance(creditAccount.withdraw.withdraw(creditAccount.getBalance(), 20000));
		creditAccount.setBalance(creditAccount.loan.getLoan(creditAccount.getBalance(), 60000));
		
		/**
		 * CONSOLE OUTPUT:
		 * 
		 * 	SAVINGS TRANSACTIONS--------
		 * 
			DEPOSIT: SUCCESS | DEPOSITED - INR: 100000.0 | BALANCE - INR: 100000.0
			WITHDRAWL: SUCCESS | WITHDRAWN - INR: 5000.0 | BALANCE - INR: 95000.0
			LOAN: SUCCESS | LOAN AMT - INR 30000.0 | BALANCE - INR: 65000.0
			
			CREDIT TRANSACTIONS--------
			
			DEPOSIT: SUCCESS | DEPOSITED - INR: 50000.0 | BALANCE - INR: 50000.0
			WITHDRAWL: SUCCESS | WITHDRAWN - INR: 20000.0 | BALANCE - INR: 30000.0
			LOAN: SUCCESS | LOAN AMT - INR 60000.0 | BALANCE - INR: -30000.0 | WARNING: NEGETIVE BALANCE
		 * 
		 * */
		
		
	}
}
