package com.cheer.beans.xml;

public class Person {
	private IMedicine medicine;

	private String name;

	public Person() {
	}

	public Person(String name, IMedicine medicine) {
		super();
		this.name = name;
		this.medicine = medicine;
	}

	public IMedicine getMedicine() {
		return medicine;
	}

	public void setMedicine(IMedicine medicine) {
		this.medicine = medicine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void init() {
		System.out.println("初始化代码....");
	}
	
	public void destroy() {
		System.out.println("销毁代码....");
	}
}
