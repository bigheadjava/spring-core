package com.cheer.ioc.v3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	String name;
	IMedicine medicine;
	
	@Autowired
	public Person(String name, IMedicine medicine) {
		this.name = name;
		this.medicine = medicine;
	}
	
	public void sicked() {
		System.out.println(name + "生病了，需要吃药: " + medicine.toString());
	}
}
