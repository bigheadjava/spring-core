package com.cheer.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.cheer.dao.bean.Staff;
import com.cheer.dao.inter.IStaffDAO;

public class StaffDAOImpl extends JdbcDaoSupport implements IStaffDAO {

	@Override
	public boolean addStaff(Staff staff) {
		String sql = "insert into i_staff (name, age, salary) values(?,?,?)";
		int row = getJdbcTemplate().update(sql, new Object[] {staff.getName(),staff.getAge(),staff.getSalary()});
		if(row > 0) {
			System.out.println("新增员工成功...");
			return true;
		}
		return false;
	}

	@Override
	public List<Staff> queryAllStaff() {
		String sql = "select name, age, salary from i_staff order by id desc";
		//getJdbcTemplate().queryForList(sql)
		return null;
	}

}
