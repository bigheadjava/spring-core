package com.cheer.beans.java;


public class Person {
	private IdCard idCard;
	
	public Person() {}
	
	public Person(IdCard idCard) {
		this.idCard = idCard;
	}

	public IdCard getIdCard() {
		return idCard;
	}

	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
	}
	
	public void speak() {
		if(idCard != null) {
			System.out.println("我已经18岁，我已经成人了有身份证了...");
		}
	}
}
