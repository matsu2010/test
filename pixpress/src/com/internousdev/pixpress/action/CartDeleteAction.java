package com.internousdev.pixpress.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.CartDAO;
import com.internousdev.pixpress.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartDeleteAction extends ActionSupport implements SessionAware{

	private String userId;
	private int productId;
	private int totalPrice;
	private Map<String, Object> session;
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();

	public String execute() throws SQLException {

		String result = ERROR;
		CartDAO dao = new CartDAO();

		//ログインしていれば
		if(session.containsKey("userId")) {

			dao.deleteSeparate(session.get("userId").toString(), productId);
			cartList = dao.getUserCartInfo(session.get("userId").toString());

			session.remove("itemCountInCart");

		//ゲストユーザーなら
		} else {

			//生成されたID
			userId = session.get("tempUserId").toString();
			dao.deleteSeparate(userId, productId);
			cartList = dao.getGuestCartInfo(session.get("tempUserId").toString());

			session.remove("itemCountInCart");
		}

		session.put("cartListSize", cartList.size());
		session.put("cartList",cartList);

		totalPrice = calcTotalPrice(cartList);

		session.put("totalPrice",totalPrice);


		result = SUCCESS;

		return result;
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

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int calcTotalPrice(ArrayList<CartDTO> cartList) {

		int totalPrice = 0;

		for (CartDTO dto: cartList) {

			totalPrice += dto.getPrice() * dto.getProductCount();

		}
		return totalPrice;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}

	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}


}
