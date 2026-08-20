package com.shapes;
public class Rectangle{
	double length;
	double breadth;
	public Rectangle(double l,double b){
		this.length=l;
		this.breadth=b;
	}
	public double area(){
		return length*breadth;
	}
}
