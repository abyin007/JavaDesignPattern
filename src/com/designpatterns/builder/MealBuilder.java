package com.designpatterns.builder;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal vegMeals = new Meal();
		vegMeals.addItem(new VegBurger());
		vegMeals.addItem(new Pepsi());
		return vegMeals;
	}

	public Meal prepareNonVegMeal() {
		Meal nonVegMeals = new Meal();
		nonVegMeals.addItem(new ChickenBurger());
		nonVegMeals.addItem(new Coke());
		return nonVegMeals;
	}

}
