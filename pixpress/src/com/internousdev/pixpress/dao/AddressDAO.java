//担当：松岡

package com.internousdev.pixpress.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.pixpress.dto.AddressDTO;
import com.internousdev.pixpress.util.DBConnector;

public class AddressDAO {


	public int addressInsert(String userId, String familyName, String firstName, String familyNameKana, String firstNameKana, String email, String telNumber, String userAddress) throws SQLException{
	DBConnector db =new DBConnector();
	Connection con =db.getConnection();
	int count = 0;
	String sql = "INSERT INTO destination_info(user_id,family_name,first_name,family_name_kana,first_name_kana,email,tel_number,user_address,regist_date,update_date)"
			+ " values(?,?,?,?,?,?,?,?,now(),now())";
	try{
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, userId);
		ps.setString(2, familyName);
		ps.setString(3, firstName);
		ps.setString(4, familyNameKana);
		ps.setString(5, firstNameKana);
		ps.setString(6, email);
		ps.setString(7, telNumber);
		ps.setString(8, userAddress);
		count = ps.executeUpdate();
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		con.close();
	}
	return count;
}

	public int addressDelete(int id) throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int count = 0;

		String sql = "DELETE FROM destination_info where id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			count = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return count;
	}

	public List<AddressDTO> getAddress(String userId)throws SQLException{
		List<AddressDTO> addressDTOList = new ArrayList<AddressDTO>();

		DBConnector db =new DBConnector();
		Connection con =db.getConnection();

		String sql = "SELECT id,family_name,first_name,family_name_kana,first_name_kana,email,tel_number,user_address FROM destination_info WHERE user_id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,userId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				AddressDTO dto = new AddressDTO();
				dto.setId(rs.getInt("id"));
				dto.setFamilyName(rs.getString("family_name"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setFamilyNameKana(rs.getString("family_name_kana"));
				dto.setFirstNameKana(rs.getString("first_name_kana"));
				dto.setEmail(rs.getString("email"));
				dto.setTelNumber(rs.getString("tel_number"));
				dto.setUserAddress(rs.getString("user_address"));
				addressDTOList.add(dto);
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}finally{
				con.close();
			}
		return addressDTOList;
	}
}