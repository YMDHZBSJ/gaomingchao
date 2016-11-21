package gao.dao;

import gao.bean.UserTable;

public interface IUserDao {
	/**
	 * ѧ����½ϵͳ
	 * @param manager_id
	 * @param password
	 * @return
	 */
	public boolean login(String user_id,String user_password);
	/**
	 * ��д��
	 * @param user
	 * @return
	 */
	public int add(UserTable user);
	/**
	 * �޸��Լ����������
	 * @param user
	 * @param user_id
	 * @return
	 */
	public int update(UserTable user,String user_id);
	
	/**
	 * �����Լ����ύ����Ϣ
	 * @param i
	 * @return
	 */
	public UserTable findByUserId(String i);
}
	
