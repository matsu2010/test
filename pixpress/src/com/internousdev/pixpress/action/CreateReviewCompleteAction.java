package com.internousdev.pixpress.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.ReviewDAO;

/*
 * @author yazaki
 */

import com.opensymphony.xwork2.ActionSupport;

public class CreateReviewCompleteAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;
	private String userId;
	private int productId;
	private String productName;
	private String reviewTitle;
	private int reviewScore;
	private String reviewBody;


	private ReviewDAO reviewDAO = new ReviewDAO();

	public String execute() throws SQLException{
		String result = ERROR;

		userId = session.get("userId").toString();
/*		// String型で送られてきた評価をInt型に戻す
		int rvScore = Integer.parseInt(reviewScore);*/

		/*if (reviewScore == 0 || userId == null) {
			// ログインしていない、もしくは評価が選択されていなかった場合エラー
			return ERROR;
		} else {

			reviewDAO.insertReview(userId, productId, reviewTitle, reviewScore, reviewBody);
		}*/
		int count = reviewDAO.insertReview(userId, Integer.parseInt(session.get("productId").toString()), session.get("productName").toString(), session.get("rv_title").toString(), Integer.parseInt(session.get("rv_score").toString()), session.get("rv_body").toString());

		if(count > 0){
			result = SUCCESS;
			session.remove("productId");
			session.remove("productName");
			session.remove("rv_title");
			session.remove("rv_score");
			session.remove("rv_body");
		}
		return result;

	}

	//フィールド変数のgetter/setter

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

	public String getproductName() {
		return productName;
	}

	public void setproductName(String productName) {
		this.productName = productName;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public String getReviewBody() {
		return reviewBody;
	}

	public void setReviewBody(String reviewBody) {
		this.reviewBody = reviewBody;
	}

	public ReviewDAO getReviewDAO() {
		return reviewDAO;
	}

	public void setReviewDAO(ReviewDAO reviewDAO) {
		this.reviewDAO = reviewDAO;
	}


}
