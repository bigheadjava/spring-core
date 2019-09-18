package com.cheer.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.cheer.dao.base.BaseDAO;
import com.cheer.dao.bean.Account;
import com.cheer.dao.inter.IAccountDAO;
import com.cheer.dao.mapper.AccountMapper;

@Repository
public class AccountDAOImpl extends BaseDAO implements IAccountDAO {

	@Autowired
	private AccountMapper accountMapper;

	@Override
	public int createAccount(Account account) {
		String sql = "insert into i_account(name, money) values(?,?)";
		int count = getJdbcTemplate().update(sql, account.getName(), account.getMoney());
		return count;
	}

	@Override
	public int createAccountInBatch(List<Account> accountList) {
		String sql = "insert into i_account(name, money) values(?,?)";
		int[] arrays = getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Account account = accountList.get(i);
				ps.setString(1, account.getName());
				ps.setBigDecimal(2, account.getMoney());

			}

			@Override
			public int getBatchSize() {
				return accountList.size();
			}
		});
		return arrays.length;
	}

	@Override
	public int updateAccount(Account account) {
		String sql = "update i_account set name = ?, money = ? where id = ?";
		return getJdbcTemplate().update(sql, account.getName(), account.getMoney(), account.getId());
	}

}
