package com.internousdev.pixpress.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.ReviewDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateReviewAction extends ActionSupport implements SessionAware{

	private int id;
	private String userId;
	private int productId;
	private String productName;
	private Map<String, Object> session;
	private boolean loginFlg;
	private int count;
	private String imageFilePath;
	private String reviewTitle;
	private int reviewScore;
	private String reviewBody;


	private ReviewDAO reviewDAO = new ReviewDAO();

	public String execute() throws SQLException{

		//ログインが切れてないか判定
		loginFlg = (boolean)session.get("loginFlg");

		if(loginFlg == false){
			return LOGIN;
		}else{
			userId = session.get("userId").toString();

			//既にレビューを投稿しているか確認
			count = reviewDAO.checkAlreadyReview(userId, productId);
			if(count != 0){
				return ERROR;
			}
		}

		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public boolean isLoginFlg() {
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
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



}
