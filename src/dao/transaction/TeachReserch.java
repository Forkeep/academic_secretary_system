package dao.transaction;

import dao.vo.teach_reserch_apply;
import dao.vodo.teach_reserch_apply_do;
import dao.vodo.teach_reserch_pubulished_do;

/**
 * 
 * @author lizhe
 * @date Jun 1, 2018
 * @descripe 教研教改项目事务
 */
public class TeachReserch {
	/**
	 * 当接收到申请，则入库
	 * @param teach_reserch_apply
	 * @return 0
	 */
	public static int insert(teach_reserch_apply teach_reserch_apply) {
		teach_reserch_apply_do.insert(teach_reserch_apply);
		return 0;
	}
	
	
	/**
	 * 查询所有已发表教研教改项目
	 * @return
	 */
	public static int getPubuilshedAll() {
		teach_reserch_pubulished_do.getAll();
		return 0;
	}
	/**
	 * 查询一位老师所发表的项目
	 * @return
	 */
	public static int getPublishedByTeacher(String teacher_id) {
		teach_reserch_pubulished_do.getItem(teacher_id);
		return 0;
	}
}
