package com.bankingSystem;

public class SavingAccount extends Account{

	@Override
	public void withdraw(int amount, Customer customer) {
		// TODO Auto-generated method stub
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

	@Override
	public void calculateInterest(Customer customer) {
		// TODO Auto-generated method stub
		float interest = customer.getBalance()*0.01f;
		System.out.println("your interest over the days is: "+interest);
		
	}

}
