package gao.dao;

import java.util.List;

import gao.bean.ManagerTable;
import gao.bean.UserTable;

public interface IManagerDao {
	/**
	 * ����Ա��½ϵͳ
	 * @param manager_id
	 * @param password
	 * @return
	 */
	public boolean login(String manager_id,String password);
	/**
	 * ����Ա�����±�
	 * @param tablename
	 * @param obj
	 * @return
	 */
	public Object create(String tablename,Object obj);
	/**
	 * ����ѧ��idɾ��
	 * @param i
	 * @return
	 */
	public int delete(int i);
	/**
	 * ����ѧ��id�޸�
	 * @param user
	 * @param user_id
	 * @return
	 */
	public int update(UserTable user,String user_id);
	
	/**
	 * ����ѧ��id����һ��ѧ����Ϣ
	 * @param user_id
	 * @return
	 */
	public UserTable findByUserId(String user_id);
	/**
	 * ��������ѧ����Ϣ
	 * @return
	 */
	public List<UserTable> findAll();
	/**
	 * ģ������
	 * @param prop
	 * @param value
	 * @return
	 */
	public List<UserTable> findByProperty(String prop,Object value);
	
}
