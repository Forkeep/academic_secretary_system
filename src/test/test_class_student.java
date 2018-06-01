package test;

import dao.vo.class_student;
import dao.vo.fund;
import dao.vo.item_participant;
import dao.vo.teacher;
import dao.vodo.class_student_do;
import dao.vodo.fund_do;
import dao.vodo.item_participant_do;
import dao.vodo.teacher_do;

public class test_class_student {
	public static void main(String args[]) {
//	    teacher_do.getBasicInfo("111111");
//	    teacher_do.getJobInfo("111111");
		item_participant_do.deleteItem("333");
		item_participant_do.getAll();
	    item_participant_do.insert(new item_participant("333", "lihe"));
	    item_participant_do.insert(new item_participant("333", "zhaoyu"));
	    item_participant_do.insert(new item_participant("333", "songjiancheng"));
	    item_participant_do.insert(new item_participant("222", "lihe"));
	    item_participant_do.getAll();
	    item_participant_do.deletePeople("333", "zhaoyu");
	    item_participant_do.getOneItem("333");
	    item_participant_do.getOnePeople("lihe");
	    
//	    class_student_do.update(new class_student("计1503","张三"));
//	    class_student_do.getAll();
//	    class_student_do.delete("计1502","宋建成");
//	    class_student_do.getAll();
	}
}
