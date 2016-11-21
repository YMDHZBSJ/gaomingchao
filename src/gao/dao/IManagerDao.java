package gao.dao;

import java.util.List;

import gao.bean.ManagerTable;
import gao.bean.UserTable;

public interface IManagerDao {
	/**
	 * 管理员登陆系统
	 * @param manager_id
	 * @param password
	 * @return
	 */
	public boolean login(String manager_id,String password);
	/**
	 * 管理员创建新表
	 * @param tablename
	 * @param obj
	 * @return
	 */
	public Object create(String tablename,Object obj);
	/**
	 * 根据学生id删除
	 * @param i
	 * @return
	 */
	public int delete(int i);
	/**
	 * 根据学生id修改
	 * @param user
	 * @param user_id
	 * @return
	 */
	public int update(UserTable user,String user_id);
	
	/**
	 * 根据学生id查找一个学生信息
	 * @param user_id
	 * @return
	 */
	public UserTable findByUserId(String user_id);
	/**
	 * 查找所有学生信息
	 * @return
	 */
	public List<UserTable> findAll();
	/**
	 * 模糊查找
	 * @param prop
	 * @param value
	 * @return
	 */
	public List<UserTable> findByProperty(String prop,Object value);
	
}
