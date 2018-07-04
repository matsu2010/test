//担当：松岡

package com.internousdev.pixpress.action;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.pixpress.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class AddressRegiConfirmAction extends ActionSupport implements SessionAware {

	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String email;
	private int sex;
	private String telNumber;
	private String address1;
	private String address2;
	private String address3;

	Map<String,Object> session;

	private String errorFamilyName;
	private String errorFirstName;
	private String errorFamilyNameKana;
	private String errorFirstNameKana;
	private String errorEmail;
	private String errorTelNumber;
	private String errorAddress1;
	private String errorAddress2;
	private String errorAddress3;

	public String execute(){
		String result = SUCCESS;

		if(!session.containsKey("AddressFlg")){
			return result = "errorJsp";
		}else{

		if(!InputChecker.familyNameChk(familyName).equals("TRUE")){
			errorFamilyName = InputChecker.familyNameChk(familyName);
			result = ERROR;
		}

		if(!InputChecker.firstNameChk(firstName).equals("TRUE")){
			errorFirstName = InputChecker.firstNameChk(firstName);
			result = ERROR;
		}

		if(!InputChecker.familyNameKanaChk(familyNameKana).equals("TRUE")){
			errorFamilyNameKana = InputChecker.familyNameKanaChk(familyNameKana);
			result = ERROR;
		}

		if(!InputChecker.firstNameKanaChk(firstNameKana).equals("TRUE")){
			errorFirstNameKana = InputChecker.firstNameKanaChk(firstNameKana);
			result = ERROR;
		}

		if(!InputChecker.emailChk(email).equals("TRUE")){
			errorEmail = InputChecker.emailChk(email);
			result = ERROR;
		}

		if(!InputChecker.telNumberChk(telNumber).equals("TRUE")){
			errorTelNumber = InputChecker.telNumberChk(telNumber);
			result = ERROR;
		}

		if(!InputChecker.address1Chk(address1).equals("TRUE")){
			errorAddress1 = InputChecker.address1Chk(address1);
			result = ERROR;
		}

		if(!InputChecker.address2Chk(address2).equals("TRUE")){
			errorAddress2 = InputChecker.address2Chk(address2);
			result = ERROR;
		}


		if(!InputChecker.address3Chk(address3).equals("TRUE")){
			errorAddress3 = InputChecker.address3Chk(address3);
			result = ERROR;
		}

		if(result == SUCCESS){
		if(!(familyName.equals(""))&&(firstName.equals(""))&&(familyNameKana.equals(""))
				&&(firstNameKana.equals(""))&&(email.equals(""))&&(telNumber.equals(""))
				&&(address1.equals(""))&&(address2.equals(""))&&(address3.equals("")));{
			session.put("familyName",familyName);
			session.put("firstName", firstName);
			session.put("familyNameKana", familyNameKana);
			session.put("firstNameKana", firstNameKana);
			session.put("email", email);
			session.put("telNumber", telNumber);
			session.put("userAddress", address1 + " " + address2 + address3);
			session.remove("AddressFlg");
				}
		}
		}
			return result;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}


	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorFamilyName() {
		return errorFamilyName;
	}

	public void setErrorFamilyName(String errorFamilyName) {
		this.errorFamilyName = errorFamilyName;
	}

	public String getErrorFirstname() {
		return errorFirstName;
	}

	public void setErrorFirstname(String errorFirstName) {
		this.errorFirstName = errorFirstName;
	}

	public String getErrorFamilyNameKana() {
		return errorFamilyNameKana;
	}

	public void setErrorFamilyNameKana(String errorFamilyNameKana) {
		this.errorFamilyNameKana = errorFamilyNameKana;
	}

	public String getErrorFirstNameKana() {
		return errorFirstNameKana;
	}

	public void setErrorFirstNameKana(String errorFirstNameKana) {
		this.errorFirstNameKana = errorFirstNameKana;
	}

	public String getErrorEmail() {
		return errorEmail;
	}

	public void setErrorEmail(String errorEmail) {
		this.errorEmail = errorEmail;
	}

	public String getErrorTelNumber() {
		return errorTelNumber;
	}

	public void setErrorTelNumber(String errorTelNumber) {
		this.errorTelNumber = errorTelNumber;
	}

	public String getErrorFirstName() {
		return errorFirstName;
	}

	public void setErrorFirstName(String errorFirstName) {
		this.errorFirstName = errorFirstName;
	}

	public String getErrorAddress1() {
		return errorAddress1;
	}

	public void setErrorAddress1(String errorAddress1) {
		this.errorAddress1 = errorAddress1;
	}

	public String getErrorAddress2() {
		return errorAddress2;
	}

	public void setErrorAddress2(String errorAddress2) {
		this.errorAddress2 = errorAddress2;
	}

	public String getErrorAddress3() {
		return errorAddress3;
	}

	public void setErrorAddress3(String errorAddress3) {
		this.errorAddress3 = errorAddress3;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getSex() {
		return sex;
	}




}

