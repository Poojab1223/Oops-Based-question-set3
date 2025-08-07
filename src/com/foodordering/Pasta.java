package com.foodordering;

public class Pasta extends FoodItem{

	public Pasta(int cost, int cookingTime, String[] ingredients) {
		super(cost, cookingTime, ingredients);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getOrder() {
		// TODO Auto-generated method stub
		System.out.println(" pasta you looking for is ordered");
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("cost: "+this.getCost()+" cookingTime: "+this.getCookingTime()+" ingredients: "+ this.getIngredients());
	}

}
