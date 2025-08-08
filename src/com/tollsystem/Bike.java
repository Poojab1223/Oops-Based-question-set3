package com.tollsystem;

public class Bike extends Vehicle{
	int stayDuration;
	int tollAmount;

	public Bike(String plateNumber, int tollAmount,int stayDuration) {
		super(plateNumber, tollAmount);
		this.tollAmount = tollAmount;
		this.stayDuration = stayDuration;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTollAmount() {
		// TODO Auto-generated method stub
		return this.stayDuration * this.tollAmount ;
	}

}
