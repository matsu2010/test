package com.internousdev.pixpress.action;

/*
 * @author yazaki
 */

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.ReviewDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewDeleteAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	private String userId;
	private int productId;
	private boolean deleteFlg = false;

	ReviewDAO reviewDAO = new ReviewDAO();

	private List<Integer> deleteList;
	private String deleteMessage;

	public String execute() throws SQLException {
		String result = ERROR;

		if (deleteFlg == true){

			int count = 0;
			userId = session.get("userId").toString();
			count = reviewDAO.deleteAll(userId);
			if(count > 0){
				deleteMessage = "全てのレビューを削除しました。";
				result = SUCCESS;
			}else{
				deleteMessage = "削除に失敗しました";
			}
		}else if (deleteList != null) {

			int count = 0;
			userId = session.get("userId").toString();
			// count = reviewDAO.deleteReview_info(userId, productId);
			count = reviewDAO.deleteSelect(deleteList, userId);

			if (count > 0) {
				deleteMessage = count + "件のレビューを削除しました。";
				result = SUCCESS;
			} else {
				deleteMessage = "削除に失敗しました";
				result = ERROR;
			}
		}else{
			deleteMessage = "削除したいレビューにチェックを入れてください";
			result = ERROR;
		}

		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public boolean isDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(boolean deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public Collection<Integer> getDeleteList() {
		return deleteList;
	}

	public void setDeleteList(List<Integer> deleteList) {
		this.deleteList = deleteList;
	}

	public String getDeleteMessage() {
		return deleteMessage;
	}

	public void setDeleteMessage(String deleteMessage) {
		this.deleteMessage = deleteMessage;
	}

}
