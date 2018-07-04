package com.internousdev.pixpress.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.ProductListDAO;
import com.internousdev.pixpress.dto.ProductListDTO;
import com.opensymphony.xwork2.ActionSupport;


public class MasterChangeAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;
	private int id;
	private String categoryName;
	private int productId;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private int categoryId;
	private String price;
	private String director;
	private String castName1;
	private String castName2;
	private String castName3;
	private String userImage;
	private String releaseYear;
	private String imageFilePath;
	private int returnFlg;

	public String execute(){
			String result = SUCCESS;




				session.put("selectProductId",productId);


				ProductListDAO productListDAO = new ProductListDAO();
				ProductListDTO productListDTO = new ProductListDTO();


				productListDTO = productListDAO.getSelectProductInfo(Integer.parseInt(session.get("selectProductId").toString()));
				System.out.println(productListDTO.getId());

				session.put("productId", productListDTO.getId());
				session.put("price", productListDTO.getPrice());
				session.put("products", productListDTO);

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



	public String getProductDescription() {
	    return productDescription;
	}


	public void setProductDescription(String productDescription) {
	    this.productDescription = productDescription;
	}


	public String getCategoryName() {
	    return categoryName;
	}
	public void setCategoryName(String categoryName) {
	    this.categoryName = categoryName;
	}



	public int getProductId() {
	    return productId;
	}
	public void setProductId(int productId) {
	    this.productId = productId;
	}




	public int getCategoryId() {
	    return categoryId;
	}


	public void setCategoryId(int categoryId) {
	    this.categoryId = categoryId;
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


	public int getReturnFlg() {
	    return returnFlg;
	}


	public void setReturnFlg(int returnFlg) {
	    this.returnFlg = returnFlg;
	}


}
