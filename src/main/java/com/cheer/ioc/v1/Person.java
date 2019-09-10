package com.cheer.ioc.v1;

public class Person {
	Medicine medicine;
	
	public Person(Medicine medicine) {
		this.medicine = medicine;
	}
	
	public void sicked() {
		System.out.println(this.medicine.toString());
	}
}
