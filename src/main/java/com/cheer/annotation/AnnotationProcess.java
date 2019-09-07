package com.cheer.annotation;

public class AnnotationProcess {

	public static void main(String[] args) {
		ClassDescriptions classDescriptions = new Staff().getClass().getAnnotation(ClassDescriptions.class);
		for(ClassDescription cd : classDescriptions.value()) {
			System.out.println("Description: " + cd.description());
		}
	}

}
