package com.cheer.dao;

import java.math.BigDecimal;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cheer.dao.bean.Account;
import com.cheer.dao.inter.IAccountService;

public class SpringJdbcTransactionManagerTest{
	IAccountService service;
	
	public SpringJdbcTransactionManagerTest() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "ApplicationContext-DAO.xml" });
		service = (IAccountService) ctx.getBean("accountServiceImpl");
	}
	
	@Test
	public void testTransferAccount() {
		Account to = new Account(1, "User_A", new BigDecimal("8111.12"));
		Account from = new Account(2, "User_B", new BigDecimal("21888.88"));
		service.transferAccount(from, to, new BigDecimal("1888.88"));
	}
}
