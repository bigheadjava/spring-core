package com.cheer.dao.bean;

public class Staff {

	private int id;

	private String name;
	private int age;
	private double salary;

	public Staff() {

	}

	public Staff(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "员工编号: " + this.id + "; 员工姓名: " + this.name + "; 员工年龄: " + this.age + "; 员工薪资: " + this.salary;
	}
}
