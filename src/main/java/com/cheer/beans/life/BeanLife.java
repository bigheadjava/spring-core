package com.cheer.beans.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanLife
		implements BeanNameAware, BeanFactoryAware, DisposableBean, InitializingBean, ApplicationContextAware {
	
	private String name;
	
	public BeanLife() {
		System.out.println("构造方法被调用...");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("set方法被调用...");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContextAware的方法setApplicationContext被调用...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean的方法afterPropertiesSet被调用...");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean的方法destroy被调用...");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryAware的方法setBeanFactory被调用...");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware的方法setBeanName被调用...");
	}
	
	public void myInit() {
		System.out.println("自定义初始化函数myInit被调用...");
	}
	
	public void myDestroy() {
		System.out.println("自定义销毁函数myDestroy被调用...");
	}

}
