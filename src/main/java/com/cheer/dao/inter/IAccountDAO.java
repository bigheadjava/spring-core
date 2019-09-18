package com.cheer.dao.inter;

import java.util.List;

import com.cheer.dao.bean.Account;

public interface IAccountDAO {
	
	public int createAccount(Account account);
	
	public int createAccountInBatch(List<Account> accountList);
	
	public int updateAccount(Account account);
}


