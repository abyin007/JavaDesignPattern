package com.designpatterns.builder;

public class BuilderPatternDemo {
	
	public static void main(String[] args){
		
		MealBuilder mealBuilder = new MealBuilder();
		System.out.println("Veg Meal:");
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		nonVegMeal.showMeal();
		System.out.println("\nNon Veg Meal:");
		Meal vegMeal = mealBuilder.prepareVegMeal();
		vegMeal.showMeal();
	}

}
