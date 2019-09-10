package com.cheer.ioc.v3;

import org.springframework.stereotype.Component;

@Component("medicine1")
public class Medicine1 implements IMedicine{
	
	public String toString() {
		return "Medicine1";
	}

}
