// 担当：森本

package com.internousdev.pixpress.dto;


public class PurchaseHistoryDTO {
	private String userId;				//ユーザーID
	private int productId;			//商品ID
	private int productCount;		//個数
	private int price;				//金額
	private int purchaseHistoryId;
	private String registDate;//登録日
	private String deliveryDate;  //配送日
	private String deliveryTime;  //配送時間
	private String userAddress;

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
	public int getProductCount() {
		return productCount;
	}
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRegistDate() {
		return registDate;
	}
	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}
	public int getPurchaseHistoryId() {
		return purchaseHistoryId;
	}
	public void setPurchaseHistoryId(int purchaseHistoryId) {
		this.purchaseHistoryId = purchaseHistoryId;
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

	public String getUserAddress() {
	    return userAddress;
	}

	public void setUserAddress(String userAddress) {
	    this.userAddress = userAddress;
	}

}