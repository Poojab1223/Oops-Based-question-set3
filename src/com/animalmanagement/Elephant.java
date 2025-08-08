package com.animalmanagement;

public class Elephant extends Animal{

	public Elephant(String healthStatus) {
		super(healthStatus);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("elephant is having sugarcane!!!!!!!!");
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("screaming by elephant");
	}

}
