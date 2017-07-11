package com.iburkat.aq.entity;

import java.util.ArrayList;

public class Aquarium {
	public final int ID;
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

	public double getPrice() {
		double price = 0;
		if (isFishAquarium == true){
			price = 40;
		}else{
			price = 50;
		}
		for(Ingredient  item: ingredients){
			price += item.getPrice();
		}
		
		return price;
	}

	public String getAquariumContent(){
		String content = "";
		String delimeter = " ";
		for (Ingredient item: ingredients){
			delimeter = new String(new char[25-item.name().length()]).replace("\0", " ");
			content += item.name()+delimeter+item.getPrice()+"$\n";
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
				+ "Total:                   %5$.1f$\n"
				+ "Quantity:                %6$d\n"
				+ "--------------------------------\n"
				+ "Total price:             %7$.1f$\n"
				+ "********************************\n", ID, idClient, aquariumName, getAquariumContent(), getPrice(), aquariumQuantity, getPrice()*aquariumQuantity);
	}
	
}
