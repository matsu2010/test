//西島 changePasswordDAO

package com.internousdev.pixpress.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.pixpress.dto.LoginDTO;
import com.internousdev.pixpress.util.DBConnector;
import com.internousdev.pixpress.util.InputChecker;

/**
 *ユーザーのパスワードを変更するDAO
 * @author nishijima
 *
 */

public class ChangePasswordDAO {

	//新しいパスワードの入力情報が合っているかどうか
	public String isUserIdTrue(String userId, String password){

		String result = null;

		String sql = "SELECT * FROM user_info WHERE user_id=?";

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();

		try{

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();

				//IDに対応するユーザーがいなかったら
				if(userId.length() < 1) {

					result = "【ログインIDを入力してください】";
				}else if(!rs.next()){
					result = "【ログインIDが間違っています】";

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


	//入力情報が合っているかどうか
	public String isUserPasswordTrue(String userId, String password){

		String result = null;

		String passwordErrorMsg;

		passwordErrorMsg = InputChecker.passwordChk(password);

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

				/*}else if(password.length() < 1){

					result = "【パスワードを入力してください】";*/

				}else if(!password.equals(rs.getString("password")) && passwordErrorMsg == null){

					result = "【入力されたパスワードが異なります】";



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

	public String isNewPasswordTrue(String userId, String password){

		String result = null;

		String sql = "SELECT * FROM user_info WHERE user_id=?";

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();

		try{

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();

			if(!rs.next()){

				//IDに対応するユーザーがいなかったら
			}else if(password.equals(rs.getString("password"))){

				result = "【以前と同じパスワードは使用できません】";

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


	//パスワードを再設定するメソッド
	public int updatePassword(LoginDTO loginDTO){

		String userId = loginDTO.getUserId();

		String password = loginDTO.getPassword();

		String sql = " UPDATE user_info SET password = ? WHERE user_id = ? ";

		int ret = 0;

		DBConnector dbConnector = new DBConnector();

		Connection con = (Connection)dbConnector.getConnection();


		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, password);
			ps.setString(2, userId);

			ret = ps.executeUpdate();


		}catch(SQLException e){

			e.printStackTrace();

		}finally{

			try{

				con.close();

			}catch(SQLException e){

				e.printStackTrace();

			}

	}

	return ret;
	}


}









