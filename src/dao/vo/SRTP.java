package dao.vo;

public class SRTP {
//  SRTP项目  
	private String item_id;
	private String item_name;
	private String item_achievement;
	private String teacher_id;
	private String stu_id;
	public SRTP(String item_id, String item_name, String item_achievement, String teacher_id, String stu_id) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.item_achievement = item_achievement;
		this.teacher_id = teacher_id;
		this.stu_id = stu_id;
	}
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getItem_achievement() {
		return item_achievement;
	}
	public void setItem_achievement(String item_achievement) {
		this.item_achievement = item_achievement;
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
