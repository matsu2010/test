package com.internousdev.pixpress.dto;

import java.util.Date;

/*
 * @author yazaki
 */



public class CartDTO {
	private int id;
	private String userId;
	private String tempUserId;
	private int categoryId;
	private int productId;
	private int productCount;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private String imageFilePath;
	private String director;
	private String releaseYear;
	private int price;
	private int totalPrice;
	private int subTotalPrice;
	private Date registDate;
	private Date updateDate;
	private int destinationId;

	//フィールド変数のgetter/setter

	public int getId(){
		return this.id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getUserId(){
		return this.userId;
	}

	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getTempUserId(){
		return this.tempUserId;
	}

	public void setTempUserId(String tempUserId){
		this.tempUserId = tempUserId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getProductId(){
		return this.productId;
	}

	public void setProductId(int productId){
		this.productId = productId;
	}

	public int getProductCount(){
		return this.productCount;
	}

	public void setProductCount(int productCount){
		this.productCount = productCount;
	}

	public String getProductName(){
		return this.productName;
	}

	public void setProductName(String productName){
		this.productName = productName;
	}

	public String getProductNameKana(){
		return this.productNameKana;
	}

	public void setProductNameKana(String productNameKana){
		this.productNameKana = productNameKana;
	}

	public String getProductDescription(){
		return this.productDescription;
	}

	public void setProductDescription(String productDescription){
		this.productDescription = productDescription;
	}

	public String getImageFilePath(){
		return this.imageFilePath;
	}

	public void setImageFilePath(String imageFilePath){
		this.imageFilePath = imageFilePath;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getPrice(){
		return this.price;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public int getTotalPrice(){
		return this.totalPrice;
	}

	public void setTotalPrice(int totalPrice){
		this.totalPrice = totalPrice;
	}

	public Date getRegistDate() {
		return registDate;
	}

	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}


	public int getDestinationId() {
	    return destinationId;
	}
	public void setDestinationId(int destinationId) {
	    this.destinationId = destinationId;
	}

	public int getSubTotalPrice() {
		return subTotalPrice;
	}

	public void setSubTotalPrice(int subTotalPrice) {
		this.subTotalPrice = subTotalPrice;
	}

}
