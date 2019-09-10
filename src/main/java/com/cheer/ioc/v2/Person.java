package com.cheer.ioc.v2;

public class Person {
	IMedicine medicine;
	
	public Person(IMedicine medicine) {
		this.medicine = medicine;
	}
	
	public void sicked() {
		System.out.println(this.medicine.toString());
	}
}
