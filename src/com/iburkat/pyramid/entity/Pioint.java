package com.iburkat.pyramid.entity;

public class Pioint {
	private int x;
	private int y;
	private int z;
	
	public void setPoint(int osX, int osY, int osZ){
		x = osX;
		y = osY;
		z = osZ;
	}
	
	public void Point(int osX, int osY, int osZ) {
		x = osX;
		y = osY;
		z = osZ;
	}  

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

}