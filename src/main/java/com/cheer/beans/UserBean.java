package com.cheer.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserBean implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(beanFactory);
	}

	@Override
	public void setBeanName(String name) {
		System.out.println(name);
	}

}
