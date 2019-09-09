package com.cheer.ioc.v2;

public class Person {
	String name;
	IMedicine medicine;
	
	public Person(String name, IMedicine medicine) {
		this.name = name;
		this.medicine = medicine;
	}
	
	public void sicked() {
		System.out.println(name + "生病了，需要吃药: " + medicine.toString());
	}
}
