package com.cheer.beans.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "ApplicationContext.xml" });
		BeanConfig beanConfig = (BeanConfig) ctx.getBean("beanConfig");
		beanConfig.adultPerson().speak();
	}

}
