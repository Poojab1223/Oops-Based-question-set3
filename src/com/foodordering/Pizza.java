package com.foodordering;

public class Pizza extends FoodItem{

	public Pizza(int cost, int cookingTime, String[] ingredients) {
		super(cost, cookingTime, ingredients);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getOrder() {
		// TODO Auto-generated method stub
		System.out.println("your pizaa order is successful!!!!!!!");
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("cost: "+this.getCost()+" cookingTime: "+this.getCookingTime()+" ingredients: "+ this.getIngredients());
	}
}
