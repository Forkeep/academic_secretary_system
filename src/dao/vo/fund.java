package dao.vo;
/**
 * 
 * @category 项目经费管理数据表
 * @author lizhe
 *
 */
public class fund {
	private String item_id;//项目ID
	private float office_supply;//办公用品
	private float data_fee;//资料费
	private float postage;//邮费
	private float printing_fee;//打印费
	private float transportation_fee;//市内交通费
	private float material_fee;//材料费
	private float page_charge;//版面费
	private float travel_expenses;//差旅费
	private float labor_cost;//劳务费

	public fund(String item_id, float office_supply, float data_fee, float postage, float printing_fee,
			float transportation_fee, float material_fee, float page_charge, float travel_expenses, float labor_cost) {
		super();
		this.item_id = item_id;
		this.office_supply = office_supply;
		this.data_fee = data_fee;
		this.postage = postage;
		this.printing_fee = printing_fee;
		this.transportation_fee = transportation_fee;
		this.material_fee = material_fee;
		this.page_charge = page_charge;
		this.travel_expenses = travel_expenses;
		this.labor_cost = labor_cost;
	}

	public String getItem_id() {
		return item_id;
	}

	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}

	public float getOffice_supply() {
		return office_supply;
	}

	public void setOffice_supply(float office_supply) {
		this.office_supply = office_supply;
	}

	public float getData_fee() {
		return data_fee;
	}

	public void setData_fee(float data_fee) {
		this.data_fee = data_fee;
	}

	public float getPostage() {
		return postage;
	}

	public void setPostage(float postage) {
		this.postage = postage;
	}

	public float getPrinting_fee() {
		return printing_fee;
	}

	public void setPrinting_fee(float printing_fee) {
		this.printing_fee = printing_fee;
	}

	public float getTransportation_fee() {
		return transportation_fee;
	}

	public void setTransportation_fee(float transportation_fee) {
		this.transportation_fee = transportation_fee;
	}

	public float getMaterial_fee() {
		return material_fee;
	}

	public void setMaterial_fee(float material_fee) {
		this.material_fee = material_fee;
	}

	public float getPage_charge() {
		return page_charge;
	}

	public void setPage_charge(float page_charge) {
		this.page_charge = page_charge;
	}

	public float getTravel_expenses() {
		return travel_expenses;
	}

	public void setTravel_expenses(float travel_expenses) {
		this.travel_expenses = travel_expenses;
	}

	public float getLabor_cost() {
		return labor_cost;
	}

	public void setLabor_cost(float labor_cost) {
		this.labor_cost = labor_cost;
	}
	
	
}
