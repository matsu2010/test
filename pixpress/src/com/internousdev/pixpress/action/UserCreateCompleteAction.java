/*担当:小松*/

package com.internousdev.pixpress.action;


import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.CartDAO;
import com.internousdev.pixpress.dao.UserCreateCompleteDAO;
import com.internousdev.pixpress.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;

	private UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();

	private CartDAO cartDAO = new CartDAO();

	private LoginDTO loginDTO = new LoginDTO();

	public String execute() throws SQLException {

		int ret = 0;

		if(!session.containsKey("tempUserId")){

			return "session";

		}else if(!session.containsKey("CreateUserDTO")){

			return ERROR;

		}

		/*userCreateCompleteDAOで返したretが0以下の場合はエラーを返す*/
		loginDTO = (LoginDTO)session.get("CreateUserDTO");
		ret = userCreateCompleteDAO.createUserInfo(loginDTO);

		if(ret <= 0){

			return ERROR;

		}

		/*登録した新規ユーザーでログイン*/
		session.put("LoginDTO",loginDTO);

		String familyName = loginDTO.getFamilyName();
		String firstName = loginDTO.getFirstName();
		String userId = loginDTO.getUserId();

		session.put("userName", familyName +" "+ firstName);
		session.put("userId", userId);
		session.put("loginFlg", true);

		String tempUserId = session.get("tempUserId").toString();

		/*ゲストユーザーのカート情報を新規ユーザーでログイン後に引き継ぐ*/
		cartDAO.changeUserId(tempUserId,userId);
		cartDAO.getGuestCartInfo(tempUserId);

		session.remove("CreateUserDTO");

		String result = SUCCESS;

		return result;

	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}


}

