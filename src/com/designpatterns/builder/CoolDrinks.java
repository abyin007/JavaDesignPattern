package com.designpatterns.builder;

public abstract class CoolDrinks implements Item {

	@Override
	public Packing pack() {
		return new Bottle();
	}

}
