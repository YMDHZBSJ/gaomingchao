package gao.bean;

public class UserTable {
     private  String user_id;
     private  String user_name;
     private  String user_dept;
     private String user_sex;
     private String user_job;
     private String user_type;
     private String user_password;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_dept() {
		return user_dept;
	}
	public void setUser_dept(String user_dept) {
		this.user_dept = user_dept;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public String getUser_job() {
		return user_job;
	}
	public void setUser_job(String user_job) {
		this.user_job = user_job;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	@Override
	public String toString() {
		return "UserTable [user_id=" + user_id + ", user_name=" + user_name
				+ ", user_dept=" + user_dept + ", user_sex=" + user_sex
				+ ", user_job=" + user_job + ", user_type=" + user_type
				+ ", user_password=" + user_password + "]";
	}
     
}
