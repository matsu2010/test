package com.internousdev.pixpress.action;/*山本宰*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.CartDAO;
import com.internousdev.pixpress.dao.PurchaseHistoryDAO;
import com.internousdev.pixpress.dto.AddressDTO;
import com.internousdev.pixpress.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyProductCompleteAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;
	private int id;
	private String categoryId;
	public String result;

	private String deliveryDate;
	private String deliveryTime;

	@SuppressWarnings("unchecked")
	public String execute(){
		result=ERROR;


		if((ArrayList<AddressDTO>)session.get("addressDTOList") != null){


		ArrayList<CartDTO> cartDTOList = (ArrayList<CartDTO>)session.get("cartList");


		if(session.containsKey("cartList")){

		PurchaseHistoryDAO purchaseHistoryDAO = new PurchaseHistoryDAO();

		int count=0;
		for(int i=0; i<cartDTOList.size(); i++){
			count = purchaseHistoryDAO.insertPurchaseHistory(
					String.valueOf(session.get("userId")),
					cartDTOList.get(i).getProductId(),
					cartDTOList.get(i).getProductCount(),
					//totalPriceからSubTotalPriceに変更したら金額が正常に登録されました　by松岡
					cartDTOList.get(i).getSubTotalPrice(),
					id,
					deliveryDate,
					deliveryTime
					);
		}

		if(count>0){
			CartDAO cartDAO = new CartDAO();
			cartDAO.deleteAllCartInfo(String.valueOf(session.get("userId")));

				cartDTOList = cartDAO.getUserCartInfo(String.valueOf(session.get("userId")));
				Iterator<CartDTO> iterator = cartDTOList.iterator();
				if(!(iterator.hasNext())) {
					cartDTOList = null;
				}
				session.put("cartDTOList", cartDTOList);

				session.remove("totalPrice");
				session.remove("cartList");

				result=SUCCESS;

			}
		}

	}
		return result;
}



	public Map<String,Object> getSession() {
	    return session;
	}
	public void setSession(Map<String,Object> session) {
	    this.session = session;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}



	public String getDeliveryDate() {
	    return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
	    this.deliveryDate = deliveryDate;
	}



	public String getDeliveryTime() {
	    return deliveryTime;
	}
	public void setDeliveryTime(String deliveryTime) {
	    this.deliveryTime = deliveryTime;
	}

}