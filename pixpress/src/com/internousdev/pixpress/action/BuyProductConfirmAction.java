package com.internousdev.pixpress.action; /*山本宰*/

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.AddressDAO;
import com.internousdev.pixpress.dto.AddressDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyProductConfirmAction extends ActionSupport implements SessionAware {

		public Map<String,Object>session;
		public String result;



		public String execute(){

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
			}else{

				session.put("payFlg",1);
				result=ERROR;

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