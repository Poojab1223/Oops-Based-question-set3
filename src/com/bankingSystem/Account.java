package com.bankingSystem;

public abstract class Account {

	public abstract void withdraw(int amount, Customer customer);
	public abstract void calculateInterest(Customer customer);
}
