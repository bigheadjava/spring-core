package com.cheer.aop.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "ApplicationContext-AOP.xml" });
		IAOPService aopService = (IAOPService) ctx.getBean("proxyService");
		aopService.withAdviceMethod();
		System.out.println("----------------------------------------------");
		aopService.withoutAdviceMethod();
	}

}
