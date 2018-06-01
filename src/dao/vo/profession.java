package dao.vo;
/**
 * @category 专业信息表
 * @author lizhe
 *
 */
public class profession {
	private String profession_id;
	private int  class_num;
	private int enroll;//招生人数
	public profession(String profession_id, int class_num, int enroll) {
		super();
		this.profession_id = profession_id;
		this.class_num = class_num;
		this.enroll = enroll;
	}
	public String getProfession_id() {
		return profession_id;
	}
	public void setProfession_id(String profession_id) {
		this.profession_id = profession_id;
	}
	public int getClass_num() {
		return class_num;
	}
	public void setClass_num(int class_num) {
		this.class_num = class_num;
	}
	public int getEnroll() {
		return enroll;
	}
	public void setEnroll(int enroll) {
		this.enroll = enroll;
	}
	
	
}
