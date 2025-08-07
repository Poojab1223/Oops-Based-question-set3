package com.bankingSystem;

public class CurrentAccount extends Account{
	@Override
	public void withdraw(int amount, Customer customer) {
		if(amount < customer. getBalance()) {
			System.out.println("Sorry!!! Insufficient balance");
		}
		else
		{
			int balance = customer. getBalance()-amount;
			customer. setBalance(balance);
			System.out.println("withdraw is successful your remaining balance is, " +balance);	
		}
	}
	public void calculateInterest(Customer customer) {
		System.out.println("since this is current account there is no interest");
		System.out.println("your interest over the days is: "+0);
	}

}
