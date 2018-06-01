package dao.vo;

import java.util.Date;

public class teach_reserch_pubulished {
	private String item_id;
	private String item_name;
	private String type;
	private Date date_start;
	private Date date_end;
	private String teacher_id;
	public teach_reserch_pubulished(String item_id, String item_name, String type, Date date_start, Date date_end,
			String teacher_id) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.type = type;
		this.date_start = date_start;
		this.date_end = date_end;
		this.teacher_id = teacher_id;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public String getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}
	
	
}
