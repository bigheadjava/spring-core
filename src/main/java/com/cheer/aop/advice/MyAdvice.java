package com.cheer.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class MyAdvice extends MyLog implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		log("执行方法 => " + method.getName() + " 之前");
	}

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		log("执行方法 => " + method.getName() + " 之后，该方法返回值: " + returnValue);
	}
	
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
		log("执行方法 => " + method.getName() + " 发生异常: " + ex.getMessage());
	}

}
