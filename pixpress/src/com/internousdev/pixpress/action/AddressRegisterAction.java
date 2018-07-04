//担当：松岡

package com.internousdev.pixpress.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class AddressRegisterAction extends ActionSupport implements SessionAware {
	private String familyName;

	private String firstName;

	private String familyNameKana;

	private String firstNameKana;

	private String email;

	private String telNumber;

	private String address1;

	private String address2;

	private String address3;

	Map<String,Object> session;



	public String execute(){
		String result;

		if(!session.containsKey("userId") || session.containsKey("masterFlg") ){
			result = "errorJsp";
		}else{
			result = SUCCESS;
			session.put("AddressFlg", true);
		}

		return result;
	}

	public String getFamilyName(){
		return familyName;
	}

	public void setFamilyName(String familyName){
		this.familyName = familyName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName =firstName ;
	}

	public String getFamilyNameKana(){
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana){
		this.familyNameKana = familyNameKana ;
	}

	public String getFirstNameKana(){
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana){
		this.firstNameKana = firstNameKana ;
	}

	public String getEmail(){
		return email ;
	}

	public void setEmail(String email){
		this.email = email ;
	}

	public String getTelNumber(){
		return telNumber ;
	}

	public void setTelNumber(String telNumber){
		this.telNumber = telNumber ;
	}

	public String getAddress1(){
		return address1 ;
	}

	public void setAddress1(String address1){
		this.address1 = address1 ;
	}


	public String getAddress2(){
		return address2 ;
	}

	public void setAddress2(String address2){
		this.address2 = address2 ;
	}


	public String getAddress3(){
		return address3 ;
	}

	public void setAddress3(String address3){
		this.address3 = address3 ;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
