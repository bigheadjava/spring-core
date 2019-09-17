package com.cheer.dao.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cheer.dao.bean.Staff;
import com.cheer.dao.inter.IStaffDAO;

public class StaffDAOClient {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "ApplicationContext-DAO.xml" });
		IStaffDAO staffDAO = (IStaffDAO) ctx.getBean("staffDAOImpl");
//		staffDAO.addStaff(staff);
//		List<Staff> staffList = staffDAO.queryAllStaff();
//		for(Staff s : staffList) {
//			System.out.println(s.toString());
//			System.out.println("--------------");
//		}
		Staff  staff = staffDAO.getStaffById(6);
		System.out.println(staff.toString());
	}

}
