//西島

package com.internousdev.pixpress.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.ChangePasswordDAO;
import com.internousdev.pixpress.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ChangePasswordCompleteAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;

	private LoginDTO LoginDTO = new LoginDTO();

	private ChangePasswordDAO ChangePasswordDAO = new ChangePasswordDAO();

	public String execute(){

		String result = ERROR;

		int ret = 0;

		//不正なアクセスはhome.jspへ送り返す
		if(!session.containsKey("UserPasswordUpdateDTO")){

			return "home";

		}


		LoginDTO = (LoginDTO)session.get("UserPasswordUpdateDTO");

		//新しいパスワードに更新する
		ret = ChangePasswordDAO.updatePassword(LoginDTO);

		if(ret > 0){

			result = SUCCESS;

		}

		//セッションの掃除
		session.remove("UserPasswordUpdateDTO");
		session.remove("hidePassword");


		return result;


	}


	//フィールドのgetterとsetter
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}




}
