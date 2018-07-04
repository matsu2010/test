package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.UserCreateConfirmDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware {

	private String loginUserId;

	private String loginPassword;

	private String userName;

	private String year;

	private String month;

	private String day;

	private String userSex;

	private String address1;

	private String address2;

	private String address3;

	private String address4;

	private String userMail;

	private String userTell;

	public Map<String,Object>session;

	private String errorMessage;

	public String execute(){

		String result = SUCCESS;

		if(!(loginUserId.equals(""))
				&& !(loginPassword.equals(""))
				&& !(userName.equals(""))
				&& !(userSex.equals(""))
				&& !(userMail.equals(""))
				&& !(userTell.equals(""))){

			session.put("loginUserId",loginUserId);
			session.put("loginPassword",loginPassword);
			session.put("userName",userName);

			UserCreateConfirmDAO userCreateConfirmDAO = new UserCreateConfirmDAO();
			boolean checkId = userCreateConfirmDAO.getUserInfo(loginUserId,loginPassword);

			if(checkId){
				session.put("loginUserId", loginUserId);
				session.put("loginPassword", loginPassword);
				session.put("userName", userName);
				session.put("userBirthday",year +"年" + month + "月" + day + "日");
				session.put("year",year);
				session.put("month", month);
				session.put("day", day);
				session.put("userSex", userSex);
				session.put("userAddress","〒" + address1 + " " + address2 + address3 + address4);
				session.put("userMail", userMail);
				session.put("userTell", userTell);
			}
		}else{
			setErrorMessage("未入力の項目があります。");
			result = ERROR;
		}
		return result;
	}
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getYear(){
		return year;
	}
	public void setYear(String year){
		this.year = year;
	}

	public String getMonth(){
		return month;
	}
	public void setMonth(String month){
		this.month = month;
	}
	public String getDay(){
		return day;
	}
	public void setDay(String day){
		this.day = day;
	}
	public String getUserSex(){
		return userSex;
	}
	public void setUserSex(String userSex){
		this.userSex = userSex;
	}
	public String getAddress1(){
		return address1;
	}
	public void setAddress1(String address1){
		this.address1 = address1;
	}

	public String getAddress2(){
		return address2;
	}
	public void setAddress2(String address2){
		this.address2 = address2;
	}

	public String getAddress3(){
		return address3;
	}
	public void setAddress3(String address3){
		this.address3 = address3;
	}

	public String getAddress4(){
		return address4;
	}
	public void setAddress4(String address4){
		this.address4 = address4;
	}
	public String getUserMail(){
		return userMail;
	}
	public void setUserMail(String userMail){
		this.userMail = userMail;
	}
	public String getUserTell(){
		return userTell;
	}
	public void setUserTell(String userTell){
		this.userTell = userTell;
	}


	public Map<String,Object>getSession(){
		return session;


	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session = session;
	}
	public String getErrorMessage(){
		return errorMessage;
	}
	public void setErrorMessage(String errorMassage){
		this.errorMessage = errorMassage;
	}
}
