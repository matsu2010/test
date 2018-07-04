package com.internousdev.pixpress.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.ProductListDAO;
import com.internousdev.pixpress.dto.ProductListDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ookawa　
 *
 */
public class MasterDeleteConfirmAction extends ActionSupport implements SessionAware{

	private List<String> deleteName;
	public Map<String, Object> session;
	private String errorMessage;
	ProductListDTO productListDTO = new ProductListDTO();
	ArrayList<ProductListDTO> productDeleteList = new ArrayList<>();
	ProductListDAO productListDAO= new ProductListDAO();

	public String execute() {
		String result = ERROR;


		if(deleteName == null){
			errorMessage = "削除する商品を選択してください。";
			return result;
		}else{

		session.put("deleteName", deleteName);
		session.put("productDeleteListSize", deleteName.size());

		for(int i=0; i < deleteName.size(); i++) {
			String productName = deleteName.get(i);
			productListDTO =  productListDAO.getSelectProductInfoName(productName);
			productDeleteList.add(productListDTO);
			session.put("productDeleteList", productDeleteList);
		}
		result = SUCCESS;
		}

		return result;
	}




	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	/**
	 * deleteNameを取得します。
	 * @return deleteName
	 */
	public List<String> getDeleteName() {
	    return deleteName;
	}




	/**
	 * deleteNameを設定します。
	 * @param deleteName deleteName
	 */
	public void setDeleteName(List<String> deleteName) {
	    this.deleteName = deleteName;
	}




	public Map<String, Object> getSession() {
		return session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}



	/**
	 * productListDTOを取得します。
	 * @return productListDTO
	 */
	public ProductListDTO getProductListDTO() {
	    return productListDTO;
	}



	/**
	 * productListDTOを設定します。
	 * @param productListDTO productListDTO
	 */
	public void setProductListDTO(ProductListDTO productListDTO) {
	    this.productListDTO = productListDTO;
	}



	/**
	 * productDeleteListを取得します。
	 * @return productDeleteList
	 */
	public ArrayList<ProductListDTO> getProductDeleteList() {
	    return productDeleteList;
	}



	/**
	 * productDeleteListを設定します。
	 * @param productDeleteList productDeleteList
	 */
	public void setProductDeleteList(ArrayList<ProductListDTO> productDeleteList) {
	    this.productDeleteList = productDeleteList;
	}


}
