package dao.vo;
import java.util.Date;

public class teacher {
	private String teacher_id;
 	private String teacher_name;
	private String gender;
	private int    age;
	private String ethnic; //民族
	private String telephone;
	private String e_mail;
	private String department;//工作部门
	private String college;//院系
	private java.sql.Date onboarding_time;//入职时间  此处改为java.sql.date
	private String job;//职务 院长 系主任等
	private String job_title;//职称
	
	public String getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
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
	public String getEthnic() {
		return ethnic;
	}
	public void setEthnic(String ethnic) {
		this.ethnic = ethnic;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public java.sql.Date getOnboarding_time() {
		return onboarding_time;
	}
	public void setOnboarding_time(java.sql.Date onboarding_time) {
		this.onboarding_time = onboarding_time;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	
	
	
	
	
	
}
