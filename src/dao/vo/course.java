package dao.vo;
/**
 * @describe 课程数据
 * @author lizhe
 *
 */
public class course {
	private String course_id;
	private String course_name;
	private int hour;
	private String type;
	public course(String course_id, String course_name, int hour, String type) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.hour = hour;
		this.type = type;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
