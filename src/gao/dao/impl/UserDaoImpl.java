package gao.dao.impl;

import gao.bean.UserTable;
import gao.dao.IUserDao;
import gao.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements IUserDao {
	@Override
	public int add(UserTable user) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO info_user (user_id,user_name,user_dept,user_sex,user_job,user_type,user_password) VALUES(?,?,?,?,?,?,?)";
		int result=0;
		PreparedStatement ps=DbUtil.executePreparedStatement(sql);
		try {
			ps.setString(1, user.getUser_id());
			ps.setString(2, user.getUser_name());
			ps.setString(3, user.getUser_dept());
			ps.setString(4, user.getUser_sex());
			ps.setString(6, user.getUser_type());
			ps.setString(5, user.getUser_job());
			ps.setString(7, user.getUser_password());
			result=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DbUtil.close();
		return result;
	}
	@Override
	public int update(UserTable user, String user_id) {
		// TODO Auto-generated method stub
		String sql="UPDATE info_user SET user_name=?,user_dept=?,user_sex=?,user_job=?,user_type=?,user_password=? WHERE user_id=?";
		int result=0;
		PreparedStatement ps =DbUtil.executePreparedStatement(sql);
		try {
			ps.setString(7, user.getUser_id());
			ps.setString(1, user.getUser_name());
			ps.setString(2, user.getUser_dept());
			ps.setString(3, user.getUser_sex());
			ps.setString(4, user.getUser_type());
			ps.setString(5, user.getUser_job());
			ps.setString(6, user.getUser_password());
			result=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DbUtil.close();
		return result;
	}

	@Override
	public UserTable findByUserId(String user_id) {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM info_user WHERE user_id='" + user_id + "'";
		ResultSet rs=null;
		rs=DbUtil.executeQuery(sql);
		UserTable user=new UserTable();
		try {
			if(rs.next())
			{
				user.setUser_id(rs.getString("user_id"));;
				user.setUser_name(rs.getString("user_name"));
				user.setUser_sex(rs.getString("user_sex"));
				user.setUser_dept(rs.getString("user_dept"));
				user.setUser_job(rs.getString("user_job"));
				user.setUser_type(rs.getString("user_type"));
				user.setUser_password(rs.getString("user_password"));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DbUtil.close();
		return null;
	}
	@Override
	public boolean login(String user_id, String user_password) {
		String sql = "SELECT * FROM info_user WHERE user_id=? and user_password=?";
		ResultSet rs = null;
		PreparedStatement ps = DbUtil.executePreparedStatement(sql);
		try {
			ps.setString(1, user_id);
			ps.setString(2, user_password);
			rs = ps.executeQuery();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			if(rs.next())
			{
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DbUtil.close();
		return false;
	}
   
}
