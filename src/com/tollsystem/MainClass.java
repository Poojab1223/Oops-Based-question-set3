package com.tollsystem;

public class MainClass {
	public static void main(String[] args) {
		//Polymorphism
		Vehicle vehicle1 = new Car("gfhd645",73,15);
		Vehicle vehicle2 = new Truck("45ghgf",190);
		Vehicle vehicle3 = new Bike("12hd",50,67);
		
		Vehicle[] listOfVehicle = {vehicle1, vehicle2, vehicle3};
		
		for(int i = 0; i < listOfVehicle.length; i++) {
			if(listOfVehicle[i] instanceof Car) {
				Car car = (Car)listOfVehicle[i];
				System.out.println(car.getTollAmount());
			}
			else if(listOfVehicle[i] instanceof Bike) {
				Bike bike = (Bike)listOfVehicle[i];
				System.out.println(bike.getTollAmount());
			}
			else {
				Truck truck=(Truck)listOfVehicle[i];
				System.out.println(truck.getTollAmount());
			}
		}
		
	}

}
