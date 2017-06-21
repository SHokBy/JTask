package com.iburkat.pyramid.action;

import com.iburkat.pyramid.entity.Pyramid;

public class Action {
	public double calculatePyramidVolume(Pyramid pyramid){
		double p = (pyramid.calculateLength(pyramid.getA(), pyramid.getB())+pyramid.calculateLength(pyramid.getB(), pyramid.getC())+pyramid.calculateLength(pyramid.getC(), pyramid.getA()))/2;
		double s = Math.pow((p*(p-pyramid.calculateLength(pyramid.getA(), pyramid.getB()))*(p-pyramid.calculateLength(pyramid.getB(), pyramid.getC()))*(p-pyramid.calculateLength(pyramid.getC(), pyramid.getA()))),2);
		
		return s;
	}

	public double calculatePyramidSquare(Pyramid pyramid){
		double s = 5;
		
		return s;
	}
	
	public double calculateRationVolume(){
		return 0;
	}
}
