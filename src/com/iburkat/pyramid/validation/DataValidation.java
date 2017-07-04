package com.iburkat.pyramid.validation;

import com.iburkat.pyramid.entity.*;


public class DataValidation {
	public static boolean isFigurePyramid (Pyramid figure){
		return true;
	}

	public static boolean isThreePointsOnLine(Point a, Point b, Point c){
		return true;
	}
	
	public static boolean isCountOfElementsCorrect(String[] imputRow){
		if (imputRow.length == 12){
			return true;			
		}
		else{ 
			return false;
		}
		
	}

}
