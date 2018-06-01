package dao.vo;

public class student {
	private String student_id;
	private String student_name;
	private String gender;
	private int   age;
	
	public student(String student_id, String student_name, String gender, int age) {
        this.student_id = student_id; 
        this.student_name= student_name;
        this.gender = gender;
        this.age = age;
    }
	
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
