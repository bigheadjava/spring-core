package com.cheer.beans.xml.factory;

/**
 * 演示简单工厂模式
 * 
 * @author 程序猿大头
 * 
 *         苹果类
 *
 */
public class Apple implements Fruit {
	private int age; // 苹果树龄

	@Override
	public void plant() {
		System.out.println("种植苹果...");
	}

	@Override
	public void grow() {
		System.out.println("苹果正在生长...");
	}

	@Override
	public void harvest() {
		System.out.println("收获苹果...");

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
