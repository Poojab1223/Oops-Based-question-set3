package com.tollsystem;

public abstract class Vehicle {
	private String plateNumber;
	private int tollAmount;
	
	public Vehicle(String plateNumber, int tollAmount) {
		super();
		this.plateNumber = plateNumber;
		this.tollAmount = tollAmount;
	}
     
	public abstract int getTollAmount();
}
