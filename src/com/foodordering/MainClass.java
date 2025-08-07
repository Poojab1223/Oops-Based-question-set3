package com.foodordering;

public class MainClass {
	public static void main(String[] args) {
		FoodItem foodItem1 = new Pizza(200 ,50 , new String[]{"veggies","pepper","chees"});
		FoodItem foodItem2 = new Burger(80 , 30, new String[] {"onions","bread"});
		FoodItem foodItem3 = new Pasta(400, 1, new String[] {"flour", "pasta", "eggs"});

		FoodItem[] listOfFoodItems = {foodItem1, foodItem2, foodItem3};

		for(int i = 0; i < listOfFoodItems.length; i++) {
			if( listOfFoodItems[i] instanceof Pizza) {
				Pizza pizza = (Pizza)listOfFoodItems[i];
				pizza.getOrder();
				pizza.getInfo();
			}
			else if( listOfFoodItems[i] instanceof Burger) {
				Burger burger = (Burger)listOfFoodItems[i];
				burger.getOrder();
			}
			else {
				Pasta pasta = (Pasta)listOfFoodItems[i];
				pasta.getOrder();
				pasta.getInfo();
			}
		}

	}
}