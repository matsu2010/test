package com.internousdev.pixpress.dto;

/**
 * @author ookawa
 *
 */
public class ProductListDTO {
	private int id;
	private int productId;
	private String productName;
	private String productNameKana;
	private int categoryId;
	private int price;
	private String castName1;
	private String castName2;
	private String castName3;
	private String director;
	private int releaseYear;
	private String productDescription;
	private String imageFilePath;
	private String imageFileName;
	private int status;
	private String registDate;
	private String updateDate;

	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	public String getRegistDate() {
		return registDate;
	}
	public void setRegistDate(String registDate) {
		this.registDate = registDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getProductNameKana() {
		return productNameKana;
	}
	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
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
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String getImageFilePath() {
		return imageFilePath;
	}
	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

}
