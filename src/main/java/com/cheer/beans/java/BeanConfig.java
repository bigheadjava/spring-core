package com.cheer.beans.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean
	public IdCard createIdCard() {
		return new IdCard();
	}
	
	public Person adultPerson() {
		return new Person(createIdCard());
	}
}
