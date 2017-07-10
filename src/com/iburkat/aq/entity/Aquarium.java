package com.iburkat.aq.entity;

import java.util.ArrayList;

public class Aquarium {
	public final int ID;
	private boolean isFishAquarium;
	private int idClient;
	private String aquariumName;
	private int aquariumCount;
	private ArrayList<Ingredient> ingredients = new ArrayList<>();
	
	public Aquarium(int iD, boolean isFishAquarium, int idClient, String aquariumName, int aquariumCount,
			ArrayList<Ingredient> ingredients) {
		super();
		ID = iD;
		this.isFishAquarium = isFishAquarium;
		this.idClient = idClient;
		this.aquariumName = aquariumName;
		this.aquariumCount = aquariumCount;
		this.ingredients = ingredients;
	}
	
	public Aquarium(int iD, boolean isFishAquarium, int idClient, String aquariumName, int aquariumCount) {
		super();
		ID = iD;
		this.isFishAquarium = isFishAquarium;
		this.idClient = idClient;
		if (aquariumName.length()>4 && aquariumName.length()<20) {
			this.aquariumName = aquariumName;
		}else{
		//throw new incorrectArgumentException("Wrong ID:"+ID);			
		}
		this.aquariumCount = aquariumCount;
	}
	
	public void newComponent(Ingredient newIngredient){
		
	}

	public String Print() {
		return "[ID=" + ID + " : " + idClient + " : " + aquariumName + " : " + aquariumCount + "]" ;
	}


	
	
	
	
	

}
