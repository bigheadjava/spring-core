package com.cheer.dao.inter;

import java.math.BigDecimal;

import com.cheer.dao.bean.Account;

public interface IAccountService {
	
	public void transferAccount(Account fromAccount, Account toAccount, BigDecimal amount);
}
