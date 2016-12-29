package com.galvanize.game;

public class Vector {
	
	private int x;
	private int y;
	
	public Vector(int x, int y){
		setX(x);
		setY(y);
	}
	
	public Vector add(Vector other){
		return new Vector(getX() + other.getX(), getY() + other.getY());
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}