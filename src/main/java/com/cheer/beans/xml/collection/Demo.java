package com.cheer.beans.xml.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "ApplicationContext.xml" });
		XmlCollection collectionBean = (XmlCollection) ctx.getBean("collectionBean");
		
		System.out.println("遍历数组: ");
		for(Object obj : collectionBean.getObjArrays()) {
			System.out.println(obj);
		}
		
		System.out.println("-----------------------------");
		System.out.println("遍历List: ");
		for(Object obj : collectionBean.getList()) {
			System.out.println(obj);
		}
		System.out.println("-----------------------------");
		System.out.println("遍历Set: ");
		Set<Object> sets = collectionBean.getSets();
		Iterator<Object> it = sets.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-----------------------------");
		System.out.println("遍历Map: ");
		Map<String,Object> map = collectionBean.getMap();
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println("-----------------------------");
		System.out.println("获取Properties属性: ");
		System.out.println(collectionBean.getProps());
		
		System.out.println("-----------------------------");
		System.out.println("获取Date属性: ");
		System.out.println(collectionBean.getDate1());
	}

}
