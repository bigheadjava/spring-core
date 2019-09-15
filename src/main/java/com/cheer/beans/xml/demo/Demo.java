package com.cheer.beans.xml.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cheer.beans.xml.Person;

public class Demo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "ApplicationContext.xml" });
		Person person = (Person) ctx.getBean("person");
		System.out.println("Person name: " + person.getName());
		System.out.println("Person medicine: " + person.getMedicine());
		
		Person person_1 = (Person) ctx.getBean("person_1");
		System.out.println("Person name: " + person_1.getName());
		System.out.println("Person medicine: " + person_1.getMedicine());
	}

}
