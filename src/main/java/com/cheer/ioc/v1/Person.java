package com.cheer.ioc.v1;

public class Person {
	String name;
	Medicine medicine;
	
	public Person(String name, Medicine medicine) {
		this.name = name;
		this.medicine = medicine;
	}
	
	public void sicked() {
		System.out.println(name + "生病了，需要吃药: " + medicine.toString());
	}
}
