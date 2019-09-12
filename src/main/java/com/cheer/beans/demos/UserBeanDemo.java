package com.cheer.beans.demos;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cheer.beans.UserBean;

public class UserBeanDemo {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"ApplicationContext.xml"});
		BeanFactory factory = ctx;
		UserBean userBean = (UserBean) factory.getBean("userBean");
		userBean.destroy();
	}

}
