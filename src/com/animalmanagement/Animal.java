package com.animalmanagement;

public abstract class Animal {
	
	private String healthStatus;
	
	public Animal(String healthStatus) {
		super();
		this.healthStatus = healthStatus;
	}
	
	public abstract void eating();
	public abstract void makeSound();

	public void sleeping() {
		System.out.println("Animal is sleeping");
	}
	public String getHealthStatus() {
		return this.healthStatus;
	}
	
}
