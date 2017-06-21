package com.iburkat.pyramid.entity;

public class Pyramid {
	public Point a;
	public Point b;
	public Point c;
	public Point top;
	
	public Pyramid(Point a, Point b, Point c, Point top){
		this.a = a;
		this.b = b;
		this.c = c;
		this.top = top;
	}
	 
	public Point getA() {
		return a;
	}

	public Point getB() {
		return b;
	}

	public Point getC() {
		return c;
	}

	public Point getTop() {
		return top;
	}
	
	public double calculateLength(Point a, Point b){
		return Math.sqrt(Math.pow((a.getX()-b.getX()),2)+Math.pow((a.getY()-b.getY()),2)+Math.pow((a.getZ()-b.getZ()),2));
	}

}
