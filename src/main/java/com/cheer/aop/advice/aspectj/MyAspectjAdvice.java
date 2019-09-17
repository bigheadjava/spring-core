package com.cheer.aop.advice.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectjAdvice {
	
	public void beforeAdvice() {
		System.out.println("执行前置通知...");
	}
	
	public void afterAdvice() {
		System.out.println("执行后置通知...");
	}
	
	public void afterReturnAdvice(String result) {
		System.out.println("执行了返回通知...返回结果: " + result);
	}
	
	public String aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		String result = "";
		try {
			System.out.println("开始执行环绕通知...");
			long start = System.currentTimeMillis();
			result = (String) proceedingJoinPoint.proceed();
			long end = System.currentTimeMillis();
			System.out.println("执行环绕通知完毕...");
			System.out.println("执行目标业务方法耗时: " + (end-start) + "毫秒");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public void throwingAdvice(JoinPoint joinPoint, Exception e) {
		StringBuffer sb = new StringBuffer();
		sb.append("异常通知执行了: ")
			.append("方法: ").append(joinPoint.getSignature().getName())
				.append("发生了异常...")
				.append("异常信息: ").append(e.getMessage());
		System.out.println(sb.toString());
	}
}
