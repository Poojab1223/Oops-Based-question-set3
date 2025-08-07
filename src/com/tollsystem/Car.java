package com.tollsystem;

public class Car extends Vehicle{
	int stayDuration;

	public Car(String plateNumber, int tollAmount, int stayDuration) {
		super(plateNumber, tollAmount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTollAmount() {
		// TODO Auto-generated method stub
		return this.stayDuration*this.getTollAmount();
	}

}
