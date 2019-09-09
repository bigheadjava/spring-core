package com.cheer.annotation;

@ClassDescription(description = "子类")
@ClassDescription(description = "员工")
public class Staff extends Person {
	private String staffNo;

	public String getStaffNo() {
		return staffNo;
	}

	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}

}
