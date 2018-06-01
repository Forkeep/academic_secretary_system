package dao.vo;

import java.util.Date;

/**
 * @category 教师教授的课程
 * @author lizhe
 *
 */
public class teacher_course {
	private String teacher_id;
	private String course_id;
	private Date date_start;
	private Date date_end;
	public teacher_course(String teacher_id, String course_id, Date date_start, Date date_end) {
		super();
		this.teacher_id = teacher_id;
		this.course_id = course_id;
		this.date_start = date_start;
		this.date_end = date_end;
	}
	public String getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public Date getDate_start() {
		return date_start;
	}
	public void setDate_start(Date date_start) {
		this.date_start = date_start;
	}
	public Date getDate_end() {
		return date_end;
	}
	public void setDate_end(Date date_end) {
		this.date_end = date_end;
	}
	
	
}
