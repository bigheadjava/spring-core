package com.cheer.beans.xml.factory;

/**
 * 演示简单工厂模式
 * 
 * @author 程序猿大头
 * 
 *         园丁类
 *
 */
public class Gardener {

	/**
	 * 静态工厂方法 - 负责创建水果实例
	 * 
	 * @param what
	 * @return
	 */
	public static Fruit staticMakeFruit(String what) {
		System.out.println("静态工厂方法...");
		Fruit fruit;
		switch (what) {
		case "Apple":
			fruit = new Apple();
			break;
		case "Grape":
			fruit = new Grape();
			break;
		case "Orange":
			fruit = new Orange();
			break;
		default:
			fruit = null;
			break;
		}
		return fruit;
	}
	
	public Fruit makeFruit(String what) {
		System.out.println("实例工厂方法...");
		Fruit fruit;
		switch (what) {
		case "Apple":
			fruit = new Apple();
			break;
		case "Grape":
			fruit = new Grape();
			break;
		case "Orange":
			fruit = new Orange();
			break;
		default:
			fruit = null;
			break;
		}
		return fruit;
	}
}
