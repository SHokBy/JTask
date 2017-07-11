package com.iburkat.aq.entity;

import java.util.ArrayList;

public class Aquarium {
	public final int ID;
	private final static double AQUARIUMFISHPRICE = 40;
	private final static double AQUARIUMTURTLEPRICE = 50;
	private boolean isFishAquarium;
	private int idClient;
	private String aquariumName;
	private int aquariumQuantity;
	private ArrayList<Ingredient> ingredients = new ArrayList<>();
	
	public Aquarium(int iD, boolean isFishAquarium, int idClient, String aquariumName, int aquariumCount) {
		super();
		ID = iD;
		this.isFishAquarium = isFishAquarium;
		this.idClient = idClient;
		if (aquariumName.length()>=4 && aquariumName.length()<=20) {
			this.aquariumName = aquariumName;
		}else{
			this.aquariumName = "Client " + iD;			
		}
		this.aquariumQuantity = aquariumCount;
	}
	
	public void newComponent(Ingredient newIngredient){
		if (ingredients.size() == 7){
			System.out.println("Aquarium is full");
		}else{
			if (!ingredients.contains(newIngredient)){
				ingredients.add(newIngredient);
			}else{
				System.out.println("Component "+newIngredient+" already exists");
			}
		}
		
	}

	public String Print() {
		return "[ID=" + ID + " : " + idClient + " : " + aquariumName + " : " + aquariumQuantity + "]" ;
	}

	private double getPrice() {
		double price = 0;
		if (isFishAquarium){
			price = 40;
		}else{
			price = 50;
		}
		for(Ingredient  item: ingredients){
			price += item.getPrice();
		}
		
		return price;
	}

	private String getAquariumContent(){
		String content = "";
		if (isFishAquarium){
			content = String.format("%-25s", "Aquarium F.")+ AQUARIUMFISHPRICE+"$\n";
		}else{
			content = String.format("%-25s", "Aquarium T.")+ AQUARIUMTURTLEPRICE+"$\n";
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
				+ "********************************\n", ID, idClient, aquariumName, getAquariumContent(), getPrice(), aquariumQuantity, getPrice()*aquariumQuantity);
	}
	
}
