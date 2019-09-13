package com.cheer.beans.xml.factory;

/**
 * 演示简单工厂模式
 * 
 * @author 程序猿大头
 * 
 *         葡萄类
 *
 */
public class Grape implements Fruit {
	private boolean seedless; // 有没有籽

	@Override
	public void plant() {
		System.out.println("种植葡萄...");
	}

	@Override
	public void grow() {
		System.out.println("葡萄正在生长...");
	}

	@Override
	public void harvest() {
		System.out.println("收获葡萄...");

	}

	public boolean isSeedless() {
		return seedless;
	}

	public void setSeedless(boolean seedless) {
		this.seedless = seedless;
	}

}
