package com.internousdev.pixpress.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.MasterDeleteDAO;
import com.internousdev.pixpress.dto.ProductListDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ookawa
 *
 */
public class MasterDeleteCompleteAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;

	public String execute() throws SQLException{

		@SuppressWarnings("unchecked")
		List<String> deleteName = (List<String>) session.get("deleteName");

		for(int i=0; i<deleteName.size(); i++) {

			@SuppressWarnings("unchecked")
			List<ProductListDTO> list = (List<ProductListDTO>) session.get("productDeleteList");
			String productName = list.get(i).getProductName();

			MasterDeleteDAO dao = new MasterDeleteDAO();
			dao.productDeleteInfo(productName);
		}
		session.remove("productList");
		String result = SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return session;
	}


}
