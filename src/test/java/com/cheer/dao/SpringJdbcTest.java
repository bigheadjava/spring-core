package com.cheer.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cheer.dao.bean.Staff;
import com.cheer.dao.inter.IStaffDAO;

public class SpringJdbcTest{

	IStaffDAO dao;

	public SpringJdbcTest() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "ApplicationContext-DAO.xml" });
		dao = (IStaffDAO) ctx.getBean("staffDAOImpl");
	}

	@Ignore
	public void testAddStaff() {
		Staff staff = new Staff("张三", 22, 6500.00); 
		int count = dao.addStaff(staff);
		assertEquals(1, count);
	}

	@Ignore
	public void testGetStaffById() {
		Staff staff = dao.getStaffById(1);
		if (staff != null)
			System.out.println(staff.toString());
		assertNotNull(staff);
	}

	@Ignore
	public void testQueryAllStaff() {
		List<Staff> list = dao.queryAllStaff();
		for (Staff staff : list) {
			System.out.println(staff.toString());
		}
	}
	
	@Ignore
	public void testQueryStaff() {
		List<Staff> list = dao.queryStaff(null, null, 10000d);
		for (Staff staff : list) {
			System.out.println(staff.toString());
		}
	}
	
	@Ignore
	public void testQueryStaffCount() {
		int count = dao.queryStaffCount(null, null, 10000d);
		System.out.println("本次查询到 " + count + " 条记录...");
	}
	
	@Test
	public void testQueryAllStaffCount() {
		int count = dao.queryStaffCount(null, null, null);
		System.out.println("本次查询到 " + count + " 条记录...");
	}

	@Ignore
	public void testAddStaffInBatch() {
		List<Staff> list = new ArrayList<Staff>();
		for (int i = 1; i <= 500; i++) {
			String name = "NAME_" + i;
			int age = (int)((Math.random()) * 100);;
			double salary = (Math.random()) * 20000;
			BigDecimal decimal = new BigDecimal(salary);
			salary = decimal.setScale(2, BigDecimal.ROUND_DOWN).doubleValue();
			Staff staff = new Staff(name, age, salary);
			list.add(staff);
		}
		dao.addStaffInBatch(list);
	}
	
	@Ignore
	public void testUpdateStaff() {
		Staff staff = new Staff("张三",28,30000d);
		staff.setId(800);
		int count  = dao.updateStaff(staff);
		assertEquals(1, count);
	}
	
	@Ignore
	public void testDeleteStaff() {
		Staff staff = new Staff("张三",28,30000d);
		staff.setId(800);
		int count  = dao.deleteStaff(staff);
		assertEquals(1, count);
	}

}
