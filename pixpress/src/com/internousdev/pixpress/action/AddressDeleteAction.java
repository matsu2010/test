//担当：松岡

package com.internousdev.pixpress.action;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.AddressDAO;
import com.internousdev.pixpress.dto.AddressDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AddressDeleteAction extends ActionSupport implements SessionAware{
	private int id;
	private AddressDAO dao = new AddressDAO();
	public Map<String,Object>session;


	public String execute() throws SQLException{
		String result = ERROR;
		int count = dao.addressDelete(id);

		if(count>0){
			result = ERROR;
			System.out.println("削除しました。");

			if(session.containsKey("userId")){

				List<AddressDTO> addressDTOList = new ArrayList<>();
				AddressDAO addressDAO = new AddressDAO();

				try{
					addressDTOList = addressDAO.getAddress(String.valueOf(session.get("userId")));

					Iterator<AddressDTO> iterator = addressDTOList.iterator();
					if(!(iterator.hasNext())){
						addressDTOList = null;
					}
					session.put("addressDTOList",addressDTOList);

					result=SUCCESS;

				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}else{
			System.out.println("削除できませんでした。");
		}

		return result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Map<String,Object> getSession() {
	    return session;
	}

	public void setSession(Map<String,Object> session) {
	    this.session = session;
	}
}

