package com.foodordering;

/**
 * @author Pooja E B
 *
 */
public abstract class FoodItem {
	private int cost;
	private int cookingTime;
	public String[] ingredients;
	
	public FoodItem(int cost, int cookingTime, String[] ingredients) {
		super();
		this.cost = cost;
		this.cookingTime = cookingTime;
		this.ingredients = ingredients;
	} 
	public int getCost() {
		return cost;
	}
	public int getCookingTime() {
		return cookingTime;
	}
	public String[] getIngredients() {
		return ingredients;
	}
    public abstract void getOrder();
    public abstract void getInfo();

}
