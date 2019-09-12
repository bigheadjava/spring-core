package com.cheer.aop.proxy.statical;

import com.cheer.aop.proxy.IService;
import com.cheer.aop.proxy.ServiceImplA;

public class Demo {
	
	public static void main(String[] args) {
		IService service = new ServiceImplA();
		service = new MyProxy(service);
		service.service("spring");
	}
}
