//西島

package com.internousdev.pixpress.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.ChangePasswordDAO;
import com.internousdev.pixpress.dto.LoginDTO;
import com.internousdev.pixpress.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class ChangePasswordConfirmAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;

	private String userId = "";

	private String userPassword = "";

	private String newPassword = "";

	private String newPasswordConfirm = "";

	private String hidePassword;
	private String userIdErrorMsg;

	private String passwordErrorMsg;

	private String matchPasswordErrorMsg;



	private LoginDTO loginDTO = new LoginDTO();

	private ChangePasswordDAO ChangePasswordDAO = new ChangePasswordDAO();

	private String newPasswordErrorMsg;

	private String userPasswordErrorMsg;


	public String execute() throws SQLException{

		String result = SUCCESS;


		//エラーメッセージチェック
		userIdErrorMsg = InputChecker.userIdChk(userId);
		passwordErrorMsg = InputChecker.passwordChk(userPassword);
		matchPasswordErrorMsg = InputChecker.passwordChk(newPassword);


		if(matchPasswordErrorMsg != null ||userIdErrorMsg != null || passwordErrorMsg != null){

			result = ERROR;

		}

		if(!newPassword.equals(newPasswordConfirm)){

			matchPasswordErrorMsg = "【新しいパスワードと確認用パスワードの値が一致していません】";
			result = ERROR;

		}


		userIdErrorMsg = ChangePasswordDAO.isUserIdTrue(userId, newPassword);
		userPasswordErrorMsg = ChangePasswordDAO.isUserPasswordTrue(userId, userPassword);
		newPasswordErrorMsg = ChangePasswordDAO.isNewPasswordTrue(userId, newPassword);


		if(userIdErrorMsg != null ||newPasswordErrorMsg != null || userPasswordErrorMsg != null){

			return ERROR;

		}


		//入力情報をLoginDTOに格納する
		loginDTO.setUserId(userId);
		loginDTO.setPassword(newPassword);

		//パスワードの一部を隠す
		//（字数を周囲に知られないためにパスワードの長さに関わらずパスワードの始めの1文字＋15文字分のアスタリスクを表示する）

		if(matchPasswordErrorMsg == null){
		StringBuffer sb = new StringBuffer(newPassword.substring(0, 1));

		sb.append("***************");

		hidePassword = sb.toString();
		}

		session.put("UserPasswordUpdateDTO", loginDTO);
		session.put("hidePassword", hidePassword);


		return result;



	}


	//フィールドのgetterとsetter
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getNewPasswordConfirm() {
		return newPasswordConfirm;
	}


	public void setNewPasswordConfirm(String newPasswordConfirm) {
		this.newPasswordConfirm = newPasswordConfirm;
	}


	public String getUserIdErrorMsg() {
		return userIdErrorMsg;
	}

	public void setUserIdErrorMsg(String userIdErrorMsg) {
		this.userIdErrorMsg = userIdErrorMsg;
	}

	public String getPasswordErrorMsg() {
		return passwordErrorMsg;
	}

	public void setPasswordErrorMsg(String passwordErrorMsg) {
		this.passwordErrorMsg = passwordErrorMsg;
	}


	public String getNewPasswordErrorMsg() {
		return newPasswordErrorMsg;
	}


	public void setNewPasswordErrorMsg(String newPasswordErrorMsg) {
		this.newPasswordErrorMsg = newPasswordErrorMsg;
	}


	public String getUserPasswordErrorMsg() {
		return userPasswordErrorMsg;
	}


	public void setUserPasswordErrorMsg(String userPasswordErrorMsg) {
		this.userPasswordErrorMsg = userPasswordErrorMsg;
	}

	public String getMatchPasswordErrorMsg() {
		return matchPasswordErrorMsg;
	}

	public void setMatchPasswordErrorMsg(String matchPasswordErrorMsg) {
		this.matchPasswordErrorMsg = matchPasswordErrorMsg;
	}










}
