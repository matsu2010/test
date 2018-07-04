package com.internousdev.pixpress.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.MCategoryDAO;
import com.internousdev.pixpress.dao.ProductListDAO;
import com.internousdev.pixpress.dao.ReviewDAO;
import com.internousdev.pixpress.dto.ProductListDTO;
import com.internousdev.pixpress.dto.ReviewDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ookawa
 *
 */
public class ProductDetailsAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;
	private int id;
	private int categoryId;
	private String categoryName;
	private int productId;
	public List<ProductListDTO> suggestList = new ArrayList<ProductListDTO>();
	private MCategoryDAO categoryDAO = new MCategoryDAO();
	public List<ReviewDTO> reviewDTOList = new ArrayList<ReviewDTO>();

//	@SuppressWarnings("unchecked")
	public String execute() {
		String result = SUCCESS;

		//商品削除後、表示とずれる問題を解決しました。　by松岡
		session.put("selectProductId",productId);
/*		List<ProductListDTO> productList = (List<ProductListDTO>) session.get("productList");
		session.put("selectProductId", productList.get(id - 1).getId());*/

		ProductListDAO productListDAO = new ProductListDAO();
		ProductListDTO productListDTO = new ProductListDTO();


		try{
			productListDTO = productListDAO.getSelectProductInfo(Integer.parseInt(session.get("selectProductId").toString()));
			if(productListDTO != null){
				session.put("productId", productListDTO.getProductId());
				session.put("price", productListDTO.getPrice());
				session.put("products", productListDTO);
			}else{
				return ERROR;
			}
		}catch(Exception e){
			e.printStackTrace();
		}


		ReviewDAO reviewDAO = new ReviewDAO();
		reviewDTOList = reviewDAO.getReviewInfo(Integer.parseInt(String.valueOf(session.get("productId"))));
		session.put("reviewDTOList", reviewDTOList);
		try {
			suggestList = categoryDAO.getSuggestProductInfo(categoryId,productId);

			if(suggestList != null) {
				session.put("SuggestList", suggestList);

			}else{
				return ERROR;
			}

		}catch(Exception e){
			e.printStackTrace();
		}

		return result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
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

	public List<ProductListDTO> getSuggestList() {
		return suggestList;
	}

	public void setSuggestList(List<ProductListDTO> suggestList) {
		this.suggestList = suggestList;
	}

	public List<ReviewDTO> getReviewDTOList() {
		return reviewDTOList;
	}

	public void setReviewDTOList(List<ReviewDTO> reviewDTOList) {
		this.reviewDTOList = reviewDTOList;
	}


}
