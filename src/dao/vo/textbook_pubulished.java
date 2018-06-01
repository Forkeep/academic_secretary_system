package dao.vo;

import java.util.Date;

public class textbook_pubulished {
	private String ISBN_id;
	private String textbook_name;
	private String first_author_id;
	private java.sql.Date pubulish_date;
	private String award_level;
	private int print_times;
	private int print_num;
	private int word_num;
	public textbook_pubulished(String iSBN_id, String textbook_name, String first_author_id, java.sql.Date pubulish_date,
			String award_level, int print_times, int print_num, int word_num) {
		super();
		ISBN_id = iSBN_id;
		this.textbook_name = textbook_name;
		this.first_author_id = first_author_id;
		this.pubulish_date = pubulish_date;
		this.award_level = award_level;
		this.print_times = print_times;
		this.print_num = print_num;
		this.word_num = word_num;
	}
	public String getISBN_id() {
		return ISBN_id;
	}
	public void setISBN_id(String iSBN_id) {
		ISBN_id = iSBN_id;
	}
	public String getTextbook_name() {
		return textbook_name;
	}
	public void setTextbook_name(String textbook_name) {
		this.textbook_name = textbook_name;
	}
	public String getFirst_author_id() {
		return first_author_id;
	}
	public void setFirst_author_id(String first_author_id) {
		this.first_author_id = first_author_id;
	}
	public Date getPubulish_date() {
		return pubulish_date;
	}
	public void setPubulish_date(java.sql.Date pubulish_date) {
		this.pubulish_date = pubulish_date;
	}
	public String getAward_level() {
		return award_level;
	}
	public void setAward_level(String award_level) {
		this.award_level = award_level;
	}
	public int getPrint_times() {
		return print_times;
	}
	public void setPrint_times(int print_times) {
		this.print_times = print_times;
	}
	public int getPrint_num() {
		return print_num;
	}
	public void setPrint_num(int print_num) {
		this.print_num = print_num;
	}
	public int getWord_num() {
		return word_num;
	}
	public void setWord_num(int word_num) {
		this.word_num = word_num;
	}
	
	
}
