package com.cheer.annotation;

@ClassDescription(description = "父类")
@ClassDescription(description = "人")
public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
