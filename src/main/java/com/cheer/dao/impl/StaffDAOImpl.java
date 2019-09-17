package com.cheer.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.cheer.dao.base.BaseDAO;
import com.cheer.dao.bean.Staff;
import com.cheer.dao.inter.IStaffDAO;
import com.cheer.dao.mapper.StaffRowMapper;

@Repository
public class StaffDAOImpl extends BaseDAO implements IStaffDAO {

	@Autowired
	private StaffRowMapper staffRowMapper;

	@Override
	public int addStaff(Staff staff) {
		String sql = "insert into i_staff (name, age, salary) values(?,?,?)";
		int count = getJdbcTemplate().update(sql, new Object[] { staff.getName(), staff.getAge(), staff.getSalary() });
		return count;
	}

	@Override
	public Staff getStaffById(int id) {
		String sql = "select id, name, age, salary from i_staff where id = ?";
		Staff staff = getJdbcTemplate().queryForObject(sql, new Object[] { id }, staffRowMapper);
		return staff;
	}

	@Override
	public List<Staff> queryAllStaff() {
		return queryStaff(null, null, null);
	}

	@Override
	public List<Staff> queryStaff(String name, Integer age, Double salary) {
		StringBuffer sql = new StringBuffer("select id, name, age, salary from i_staff where 1=1 ");
		List<Object> paramList = new ArrayList<Object>();
		if (name != null && !"".equals(name.trim())) {
			sql.append(" and name = ? ");
			paramList.add(name);
		}
		if (age != null && age > 18) {
			sql.append(" and age = ? ");
			paramList.add(age);
		}

		if (salary != null && salary > 0) {
			sql.append(" and salary > ? ");
			paramList.add(salary);
		}
		List<Staff> staffList = getJdbcTemplate().query(sql.toString(), paramList.toArray(), staffRowMapper);
		return staffList;
	}

	@Override
	public int queryStaffCount(String name, Integer age, Double salary) {
		StringBuffer sql = new StringBuffer("select count(*) from i_staff where 1=1 ");
		List<Object> paramList = new ArrayList<Object>();
		if (name != null && !"".equals(name.trim())) {
			sql.append(" and name = ? ");
			paramList.add(name);
		}
		if (age != null && age > 18) {
			sql.append(" and age = ? ");
			paramList.add(age);
		}

		if (salary != null && salary > 0) {
			sql.append(" and salary > ? ");
			paramList.add(salary);
		}
		return getJdbcTemplate().queryForObject(sql.toString(), paramList.toArray(), Integer.class);
	}

	@Override
	public int queryAllStaffCount() {
		return queryStaffCount(null, null, null);
	}

	@Override
	public int addStaffInBatch(List<Staff> staffList) {
		String sql = "insert into i_staff (name, age, salary) values(?,?,?)";
		int[] array = getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Staff staff = staffList.get(i);
				ps.setString(1, staff.getName());
				ps.setInt(2, staff.getAge());
				ps.setDouble(3, staff.getSalary());
			}

			@Override
			public int getBatchSize() {
				return staffList.size();
			}
		});
		return array.length;
	}

	@Override
	public int updateStaff(Staff staff) {
		String sql = "update i_staff set name = ?, age = ?, salary = ? where id = ?";
		int count = getJdbcTemplate().update(sql, staff.getName(),staff.getAge(),staff.getSalary(),staff.getId());
		return count;
	}

	@Override
	public int deleteStaff(Staff staff) {
		String sql = "delete from i_staff where id = ? ";
		int count = getJdbcTemplate().update(sql, staff.getId());
		return count;
	}

}
