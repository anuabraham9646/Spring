package com;

public class Xyz {
	String name;
	
	public Xyz(String name){
		this.name= name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Xyz [name=" + name + "]";
	}

}