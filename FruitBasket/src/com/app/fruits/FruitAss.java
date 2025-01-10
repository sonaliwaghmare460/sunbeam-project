package com.app.fruits;


public class FruitAss {
	String color;
	double weight;
	String name;
	boolean isFresh;
	
	public FruitAss(String name,String color,double weight,boolean isFresh) {
		this.name=name;
		this.color=color;
		this.weight=weight;
		this.isFresh=isFresh;
	}
	
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isFresh() {
		return isFresh;
	}


	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}


	public String taste() {
		return "no specific taste";
		
	}
	@Override
	public String toString() {
		return "fruit[name"+name+",color="+color+",weight="+weight+"]";
	}
	
	
}