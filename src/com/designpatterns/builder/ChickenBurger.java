package com.designpatterns.builder;

public class ChickenBurger extends Burger{

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 50.50f;
	}

}
