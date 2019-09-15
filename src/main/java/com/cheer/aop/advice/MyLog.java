package com.cheer.aop.advice;

public class MyLog {
	public void log(String message) {
		if (message != null && message.trim().length() > 0) {
			System.out.println("Log: " + message);
		}
	}
}
