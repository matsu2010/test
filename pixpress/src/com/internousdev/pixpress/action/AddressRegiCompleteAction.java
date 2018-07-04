//担当：松岡

package com.internousdev.pixpress.action;


import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.AddressDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AddressRegiCompleteAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;

	public String execute() throws SQLException{
		String result = ERROR;
		AddressDAO addressDAO = new AddressDAO();
		int count = addressDAO.addressInsert(session.get("userId").toString(),
				session.get("familyName").toString(),
				session.get("firstName").toString(),
				session.get("familyNameKana").toString(),
				session.get("firstNameKana").toString(),
				session.get("email").toString(),
				session.get("telNumber").toString(),
				session.get("userAddress").toString());

		if(count > 0){
				result = SUCCESS;
				session.remove("familyName");
				session.remove("firstName");
				session.remove("familyNameKana");
				session.remove("firstNameKana");
				session.remove("email");
				session.remove("telNumber");
				session.remove("userAddress");
		}
		return result;
	}


	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}