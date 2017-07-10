package com.iburkat.aq.entity;

public enum Ingredient {
	FISH(10), TURTLE(30), CASTLE(10), SEAWEED(3), SEASHELL(2), SAND(3), AQUARIUMEQUIPMENT(40);
	private double price;
	Ingredient(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
}
