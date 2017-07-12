package com.iburkat.aq.entity;

import java.util.ArrayList;

public class Aquarium {
	public final int ID;
	private final static double AQUARIUM_FISH_PRICE = 40;
	private final static double AQUARIUM_TURTLE_PRICE = 50;
	private final static double MIN_LENGTH = 4;
	private final static double MAX_LENGTH = 20;
	private final static double MAX_COMPONENT_COUNT = 7;
	
	private boolean isFishAquarium;
	private int clientId;
	private String aquariumName;
	private int aquariumQuantity;
	private ArrayList<Ingredient> ingredients = new ArrayList<>();
	
	public Aquarium(int iD, boolean isFishAquarium, int clientId, String aquariumName, int aquariumCount) {
		super();
		ID = iD;
		this.isFishAquarium = isFishAquarium;
		this.clientId = clientId;
		if (aquariumName.length()>=MIN_LENGTH && aquariumName.length()<=MAX_LENGTH) {
			this.aquariumName = aquariumName;
		}else{
			this.aquariumName = "Client " + iD;			
		}
		this.aquariumQuantity = aquariumCount;
	}
	
	public void newComponent(Ingredient newIngredient){
		if (ingredients.size() == MAX_COMPONENT_COUNT){
			System.out.println("Aquarium is full");
		}else{
			if (!ingredients.contains(newIngredient)){
				ingredients.add(newIngredient);
			}else{
				System.out.println("Component "+newIngredient+" already exists");
			}
		}
		
	}

	public String print() {
		return "[ID=" + ID + " : " + clientId + " : " + aquariumName + " : " + aquariumQuantity + "]" ;
	}

	private double getPrice() {
		double price = 0;
		if (isFishAquarium){
			price = AQUARIUM_FISH_PRICE;
		}else{
			price = AQUARIUM_TURTLE_PRICE;
		}
		for(Ingredient  item: ingredients){
			price += item.getPrice();
		}
		
		return price;
	}

	private String getAquariumContent(){
		String content = "";
		if (isFishAquarium){
			content = String.format("%-25s", "Aquarium F.")+ AQUARIUM_FISH_PRICE+"$\n";
		}else{
			content = String.format("%-25s", "Aquarium T.")+ AQUARIUM_TURTLE_PRICE+"$\n";
		}
		
		for (Ingredient item: ingredients){
			content += String.format("%-25s", item.name())+item.getPrice()+"$\n";
		}
		
		return content;
	}
	public String printCheck(){
		return String.format("\n********************************\n"
				+ "Order: %1$d\n"
				+ "Client: %2$d\n"
				+ "Name: %3$s\n"
				+ "--------------------------------\n"
				+ "%4$s"
				+ "--------------------------------\n"
				+ String.format("%-25s", "Total:")+"%5$.1f$\n"
				+ String.format("%-25s", "Quantity:")+"%6$d\n"
				+ "--------------------------------\n"
				+ String.format("%-25s", "Total price:")+"%7$.1f$\n"
				+ "********************************\n", ID, clientId, aquariumName, getAquariumContent(), getPrice(), aquariumQuantity, getPrice()*aquariumQuantity);
	}
	
}
