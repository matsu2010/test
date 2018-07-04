// 担当：森本

package com.internousdev.pixpress.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.MyPageDAO;
import com.internousdev.pixpress.dao.ReviewDAO;
import com.internousdev.pixpress.dto.MyPageDTO;
import com.internousdev.pixpress.dto.ProductListDTO;
import com.internousdev.pixpress.dto.ReviewDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;
	private ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();
	private String userId;
	private String password;
	private int productId;
	private String reviewMessage;

	private ReviewDAO reviewDAO = new ReviewDAO();
	private List<ReviewDTO> reviewMyList = new ArrayList<ReviewDTO>();

	public String execute() throws SQLException{

		String result = ERROR;

		if(session.containsKey("loginFlg")){

			MyPageDAO myPageDAO = new MyPageDAO();
			userId = (session.get("userId").toString());
			myPageList = myPageDAO.getMyPageUserInfo(userId);

			if(myPageList.size() > 0){
				result = SUCCESS;
			}
		}

		session.put("MyPageList", myPageList);

		ProductListDTO productListDTO = new ProductListDTO();
		session.put("productId", productListDTO.getId());

		if(session.containsKey("userId")){
			userId = session.get("userId").toString();
		}else{
			return ERROR;
		}

		System.out.println(userId);

		reviewMyList = reviewDAO.getMyReview(userId);

		if(reviewMyList.size() == 0){
			reviewMessage = "レビューを投稿していません";
		}else{
//			int reviewCount = reviewMyList.size();
//			String count = Integer.toString(reviewCount);
//			setReviewMessage(count + "件のレビューがあります");
		}

		System.out.println(productId);

		Iterator<ReviewDTO> iterator = reviewMyList.iterator();
		if(!(iterator.hasNext())){
			reviewMyList = null;
		}

		session.put("reviewMyList", reviewMyList);

	return result;

	}

	public Map<String,Object> getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	public String getUserId(){
		return userId;
	}
	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password;
	}

	public ArrayList<MyPageDTO> getMyPageList(){
		return myPageList;
	}
	public void setMyPageList(ArrayList<MyPageDTO> myPageList){
		this.myPageList = myPageList;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getReviewMessage() {
		return reviewMessage;
	}

	public void setReviewMessage(String reviewMessage) {
		this.reviewMessage = reviewMessage;
	}



}