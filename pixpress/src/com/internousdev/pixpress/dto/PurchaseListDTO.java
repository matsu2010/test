package com.internousdev.pixpress.dto;

public class PurchaseListDTO {
	private String registDate;
	private int totalPrice;
	private int allPurchaseListNumber;
	private String deliveryDate;  //配送日
	private String deliveryTime;  //配送時間
	private String userAddress;  //住所


	public String getRegistDate() {
		return registDate;
	}
	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getAllPurchaseListNumber() {
		return allPurchaseListNumber;
	}
	public void setAllPurchaseListNumber(int allPurchaseListNumber) {
		this.allPurchaseListNumber = allPurchaseListNumber;
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
