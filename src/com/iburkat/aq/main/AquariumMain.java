package com.iburkat.aq.main;

import com.iburkat.aq.entity.Aquarium;
import com.iburkat.aq.entity.Ingredient;

public class AquariumMain {
	
	public static void main(String[] args){
		
		Aquarium aq = new Aquarium(23658,false, 478, "Table Aquarium", 1);
		System.out.println(aq.print());

		Aquarium aq2 = new Aquarium(23659,true, 578, "Rectangular Aquarium", 3);
		System.out.println(aq2.print());
		
		aq.newComponent(Ingredient.TURTLE);
		aq.newComponent(Ingredient.SEASHELL);
		aq.newComponent(Ingredient.SAND);
		
		aq2.newComponent(Ingredient.FISH);
		aq2.newComponent(Ingredient.CASTLE);
		aq2.newComponent(Ingredient.SEAWEED);
		aq2.newComponent(Ingredient.AQUARIUMEQUIPMENT);
		
		
		System.out.println(aq.printCheck());
		System.out.println(aq2.printCheck());

	}

}
