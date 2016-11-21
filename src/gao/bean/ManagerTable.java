package gao.bean;

public class ManagerTable {
       private String manager_id;
       private String table_name;
       private String table_note;
       private String due_date;
       private String due_state;
	public String getManager_id() {
		return manager_id;
	}
	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	public String getTable_note() {
		return table_note;
	}
	public void setTable_note(String table_note) {
		this.table_note = table_note;
	}
	public String getDue_date() {
		return due_date;
	}
	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}
	public String getDue_state() {
		return due_state;
	}
	public void setDue_state(String due_state) {
		this.due_state = due_state;
	}
	@Override
	public String toString() {
		return "ManagerTable [manager_id=" + manager_id + ", table_name="
				+ table_name + ", table_note=" + table_note + ", due_date="
				+ due_date + ", due_state=" + due_state + "]";
	}
       
}
