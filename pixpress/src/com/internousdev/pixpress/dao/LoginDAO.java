package com.internousdev.pixpress.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.pixpress.dto.LoginDTO;
import com.internousdev.pixpress.util.DBConnector;

public class LoginDAO {

	// ユーザーを情報取得するメソッド
	public LoginDTO getUserInfo(String userId, String password) throws SQLException{

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		LoginDTO dto = new LoginDTO();

		String sql = "SELECT * FROM user_info WHERE user_id = ? AND password = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				dto.setUserId(rs.getString("user_id"));
				dto.setPassword(rs.getString("password"));
				dto.setFamilyName(rs.getString("family_name"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setFamilyNameKana(rs.getString("family_name_kana"));
				dto.setFirstNameKana(rs.getString("first_name_kana"));
				dto.setEmail(rs.getString("email"));
				dto.setStatus(rs.getInt("logined"));
				dto.setMasterFlg(rs.getBoolean("master_flg"));
				dto.setRegistDate(rs.getString("regist_date"));
				dto.setUpdateDate(rs.getString("update_date"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}

		return dto;
	}

	// IDとパスワードが合ってるか確かめるメソッド
	public int login(String userId, String password) throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int result = 0;
		String sql = "UPDATE user_info SET logined = 1 WHERE user_id = ? AND password = ?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			result = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		return result;
	}

	//userIdが存在するかどうかのチェック
	public boolean existsUserId(String userId)throws SQLException{
		boolean result = false;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM user_info WHERE user_id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				result = true;
			}
		}catch(SQLException e){
			e.printStackTrace();

		}finally{
			con.close();
		}
		return result;
	}











	public String isUserPasswordTrue(String userId, String password){

		String result = null;

		String sql = "SELECT * FROM user_info WHERE user_id=?";

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();

		try{

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();

				//IDに対応するユーザーがいなかったら
				if(!rs.next()){

//					result = "ログインIDが間違っています";

				}else if(!password.equals(rs.getString("password"))){

					result = "【パスワードが間違っています】";

		}

		}catch(SQLException e){

			e.printStackTrace();

		}finally{

			try{

				con.close();

		}catch(SQLException e){

			e.printStackTrace();
		}

		}

		return result;

	}


	public static Object passwordIsTrue(String userId, String password) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
