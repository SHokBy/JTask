package com.iburkat.pyramid.action;

import com.iburkat.pyramid.entity.Point;
import com.iburkat.pyramid.entity.Pyramid;

public class Action {
	public static double calculatePyramidVolume(Pyramid pyramid){
		double p = (calculateLength(pyramid.getA(), pyramid.getB())+calculateLength(pyramid.getB(), pyramid.getC())+calculateLength(pyramid.getC(), pyramid.getA()))/2;
		double s = Math.pow((p*(p-calculateLength(pyramid.getA(), pyramid.getB()))*(p-calculateLength(pyramid.getB(), pyramid.getC()))*(p-calculateLength(pyramid.getC(), pyramid.getA()))),2);
		
		return s;
	}

	public static double calculatePyramidSquare(Pyramid pyramid){
		
		return pyramid.a.getX()+pyramid.a.getY()+pyramid.a.getZ()+pyramid.b.getX()+pyramid.b.getY()+pyramid.b.getZ()+pyramid.c.getX()+pyramid.c.getY()+pyramid.c.getZ()+pyramid.top.getX()+pyramid.top.getY()+pyramid.top.getZ();

	}
	
	public static double calculateRationVolume(Pyramid pyramid){
		return pyramid.a.getX()+pyramid.a.getY()+pyramid.a.getZ()+pyramid.b.getX()+pyramid.b.getY()+pyramid.b.getZ()+pyramid.c.getX()+pyramid.c.getY()+pyramid.c.getZ()+pyramid.top.getX()+pyramid.top.getY()+pyramid.top.getZ();
	}
	
	public static double calculateLength(Point a, Point b){
		return Math.sqrt(Math.pow((a.getX()-b.getX()),2)+Math.pow((a.getY()-b.getY()),2)+Math.pow((a.getZ()-b.getZ()),2));
	}

}
