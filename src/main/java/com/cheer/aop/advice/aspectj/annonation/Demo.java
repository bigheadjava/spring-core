package com.cheer.aop.advice.aspectj.annonation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "ApplicationContext-aspectj.xml" });
		IAOPService aopService = (IAOPService) ctx.getBean("aopService2");
		aopService.withAdviceMethod();
		System.out.println("----------------------------------------------");
		aopService.withoutAdviceMethod();
	}

}
