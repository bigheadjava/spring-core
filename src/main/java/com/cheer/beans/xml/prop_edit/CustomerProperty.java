package com.cheer.beans.xml.prop_edit;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CustomerProperty extends PropertyEditorSupport {

	private String pattern = "yyyy-MM-dd";

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			this.setValue(sdf.parse(text));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
