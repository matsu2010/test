package com.internousdev.pixpress.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.MasterAddDAO;
import com.internousdev.pixpress.dto.ProductListDTO;
import com.internousdev.pixpress.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ookawa
 *
 */
public class MasterAddConfirmAction extends ActionSupport implements SessionAware{

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


	public Map<String, Object> session;
	public String productIdError;
	public String productIdCheckError;
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

	public String execute() throws SQLException{
		String result = ERROR;


		imageFilePath = "./images/"+image;

		productIdError = InputChecker.productIdChk(productId);
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


		 ArrayList<ProductListDTO> productList = new ArrayList<ProductListDTO>();
		 MasterAddDAO masterAddDAO = new MasterAddDAO();

			 productList =masterAddDAO.productIdCheck();

			 for(int i=0; i<productList.size(); i++){
				 String productIdCheck = String.valueOf(productList.get(i).getProductId());

				 if(productIdCheck.equals(productId)){
					 productIdCheckError="既に同じ商品IDが存在します";
				 }
			 }


		if(productIdError != null || productIdCheckError !=null || productNameError != null || productNameKanaError != null || releaseYearError != null || priceError != null || directorError != null || castError1 != null || castError2 != null || castError3 != null || productDescriptionError != null || imageFilePathError != null) {
			return ERROR;
		}





			session.put("productId", productId);
			session.put("productName",productName);
			session.put("productNameKana", productNameKana);
			session.put("categoryId", categoryId);
			session.put("releaseYear", releaseYear);
			session.put("price", price);
			session.put("director", director);
			session.put("castName1", castName1);
			session.put("castName2", castName2);
			session.put("castName3", castName3);
			session.put("productDescription", productDescription);
			session.put("imageFilePath", imageFilePath);

			result = SUCCESS;
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

	/**
	 * imageを取得します。
	 * @return image
	 */
	public String getImage() {
	    return image;
	}

	/**
	 * imageを設定します。
	 * @param image image
	 */
	public void setImage(String image) {
	    this.image = image;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	@Override
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}



	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
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

	/**
	 * productIdCheckErrorを取得します。
	 * @return productIdCheckError
	 */
	public String getProductIdCheckError() {
	    return productIdCheckError;
	}

	/**
	 * productIdCheckErrorを設定します。
	 * @param productIdCheckError productIdCheckError
	 */
	public void setProductIdCheckError(String productIdCheckError) {
	    this.productIdCheckError = productIdCheckError;
	}

	public String getProductNameError() {
		return productNameError;
	}

	public void setProductNameError(String productNameError) {
		this.productNameError = productNameError;
	}

	public String getProductNameKanaError() {
		return productNameKanaError;
	}

	public void setProductNameKanaError(String productNameKanaError) {
		this.productNameKanaError = productNameKanaError;
	}

	public String getReleaseYearError() {
		return releaseYearError;
	}

	public void setReleaseYearError(String releaseYearError) {
		this.releaseYearError = releaseYearError;
	}

	public String getPriceError() {
		return priceError;
	}

	public void setPriceError(String priceError) {
		this.priceError = priceError;
	}

	public String getDirectorError() {
		return directorError;
	}

	public void setDirectorError(String directorError) {
		this.directorError = directorError;
	}

	public String getCastError1() {
		return castError1;
	}

	public void setCastError1(String castError1) {
		this.castError1 = castError1;
	}

	public String getCastError2() {
		return castError2;
	}

	public void setCastError2(String castError2) {
		this.castError2 = castError2;
	}

	public String getCastError3() {
		return castError3;
	}

	public void setCastError3(String castError3) {
		this.castError3 = castError3;
	}

	public String getProductDescriptionError() {
		return productDescriptionError;
	}

	public void setProductDescriptionError(String productDescriptionError) {
		this.productDescriptionError = productDescriptionError;
	}

	public String getImageFilePathError() {
		return imageFilePathError;
	}

	public void setImageFilePathError(String imageFilePathError) {
		this.imageFilePathError = imageFilePathError;
	}

	public String getProductIdError() {
		return productIdError;
	}

	public void setProductIdError(String productIdError) {
		this.productIdError = productIdError;
	}


}
