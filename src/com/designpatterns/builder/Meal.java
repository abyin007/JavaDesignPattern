package com.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	List<Item> itemList = new ArrayList<Item>();

	public void addItem(Item item) {
		itemList.add(item);
	}

	public float getCost() {
		float totalCost = 0.0f;
		for (Item eachItem : itemList) {
			totalCost += eachItem.price();
		}
		return totalCost;
	}

	public void showMeal() {
		for (Item eachItem : itemList) {
			System.out.println("Name: " + eachItem.name() + "\n" + "Price: "
					+ eachItem.price() + "\n" + "Packing Type: "
					+ eachItem.pack().packing() + "\n");
		}
	}
}
