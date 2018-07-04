package com.internousdev.pixpress.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class LogoutAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	public String execute(){
		String result = SUCCESS;

		//ログアウトする！！！
		session.remove("LoginDTO");
		session.remove("userId");
		session.remove("loginFlg");
		session.remove("masterId");
		session.remove("masterFlg");
		session.remove("userName");

		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}




}
