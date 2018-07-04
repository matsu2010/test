package com.internousdev.pixpress.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ookawa
 *
 */
public class MasterAddAction extends ActionSupport{

	private String productId;
	private String productName;
	private String productNameKana;
	private String categoryId;
	private String releaseYear;
	private String price;
	private String director;
	private String castName1;
	private String castName2;
	private String castName3;
	private String productDescription;
	private String image;
	private String imageFilePath;

	public String execute() {
		return SUCCESS;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductNameKana() {
		return productNameKana;
	}

	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getCastName1() {
		return castName1;
	}

	public void setCastName1(String castName1) {
		this.castName1 = castName1;
	}

	public String getCastName2() {
		return castName2;
	}

	public void setCastName2(String castName2) {
		this.castName2 = castName2;
	}

	public String getCastName3() {
		return castName3;
	}

	public void setCastName3(String castName3) {
		this.castName3 = castName3;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

}
