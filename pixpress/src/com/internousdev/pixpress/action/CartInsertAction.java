package com.internousdev.pixpress.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.CartDAO;
import com.internousdev.pixpress.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartInsertAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();

	private int productId;
	private int categoryId;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private String imageFilePath;
	private String imageFileName;
	private int price;
	private String director;
	private int count;
	private int productCount;
	private int totalPrice;
	private int subTotalPrice;

	private boolean duplicationFlg;

	public String execute() throws SQLException{
		CartDTO dto = new CartDTO();
		CartDAO dao = new CartDAO();

		dto.setProductId(productId);
		dto.setCategoryId(categoryId);
		dto.setProductCount(productCount);

		if(!(session.containsKey("loginFlg"))){
			session.put("loginFlg", false);
		}

		if(session.containsKey("loginFlg") && (boolean) session.get("loginFlg")){

			boolean duplicationFlg = dao.sameProductExistByUser(session.get("userId").toString(), Integer.parseInt(session.get("productId").toString()));

			if(!duplicationFlg){
				count = dao.insertUserCart(session.get("userId").toString(), Integer.parseInt(session.get("productId").toString()), productCount, Integer.parseInt(session.get("price").toString()));
				cartList = dao.getUserCartInfo(session.get("userId").toString());
			}else{
				count = dao.updateProductCount(session.get("userId").toString(), Integer.parseInt(session.get("productId").toString()), productCount, Integer.parseInt(session.get("price").toString()));
				cartList = dao.getUserCartInfo(session.get("userId").toString());
			}

			subTotalPrice = productCount * Integer.parseInt(session.get("price").toString());
			System.out.println(subTotalPrice);
		}else{

			boolean duplicationFlg = dao.sameProductExistByGuest(session.get("tempUserId").toString(), Integer.parseInt(session.get("productId").toString()));

			if(!duplicationFlg){
				count = dao.insertGuestCart(session.get("tempUserId").toString(), Integer.parseInt(session.get("productId").toString()), productCount, Integer.parseInt(session.get("price").toString()));
				cartList = dao.getGuestCartInfo(session.get("tempUserId").toString());
			}else{
				count = dao.updateProductCount(session.get("tempUserId").toString(), Integer.parseInt(session.get("productId").toString()), productCount, Integer.parseInt(session.get("price").toString()));
				cartList = dao.getGuestCartInfo(session.get("tempUserId").toString());
			}
			subTotalPrice = productCount * Integer.parseInt(session.get("price").toString());
			System.out.println(subTotalPrice);
		}

		session.put("cartList",cartList);

		totalPrice = calcTotalPrice(cartList);
		session.put("totalPrice", totalPrice);
		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}

	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
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

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int calcTotalPrice(ArrayList<CartDTO> cartList) {
		int totalPrice = 0;
		for (CartDTO dto : cartList) {
			totalPrice += dto.getPrice() * dto.getProductCount();
		}
		return totalPrice;
	}

	public boolean isDuplicationFlg() {
		return duplicationFlg;
	}

	public void setDuplicationFlg(boolean duplicationFlg) {
		this.duplicationFlg = duplicationFlg;
	}
}
