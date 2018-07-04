package com.internousdev.pixpress.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.MasterChangeDAO;
import com.opensymphony.xwork2.ActionSupport;


public class MasterChangeCompleteAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;


	public String execute() {
		String result = ERROR;


		 int count = 0;
		 		MasterChangeDAO masterChangeDAO = new MasterChangeDAO();
		 		count += masterChangeDAO.productChangeInfo(
				Integer.parseInt(String.valueOf(session.get("selectProductId"))),
				String.valueOf(session.get("productName")),
				String.valueOf(session.get("productNameKana")),
				String.valueOf(session.get("productDescription")),
				Integer.parseInt(String.valueOf(session.get("categoryId"))),
				Integer.parseInt(String.valueOf(session.get("price"))),
				String.valueOf(session.get("director")),
				String.valueOf(session.get("castName1")),
				String.valueOf(session.get("castName2")),
				String.valueOf(session.get("castName3")),
				String.valueOf(session.get("userImage")),
				Integer.parseInt(String.valueOf(session.get("releaseYear"))));

		 		if(count>0){
		 			result = SUCCESS;
		 		}




		return result;
	}



	public Map<String,Object> getSession() {
	    return session;
	}


	public void setSession(Map<String,Object> session) {
	    this.session = session;
	}

}
