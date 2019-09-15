package com.cheer.aop.advice.aspectj.annonation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("aopService2")
public class AOPServiceImpl implements IAOPService {
	@Value("xxxxx")
	private String description;
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String withAdviceMethod() throws Exception {
		System.out.println("AspectJ====== 执行 withAdviceMethod ======");
		if(description == null || description.trim().length() == 0) {
			throw new Exception("description属性不能为空...");
		}
		return description;
	}

	@Override
	public String withoutAdviceMethod() throws Exception {
		System.out.println("AspectJ====== 执行 withAdviceMethod ======");
		return description;
	}

}
