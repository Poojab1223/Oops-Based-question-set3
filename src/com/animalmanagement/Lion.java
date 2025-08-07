package com.animalmanagement;

public class Lion extends Animal{

	public Lion(String healthStatus) {
		super(healthStatus);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("lion is having it's favourite food that is meat!!!");
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("roaring by lion!!!!!!");
	}

}
