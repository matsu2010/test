/*担当:小松*/

package com.internousdev.pixpress.action;


import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.dao.UserCreateConfirmDAO;
import com.internousdev.pixpress.dto.LoginDTO;
import com.internousdev.pixpress.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{
	public Map<String, Object> session;

	private UserCreateConfirmDAO userCreateConfirmDAO = new UserCreateConfirmDAO();

	private Map<String, String> errorMsg;

	private String userIdErrorMsg;

	private String userId;

	private String password;

	private String familyName;

	private String firstName;

	private String familyNameKana;

	private String firstNameKana;

	private String sex;

	private String email;

	public String execute() throws SQLException{

		if(session.containsKey("LoginDTO")){

			return ERROR;

		}

		LoginDTO loginDTO = new LoginDTO();

		loginDTO.setUserId(userId);
		loginDTO.setPassword(password);
		loginDTO.setFamilyName(familyName);
		loginDTO.setFirstName(firstName);
		loginDTO.setFamilyNameKana(familyNameKana);
		loginDTO.setFirstNameKana(firstNameKana);
		loginDTO.setSex(Integer.parseInt(sex));
		loginDTO.setEmail(email);

		/*入力情報をsessionに格納する*/
		session.put("CreateUserDTO", loginDTO);
		session.put("sex", this.sex);

		/*インプットチェッカーで重複を確認*/
		errorMsg = InputChecker.createNewUserChk(loginDTO);
		userIdErrorMsg = UserCreateConfirmDAO.getOverlapping(userId);

		if(!errorMsg.isEmpty() || userIdErrorMsg != null){

			return ERROR;

		}

		session.put("CreateUserDTO", loginDTO);
		session.put("sex", this.sex);

		return SUCCESS;

	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public Map<String, String> getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(Map<String, String> errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getUserIdErrorMsg() {
		return userIdErrorMsg;
	}

	public void setUserIdErrorMsg(String userIdErrorMsg) {
		this.userIdErrorMsg = userIdErrorMsg;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyNameKana() {
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNameKana() {
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserCreateConfirmDAO getUserCreateConfirmDAO() {
		return userCreateConfirmDAO;
	}

	public void setUserCreateConfirmDAO(UserCreateConfirmDAO userCreateConfirmDAO) {
		this.userCreateConfirmDAO = userCreateConfirmDAO;
	}

}
