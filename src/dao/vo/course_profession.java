package dao.vo;
/**
 * @category 课程专业对应关系表
 * @author lizhe
 *
 */
public class course_profession {
	private String course_id;
	private String profession_id;
	public course_profession(String course_id, String profession_id) {
		super();
		this.course_id = course_id;
		this.profession_id = profession_id;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getProfession_id() {
		return profession_id;
	}
	public void setProfession_id(String profession_id) {
		this.profession_id = profession_id;
	}
	
	
	
}
