package com.cheer.aop.proxy.statical;

import com.cheer.aop.proxy.IService;

public class MyProxy implements IService {
	
	private IService service;
	
	public MyProxy() {}
	
	public MyProxy(IService service) {
		this.service = service;
	}

	@Override
	public void service(String name) {
		System.out.println("调用service方法之前log...");
		service.service(name);
		System.out.println("调用service方法之后log...");
	}

}
