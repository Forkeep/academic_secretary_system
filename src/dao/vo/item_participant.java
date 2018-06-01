package dao.vo;
/**
 * @category 项目参与者记录
 * @author lizhe
 *
 */
public class item_participant {
	private String item_id;
	private String parti_id;
	public item_participant(String item_id, String parti_id) {
		super();
		this.item_id = item_id;
		this.parti_id = parti_id;
	}
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public String getParti_id() {
		return parti_id;
	}
	public void setParti_id(String parti_id) {
		this.parti_id = parti_id;
	}
	
	
}
