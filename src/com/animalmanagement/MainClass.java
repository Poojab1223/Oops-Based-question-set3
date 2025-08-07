package com.animalmanagement;

public class MainClass {
	public static void main(String[] args) {
		Animal animal1 = new Monkey("good");
		Animal animal2 = new Lion("great");
		Animal animal3 = new Elephant("weak");
		
		Animal[] listOfAnimal = {animal1, animal2, animal3};
		
		for(int i =  0; i < listOfAnimal. length; i++) {
			System.out.println("health status is" + listOfAnimal[i].getHealthStatus());
			listOfAnimal[i].eating();
			listOfAnimal[i].sleeping();
			listOfAnimal[i].makeSound();
		}
	}
}
