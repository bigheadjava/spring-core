package com.cheer.aop.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.cheer.aop.proxy.IService;
import com.cheer.aop.proxy.ServiceImplA;

public class Demo {

	public static void main(String[] args) {
		IService service = new ServiceImplA();
		InvocationHandler handler = new MyProxy(service);
		
		IService proxy = (IService) Proxy.newProxyInstance(service.getClass().getClassLoader(), new Class[] {IService.class}, handler);
		proxy.service("spring");
	} 

}
