/*担当:小松*/

package com.internousdev.pixpress.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.pixpress.util.DBConnector;

public class UserCreateConfirmDAO {

	public static String getOverlapping(String userId) throws SQLException {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = " SELECT user_id FROM user_info ";

		String result = null;

		List<String> userIdList = new ArrayList<String>();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){

				userIdList.add(rs.getString("user_id"));

			}
			for(String Id : userIdList){

				if(Id.equals(userId)){

					result = "【このIDは既に使われています】";

				}

			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			try{
				con.close();

			}catch(SQLException e){

				e.printStackTrace();

			}

		}

		return result;

	}
}