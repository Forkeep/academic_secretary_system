package dao.vo;

public class class_student {
	private String class_id;
	private String stu_id;
	
	public class_student (String class_id, String stu_id) {
		this.class_id = class_id;
		this.stu_id = stu_id;
	}

	public String getClass_id() {
		return class_id;
	}

	public void setClass_id(String class_id) {
		this.class_id = class_id;
	}

	public String getStu_id() {
		return stu_id;
	}

	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
}
