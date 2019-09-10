package com.cheer.ioc.v3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	IMedicine medicine;
	
	public Person(@Qualifier("medicine1")IMedicine medicine) {
		this.medicine = medicine;
	}
	
	public void sicked() {
		System.out.println(this.medicine.toString());
	}
}
