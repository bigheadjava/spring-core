package com.cheer.beans.life;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "ApplicationContext2.xml" });
		BeanLife life = (BeanLife) ctx.getBean("beanLife");
		System.out.println("====== " + life.getName());
		ctx.close();
	}

}
