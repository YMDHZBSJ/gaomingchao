package gao.dao;

import gao.bean.UserTable;

public interface IUserDao {
	/**
	 * 学生登陆系统
	 * @param manager_id
	 * @param password
	 * @return
	 */
	public boolean login(String user_id,String user_password);
	/**
	 * 填写表单
	 * @param user
	 * @return
	 */
	public int add(UserTable user);
	/**
	 * 修改自己已填的数据
	 * @param user
	 * @param user_id
	 * @return
	 */
	public int update(UserTable user,String user_id);
	
	/**
	 * 查找自己所提交的信息
	 * @param i
	 * @return
	 */
	public UserTable findByUserId(String i);
}
	
