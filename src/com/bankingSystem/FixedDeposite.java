package com.bankingSystem;

public class FixedDeposite extends Account{
	public int prinicipleAmount;
	public float rateOfInterest;
	public int time;
	
	public FixedDeposite(int prinicipleAmount, float rateOfInterest, int time) {
		super();
		this.prinicipleAmount = prinicipleAmount;
		this.rateOfInterest = rateOfInterest;
		this.time = time;
	}

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
		float interest=(prinicipleAmount*time*rateOfInterest)/100;
		System.out.println("your interest over the days is"+interest);
		
	}

}
