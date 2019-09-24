package com.cheer.dao.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cheer.dao.bean.Account;
import com.cheer.dao.inter.IAccountDAO;
import com.cheer.dao.inter.IAccountService;

@Service
public class AccountServiceImpl implements IAccountService {
	
	@Autowired
	IAccountDAO dao;

	@Override
	public void transferAccount(Account fromAccount, Account toAccount, BigDecimal amount) {
		fromAccount.setMoney(fromAccount.getMoney().subtract(new BigDecimal(String.valueOf(amount))));
		dao.updateAccount(fromAccount);
		int i = 1/0;
		toAccount.setMoney(toAccount.getMoney().add(new BigDecimal(String.valueOf(amount))));
		dao.updateAccount(toAccount);
	}

}
