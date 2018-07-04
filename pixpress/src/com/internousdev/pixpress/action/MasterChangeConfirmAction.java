package com.internousdev.pixpress.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.MasterChangeDAO;
import com.internousdev.pixpress.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;


public class MasterChangeConfirmAction extends ActionSupport implements SessionAware{

	private int productId;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private int categoryId;
	private String categoryName;
	private String price;
	private String director;
	private String castName1;
	private String castName2;
	private String castName3;
	private String userImage;
	private String releaseYear;
	private String imageFilePath;
	public Map<String, Object> session;
	public String productNameError;
	public String productNameKanaError;
	public String releaseYearError;
	public String priceError;
	public String directorError;
	public String castError1;
	public String castError2;
	public String castError3;
	public String productDescriptionError;
	public String imageFilePathError;
	private MasterChangeDAO masterChangeDAO = new MasterChangeDAO();
	private String image;

	public String execute() {

		userImage = "./images/"+image;

		productNameError = InputChecker.productNameChk(productName);
		productNameKanaError = InputChecker.productNameKanaChk(productNameKana);
		releaseYearError = InputChecker.releaseYearChk(releaseYear);
		priceError = InputChecker.priceChk(price);
		directorError = InputChecker.directorChk(director);
		castError1 = InputChecker.castChk(castName1);
		castError2 = InputChecker.castChk(castName2);
		castError3 = InputChecker.castChk(castName3);
		productDescriptionError = InputChecker.productDescriptionChk(productDescription);
		imageFilePathError = InputChecker.imageFilePathChk(image);


		switch(categoryId){
		case 2:
			categoryName="アクション";
			break;
		case 3:
			categoryName="コメディ";
			break;
		case 4:
			categoryName="ドラマ";
			break;
		case 5:
			categoryName="ファンタジー";
			break;
		case 6:
			categoryName="ホラー";
			break;
		case 7:
			categoryName="SF";
			break;
		case 8:
			categoryName="スタッフのおすすめ";
			break;
			}

		if(productNameError != null || productNameKanaError != null || releaseYearError != null || priceError != null || directorError != null || castError1 != null || castError2 != null || castError3 != null || productDescriptionError != null || imageFilePathError != null) {
			return ERROR;
		}

			session.put("productName",productName);
			session.put("productNameKana", productNameKana);
			session.put("productDescription", productDescription);
			session.put("categoryName", categoryName);
			session.put("categoryId", categoryId);
			session.put("price", price);
			session.put("director", director);
			session.put("castName1", castName1);
			session.put("castName2", castName2);
			session.put("castName3", castName3);
			session.put("releaseYear", releaseYear);
			session.put("userImage",userImage);

			String result = SUCCESS;

			return result;
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

	/**
	 * categoryNameを取得します。
	 * @return categoryName
	 */
	public String getCategoryName() {
	    return categoryName;
	}

	/**
	 * categoryNameを設定します。
	 * @param categoryName categoryName
	 */
	public void setCategoryName(String categoryName) {
	    this.categoryName = categoryName;
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


	public String getUserImage() {
	    return userImage;
	}
	public void setUserImage(String userImage) {
	    this.userImage = userImage;
	}


	public String getReleaseYear() {
	    return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
	    this.releaseYear = releaseYear;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public MasterChangeDAO getMasterChangeDAO() {
		return masterChangeDAO;
	}

	public void setMasterChangeDAO(MasterChangeDAO masterChangeDAO) {
		this.masterChangeDAO = masterChangeDAO;
	}

	@Override
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}



}
