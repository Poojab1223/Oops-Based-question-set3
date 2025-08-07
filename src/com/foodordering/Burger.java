package com.foodordering;

public class Burger extends FoodItem{

	public Burger(int cost, int cookingTime, String[] ingredients) {
		super(cost, cookingTime, ingredients);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getOrder() {
		// TODO Auto-generated method stub
		System.out.println("your Burger order is successful");
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("cost: "+this.getCost()+" cookingTime: "+this.getCookingTime()+" ingredients: "+ this.getIngredients());
	}

}
