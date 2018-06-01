package dao.vo;

import java.util.Date;


public class item_progress {
	private String item_id;
	private String level;
	private Date date_start;
	private Date date_mid;
	private Date date_end;
	private String check;
	private String succeed;
	private String finish;
	public item_progress(String item_id, String level, Date date_start, Date date_mid, Date date_end, String check,
			String succeed, String finish) {
		super();
		this.item_id = item_id;
		this.level = level;
		this.date_start = date_start;
		this.date_mid = date_mid;
		this.date_end = date_end;
		this.check = check;
		this.succeed = succeed;
		this.finish = finish;
	}
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public Date getDate_start() {
		return date_start;
	}
	public void setDate_start(Date date_start) {
		this.date_start = date_start;
	}
	public Date getDate_mid() {
		return date_mid;
	}
	public void setDate_mid(Date date_mid) {
		this.date_mid = date_mid;
	}
	public Date getDate_end() {
		return date_end;
	}
	public void setDate_end(Date date_end) {
		this.date_end = date_end;
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	public String getSucceed() {
		return succeed;
	}
	public void setSucceed(String succeed) {
		this.succeed = succeed;
	}
	public String getFinish() {
		return finish;
	}
	public void setFinish(String finish) {
		this.finish = finish;
	}
	
	
}
