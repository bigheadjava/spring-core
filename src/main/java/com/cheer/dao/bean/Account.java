package com.cheer.dao.bean;

import java.math.BigDecimal;

public class Account {

	private int id;

	private String name;

	private BigDecimal money;

	public Account() {
	}

	public Account(String name, BigDecimal money) {
		this.name = name;
		this.money = money;
	}
	
	public Account(int id, String name, BigDecimal money) {
		this.id = id;
		this.name = name;
		this.money = money;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

}
