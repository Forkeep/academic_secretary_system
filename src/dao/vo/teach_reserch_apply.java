package dao.vo;
/***
 * @author lizhe
 */
import java.util.Date;

public class teach_reserch_apply {
	private String item_id;
	private String item_name;
	private String guide_num;//指南编号
	private String principal_id;//负责人id
	private Date date_start;
	private Date date_end;
	private String document_link;
	public teach_reserch_apply(String item_id, String item_name, String guide_num, String principal_id, Date date_start,
			Date date_end, String document_link) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.guide_num = guide_num;
		this.principal_id = principal_id;
		this.date_start = date_start;
		this.date_end = date_end;
		this.document_link = document_link;
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
	public String getGuide_num() {
		return guide_num;
	}
	public void setGuide_num(String guide_num) {
		this.guide_num = guide_num;
	}
	public String getPrincipal_id() {
		return principal_id;
	}
	public void setPrincipal_id(String principal_id) {
		this.principal_id = principal_id;
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
	public String getDocument_link() {
		return document_link;
	}
	public void setDocument_link(String document_link) {
		this.document_link = document_link;
	}
	
	

}
