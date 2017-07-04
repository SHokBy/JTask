package com.iburkat.pyramid.action;

import com.iburkat.pyramid.entity.Pyramid;

public class Action {
	public static double calculatePyramidVolume(Pyramid pyramid){
		double p = (pyramid.calculateLength(pyramid.getA(), pyramid.getB())+pyramid.calculateLength(pyramid.getB(), pyramid.getC())+pyramid.calculateLength(pyramid.getC(), pyramid.getA()))/2;
		double s = Math.pow((p*(p-pyramid.calculateLength(pyramid.getA(), pyramid.getB()))*(p-pyramid.calculateLength(pyramid.getB(), pyramid.getC()))*(p-pyramid.calculateLength(pyramid.getC(), pyramid.getA()))),2);
		
		return s;
	}

	public static double calculatePyramidSquare(Pyramid pyramid){
		
		return pyramid.a.getX()+pyramid.a.getY()+pyramid.a.getZ()+pyramid.b.getX()+pyramid.b.getY()+pyramid.b.getZ()+pyramid.c.getX()+pyramid.c.getY()+pyramid.c.getZ()+pyramid.top.getX()+pyramid.top.getY()+pyramid.top.getZ();

	}
	
	public static double calculateRationVolume(Pyramid pyramid){
		return pyramid.a.getX()+pyramid.a.getY()+pyramid.a.getZ()+pyramid.b.getX()+pyramid.b.getY()+pyramid.b.getZ()+pyramid.c.getX()+pyramid.c.getY()+pyramid.c.getZ()+pyramid.top.getX()+pyramid.top.getY()+pyramid.top.getZ();
	}
}
