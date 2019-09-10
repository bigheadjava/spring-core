package com.cheer.ioc.v3;

import org.springframework.stereotype.Component;

@Component("medicine2")
public class Medicine2 implements IMedicine{
	
	public String toString() {
		return "Medicine2";
	}

}
