package com.cheer.ioc.v3;

import org.springframework.stereotype.Component;

@Component
public class Medicine1 implements IMedicine{
	
	String name;

	public String toString() {
		return "name";
	}

}
