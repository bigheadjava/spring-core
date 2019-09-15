package com.cheer.dao.inter;

import java.util.List;

import com.cheer.dao.bean.Staff;

public interface IStaffDAO {
	
	public boolean addStaff(Staff staff);
	
	public List<Staff> queryAllStaff();
}
