package com.internousdev.pixpress.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.CartDAO;
import com.internousdev.pixpress.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction  extends ActionSupport implements SessionAware{

	Map<String, Object> session;
	ArrayList<CartDTO> cartList = new ArrayList<>();
	int totalPrice;

	public String execute() throws SQLException{

		CartDAO dao = new CartDAO();

		/*
		loginFlgが存在しているか判定
		*/
		if(!(boolean) session.containsKey("loginFlg")){
			session.put("loginFlg", false);
		}

		if(!(session.containsKey("tempUserId"))){
			return "start";
		}

		if((boolean) session.containsKey("loginFlg")){
			if((boolean) session.get("loginFlg")){
				dao.changeUserId(session.get("tempUserId").toString(), session.get("userId").toString());
				cartList = dao.getUserCartInfo(session.get("userId").toString());
			}else{
				cartList = dao.getGuestCartInfo(session.get("tempUserId").toString());
			}
		}else{
			cartList = dao.getGuestCartInfo(session.get("tempUserId").toString());
		}

		session.put("cartList",cartList);

		//合計金額の計算
		totalPrice = calcTotalPrice(cartList);
		session.put("totalPrice", totalPrice);

		return SUCCESS;
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

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int calcTotalPrice(ArrayList<CartDTO> cartList) {
		int totalPrice = 0;
		for(CartDTO dto: cartList) {
			totalPrice += dto.getPrice() * dto.getProductCount();
		}
		return totalPrice;
	}

}
