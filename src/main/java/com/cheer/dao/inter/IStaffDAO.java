package com.cheer.dao.inter;

import java.util.List;

import com.cheer.dao.bean.Staff;

public interface IStaffDAO {
	
	/**
	 * 插入数据
	 * @param staff
	 * @return
	 */
	public int addStaff(Staff staff);
	/**
	 * 根据主键查询记录
	 * @param id
	 * @return
	 */
	public Staff getStaffById(int id);
	/**
	 * 查询所有记录
	 * @return
	 */
	public List<Staff> queryAllStaff();
	/**
	 * 根据条件进行查询
	 * @param name
	 * @param age
	 * @param salary
	 * @return
	 */
	public List<Staff> queryStaff(String name, Integer age, Double salary);
	/**
	 * 根据条件查询记录数
	 * @param name
	 * @param age
	 * @param salary
	 * @return
	 */
	public int queryStaffCount(String name, Integer age, Double salary);
	/**
	 * 查询所有记录数
	 * @return
	 */
	public int queryAllStaffCount();
	/**
	 * 批量插入数据
	 * @param staffList
	 * @return
	 */
	public int addStaffInBatch(List<Staff> staffList);
	
	/**
	 * 更新单笔记录
	 * @param staff
	 * @return
	 */
	public int updateStaff(Staff staff);
	/**
	 * 删除单笔记录
	 * @param staff
	 * @return
	 */
	public int deleteStaff(Staff staff);
}
