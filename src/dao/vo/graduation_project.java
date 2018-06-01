package dao.vo;

public class graduation_project {
	private String item_id;
	private String project_name;
	private String teacher_id;
	private String stu_id;
	public graduation_project(String item_id, String project_name, String teacher_id, String stu_id) {
		super();
		this.item_id = item_id;
		this.project_name = project_name;
		this.teacher_id = teacher_id;
		this.stu_id = stu_id;
	}
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	

}
