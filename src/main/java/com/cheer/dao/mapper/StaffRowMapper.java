package com.cheer.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.cheer.dao.bean.Staff;

@Component
public class StaffRowMapper implements RowMapper<Staff> {

	@Override
	public Staff mapRow(ResultSet rs, int rowNum) throws SQLException {
		Staff staff = new Staff();
		staff.setId(rs.getInt("id"));
		staff.setName(rs.getString("name"));
		staff.setAge(rs.getInt("age"));
		staff.setSalary(rs.getDouble("salary"));
		return staff;
	}

}
