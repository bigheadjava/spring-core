package com.cheer.beans.xml.factory;

/**
 * 演示简单工厂模式
 * 
 * @author 程序猿大头
 * 
 *         橘子类
 *
 */
public class Orange implements Fruit {

	@Override
	public void plant() {
		System.out.println("种植橘子...");
	}

	@Override
	public void grow() {
		System.out.println("橘子正在生长...");
	}

	@Override
	public void harvest() {
		System.out.println("收获橘子...");

	}

}
