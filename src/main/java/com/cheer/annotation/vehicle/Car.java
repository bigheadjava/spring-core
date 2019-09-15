package com.cheer.annotation.vehicle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car extends Vehicle {

	@Value(value = "我是小汽车")
	private String personal;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public String getPersonal() {
		return personal;
	}

	public void setPersonal(String personal) {
		this.personal = personal;
	}

}
