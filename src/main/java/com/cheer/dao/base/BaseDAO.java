package com.cheer.dao.base;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDAO extends JdbcDaoSupport {
	
	@Resource(name="dataSource")
	public void initDataSource(DataSource ds) {
		super.setDataSource(ds);
	}

}
