package dao.vo;

import java.util.Date;

public class textbook_apply {
	private String textbook_id;
	private String textbook_name;
	private Date date_apply;
	private int word_num;
	private String first_author_id;
	private String document_link;
	public textbook_apply(String textbook_id, String textbook_name, Date date_apply, int word_num,
			String first_author_id, String document_link) {
		super();
		this.textbook_id = textbook_id;
		this.textbook_name = textbook_name;
		this.date_apply = date_apply;
		this.word_num = word_num;
		this.first_author_id = first_author_id;
		this.document_link = document_link;
	}
	public String getTextbook_id() {
		return textbook_id;
	}
	public void setTextbook_id(String textbook_id) {
		this.textbook_id = textbook_id;
	}
	public String getTextbook_name() {
		return textbook_name;
	}
	public void setTextbook_name(String textbook_name) {
		this.textbook_name = textbook_name;
	}
	public Date getDate_apply() {
		return date_apply;
	}
	public void setDate_apply(Date date_apply) {
		this.date_apply = date_apply;
	}
	public int getWord_num() {
		return word_num;
	}
	public void setWord_num(int word_num) {
		this.word_num = word_num;
	}
	public String getFirst_author_id() {
		return first_author_id;
	}
	public void setFirst_author_id(String first_author_id) {
		this.first_author_id = first_author_id;
	}
	public String getDocument_link() {
		return document_link;
	}
	public void setDocument_link(String document_link) {
		this.document_link = document_link;
	}
	
	
}
