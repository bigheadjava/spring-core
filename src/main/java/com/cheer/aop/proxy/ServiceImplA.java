package com.cheer.aop.proxy;

public class ServiceImplA implements IService {

	@Override
	public void service(String name) {
		System.out.println("ServiceImplA name: " + name);
	}

}
