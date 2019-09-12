package com.cheer.aop.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler {
	
	private Object target;
	
	public MyProxy() {}
	
	public MyProxy(Object target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("调用service方法之前log...");
		System.out.println("Method: " + method);
		System.out.println("args: " + args);
		System.out.println("target: " + target);
		Object result =  method.invoke(target, args);
		System.out.println("调用service方法之后log...");
		return result;
	}

}
