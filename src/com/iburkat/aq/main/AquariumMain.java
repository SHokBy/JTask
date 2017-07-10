package com.iburkat.aq.main;

import com.iburkat.aq.entity.Aquarium;

public class AquariumMain {
	
	public static void main(String[] args){
		
		Aquarium aq = new Aquarium(23658,true, 478, "Table Aquarium", 1);
		System.out.println(aq.Print());
	}

}
