package com.internousdev.pixpress.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.MasterAddDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ookawa
 *
 */
public class MasterAddCompleteAction extends ActionSupport implements SessionAware{
	
	public Map<String, Object> session;
	public int count;
	
	public String execute() throws SQLException{
		MasterAddDAO masterAddDAO = new MasterAddDAO();
		
		String result = ERROR;
		
		int count = 0;

		count += masterAddDAO.productAddInfo(Integer.parseInt(session.get("productId").toString()),session.get("productName").toString(),session.get("productNameKana").toString(),Integer.parseInt(session.get("categoryId").toString()),Integer.parseInt(session.get("releaseYear").toString()),Integer.parseInt(session.get("price").toString()),session.get("director").toString(),session.get("castName1").toString(),session.get("castName2").toString(),session.get("castName3").toString(),session.get("productDescription").toString(),session.get("imageFilePath").toString());

		if(count>=0) {
			result = SUCCESS;
		}
		
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
