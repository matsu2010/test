package com.internousdev.pixpress.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dto.ReviewDTO;

/*
 * @author yazaki
 */

import com.opensymphony.xwork2.ActionSupport;

public class CreateReviewConfirmAction extends ActionSupport implements SessionAware{

	private String userId;
	private int productId;
	private String productName;
	private String reviewTitle;
	private int reviewScore;
	private String reviewBody;

	private String imageFilePath;


	private String errorTitle;
	private String errorScore;
	private String errorBody;

	private Map<String, Object> session;

	private ReviewDTO reviewDTO = new ReviewDTO();

	public String execute() throws SQLException{
		String result = null;
		if (reviewScore == 0) {
			errorScore = "評価を選択してください。";
			result = ERROR;
		}

		if (reviewTitle.equals("")){
			errorTitle = "タイトルを入力してください。";
			result = ERROR;

		}else if (!(reviewTitle.length() <= 15)) {
			errorTitle = "レビュータイトルは15文字以内で入力してください。";
			result = ERROR;
		}

		if (reviewBody.equals("")) {
			errorBody = "レビューを入力してください。";
			result = ERROR;

		}else if(!(reviewBody.length() >= 1 && reviewBody.length() <= 250)) {
			errorBody = "レビューは250文字以内で入力してください";
			result = ERROR;
		}

		if(result != null){
			return result;
		}

		String score = String.valueOf(reviewScore);


		session.put("productId", productId);
		session.put("productName", productName);
		session.put("rv_title", reviewTitle);
		session.put("rv_score", score);
		session.put("rv_body", reviewBody);
		return SUCCESS;
	}

	//フィールド変数のgetter/setter
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

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public String getErrorTitle() {
		return errorTitle;
	}

	public void setErrorTitle(String errorTitle) {
		this.errorTitle = errorTitle;
	}

	public String getErrorScore() {
		return errorScore;
	}

	public void setErrorScore(String errorScore) {
		this.errorScore = errorScore;
	}

	public String getErrorBody() {
		return errorBody;
	}

	public void setErrorBody(String errorBody) {
		this.errorBody = errorBody;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ReviewDTO getReviewDTO() {
		return reviewDTO;
	}

	public void setReviewDTO(ReviewDTO reviewDTO) {
		this.reviewDTO = reviewDTO;
	}


}
