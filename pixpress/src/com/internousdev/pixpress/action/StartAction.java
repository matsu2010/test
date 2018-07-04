package com.internousdev.pixpress.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.MCategoryDAO;
import com.internousdev.pixpress.dao.ProductListDAO;
import com.internousdev.pixpress.dto.MCategoryDTO;
import com.internousdev.pixpress.dto.ProductListDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ookawa
 *
 */
public class StartAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;
	private List<MCategoryDTO> mCategoryDTOList = new ArrayList<MCategoryDTO>();

	private String categoryId;
	public List<ProductListDTO> productList;

	public String execute() {

		if(session.containsKey("masterFlg")){
			 List<MCategoryDTO> masterCategoryDTOList = new ArrayList<MCategoryDTO>();

			MCategoryDAO mCategoryDAO = new MCategoryDAO();
			masterCategoryDTOList = mCategoryDAO.getMasterCategoryList();
			session.put("masterCategoryDTOList", masterCategoryDTOList);
			return "master";
		}

		session.put("tempUserId", RandomValue());

		if(!session.containsKey("mCategoryList")) {
			MCategoryDAO mCategoryDAO = new MCategoryDAO();
			mCategoryDTOList = mCategoryDAO.getMCategoryList();
			session.put("mCategoryDTOList", mCategoryDTOList);
		}

		ProductListDAO productListDAO = new ProductListDAO();

		productList = productListDAO.getProductInfo();
		session.put("productList", productList);

		return SUCCESS;
	}

	public static String RandomValue() {
		String value = "";
		double d;
		for (int i = 1; i <= 16; i++) {
			d = Math.random() * 10;
			value = value + ((int) d);
		}
		return value;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public List<MCategoryDTO> getmCategoryDTOList() {
		return mCategoryDTOList;
	}

	public void setmCategoryDTOList(List<MCategoryDTO> mCategoryDTOList) {
		this.mCategoryDTOList = mCategoryDTOList;
	}


	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public List<ProductListDTO> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductListDTO> productList) {
		this.productList = productList;
	}

}
