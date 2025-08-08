package com.tollsystem;

public class Truck extends Vehicle{
	int stayDuration = 20;
	int tollAmount;
	
	public Truck(String plateNumber, int tollAmount) {
		super(plateNumber, tollAmount);
		 this.tollAmount = tollAmount;
		 this.stayDuration = stayDuration;
	}

	@Override
	public int getTollAmount() {
		// TODO Auto-generated method stub
		return this.stayDuration * tollAmount ;
	}

}
