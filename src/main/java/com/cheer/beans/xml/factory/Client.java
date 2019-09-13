package com.cheer.beans.xml.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 演示简单工厂模式
 * 
 * @author 程序猿大头
 * 
 *         客户类
 *
 */
public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"ApplicationContext.xml"});
		Fruit apple = (Fruit) ctx.getBean("gardener_1",Fruit.class);
		apple.plant();
		apple.grow();
		apple.harvest();
		
		Fruit orange = (Fruit) ctx.getBean("gardener_2",Fruit.class);
		orange.plant();
		orange.grow();
		orange.harvest();
	}

}
