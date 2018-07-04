package com.internousdev.pixpress.dto;

public class PurchaseHistoryDetailsDTO {

	private int purchaseHistoryId;

	// 商品名
	private String productName;

	// ふりがな
	private String productNameKana;

	//商品説明
	private String productDescription;

	// 商品画像の名前（実際にjspにはのせない）
	private String imageFileName;

	//商品画像のパス
	private String imageFilePath;

	// 値段
	private int price;

	// 個数
	private int productCount;

	// 宛先住所
	private int addressId;

	private String postalCode;

	private String userAddress;

	// 発売会社名
	private String releaseCompany;

	// 発売年月日
	private String releaseDate;

	private String id;

	private String productId;



	private String registDate;

	private int categoryId;

	private String director;

	private String castName1;

	private String castName2;

	private String castName3;

	private int releaseYear;


	public int getPurchaseHistoryId() {
	    return purchaseHistoryId;
	}

	public void setPurchaseHistoryId(int purchaseHistoryId) {
	    this.purchaseHistoryId = purchaseHistoryId;
	}
	// 商品名
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	// ふりがな
	public String getProductNameKana() {
		return productNameKana;
	}
	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}

	//商品説明
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	//画像名前
		public String getImageFileName() {
			return imageFileName;
		}
		public void setImageFileName(String imageFileName) {
			this.imageFileName = imageFileName;
		}

	// 商品画像のパス
	public String getImageFilePath() {
		return imageFilePath;
	}
	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	// 値段
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	// 個数
	public int getProductCount() {
		return productCount;
	}
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	// 宛先住所
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	// 発売会社名
	public String getReleaseCompany() {
		return releaseCompany;
	}
	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}

	// 発売年月日
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getProductId() {
		return 	productId;
		}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getRegistDate() {
	    return registDate;
	}

	public void setRegistDate(String registDate) {
	    this.registDate = registDate;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
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
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}


}
