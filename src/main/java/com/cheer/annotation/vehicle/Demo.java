package com.cheer.annotation.vehicle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "ApplicationContext-an.xml" });
		Car car = (Car) ctx.getBean("car");
		System.out.println(car.getPersonal());
		System.out.println(car.getBrand());
		System.out.println(car.getModel());
		System.out.println(car.getEngine().getEngineNo());
		
		Car car1 = (Car) ctx.getBean("car");
		System.out.println(car);
		System.out.println(car1);
	}

}
