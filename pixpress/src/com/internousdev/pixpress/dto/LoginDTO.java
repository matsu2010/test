//舎川

package com.internousdev.pixpress.dto;

public class LoginDTO {

		private int Id;
		private String userId;
		private String password;
		private String familyName;
		private String firstName;
		private String familyNameKana;
		private String firstNameKana;
		private int sex;
		private String email;
		private int status;
		private boolean loginFlg;
		private boolean masterFlg;
		private String registDate;
		private String updateDate;

		//フィールドのgetterとsetter
		public int getId() {
			return Id;
		}

		public void setId(int id) {
			Id = id;
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

		public int getSex() {
			return sex;
		}

		public void setSex(int sex) {
			this.sex = sex;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		public boolean isLoginFlg() {
			return loginFlg;
		}

		public void setLoginFlg(boolean loginFlg) {
			this.loginFlg = loginFlg;
		}

		public boolean isMasterFlg() {
			return masterFlg;
		}

		public void setMasterFlg(boolean masterFlg) {
			this.masterFlg = masterFlg;
		}

		public String getRegistDate() {
			return registDate;
		}

		public void setRegistDate(String registDate) {
			this.registDate = registDate;
		}

		public String getUpdateDate() {
			return updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}




	}



