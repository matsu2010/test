/*担当:小松*/

package com.internousdev.pixpress.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.pixpress.dto.LoginDTO;
import com.internousdev.pixpress.util.DBConnector;

public class UserCreateCompleteDAO {


	public int createUserInfo(LoginDTO loginDTO) throws SQLException {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "INSERT INTO user_info(user_id,password,family_name,first_name,family_name_kana,first_name_kana,sex,email,regist_date,update_date)VALUES(?,?,?,?,?,?,?,?,now(),now())";

		int ret = 0;

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginDTO.getUserId());
			ps.setString(2, loginDTO.getPassword());
			ps.setString(3, loginDTO.getFamilyName());
			ps.setString(4, loginDTO.getFirstName());
			ps.setString(5, loginDTO.getFamilyNameKana());
			ps.setString(6, loginDTO.getFirstNameKana());
			ps.setInt(7, loginDTO.getSex());
			ps.setString(8, loginDTO.getEmail());

			ret = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

		return ret;

	}


}

