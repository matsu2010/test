//担当：森本

package com.internousdev.pixpress.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.pixpress.dto.PurchaseHistoryDTO;
import com.internousdev.pixpress.dto.PurchaseHistoryDetailsDTO;
import com.internousdev.pixpress.util.DBConnector;

public class PurchaseHistoryDAO {

	public int insertPurchaseHistory(String userId, int productId, int productCount, int subTotalPrice, int destinationId, String deliveryDate, String deliveryTime){

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql="INSERT INTO purchase_history_info (user_id, product_id, product_count, price, destination_id, delivery_date, delivery_time, regist_date, update_date) VALUES (?, ?, ?, ?, ?, ?, ?, now(), '0000-01-01')";
		int count = 0;

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			preparedStatement.setInt(2, productId);
			preparedStatement.setInt(3, productCount);
			preparedStatement.setInt(4, subTotalPrice);
			preparedStatement.setInt(5, destinationId);
			preparedStatement.setString(6, deliveryDate);
			preparedStatement.setString(7, deliveryTime);
			count = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			  try{
				connection.close();
			  }catch(SQLException e){
				  e.printStackTrace();
			  }
		}
		return count;
	}

	public ArrayList<PurchaseHistoryDTO> getPurchaseHistory(String userId){

		 ArrayList<PurchaseHistoryDTO> purchaseList = new ArrayList<>();


		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		//商品履歴からユーザーが買ったものすべてを、買った順に並べる
		String sql = "SELECT phi.id, phi.user_id, phi.product_id, phi.product_count, phi.price, phi.regist_date, phi.delivery_date, phi.delivery_time, di.user_address FROM purchase_history_info as phi LEFT JOIN destination_info as di ON phi.destination_id = di.id WHERE phi.user_id = ? ORDER by phi.id desc";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				PurchaseHistoryDTO purchaseHistoryDTO = new PurchaseHistoryDTO();
				purchaseHistoryDTO.setPurchaseHistoryId(resultSet.getInt("id"));
				purchaseHistoryDTO.setUserId(resultSet.getString("user_id"));
				purchaseHistoryDTO.setProductId(resultSet.getInt("product_id"));
				purchaseHistoryDTO.setProductCount(resultSet.getInt("product_count"));
				purchaseHistoryDTO.setPrice(resultSet.getInt("price"));
				purchaseHistoryDTO.setRegistDate(resultSet.getString("regist_date"));
				purchaseHistoryDTO.setDeliveryDate(resultSet.getString("delivery_date"));
				purchaseHistoryDTO.setDeliveryTime(resultSet.getString("delivery_time"));
				purchaseHistoryDTO.setUserAddress(resultSet.getString("user_address"));

				purchaseList.add(purchaseHistoryDTO);
			}
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try{
		connection.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	return purchaseList;
		}


	public int deleteHistory(String userId) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int check = 0;

		String sql = "DELETE FROM purchase_history_info where user_id = ?";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, userId);
			check = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return check;
	}


	public PurchaseHistoryDetailsDTO getPurchaseHistoryDetails(int purchseHistoryId){

		System.out.println(purchseHistoryId);

		PurchaseHistoryDetailsDTO purchaseHistoryDetailsDTO = new PurchaseHistoryDetailsDTO();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT phi.id as id, pi.product_id as product_id, pi.product_name as product_name, pi.product_name_kana as product_name_kana , pi.product_description as product_description,pi.image_file_name as image_file_name, pi.image_file_path as image_file_path, phi.price, phi.product_count, di.user_address, pi.director, pi.cast_name1, pi.cast_name2, pi.cast_name3, release_year,  phi.regist_date, pi.category_id as category_id  FROM purchase_history_info as phi LEFT JOIN product_info as pi ON phi.product_id = pi.product_id LEFT JOIN destination_info as di ON phi.destination_id = di.id  WHERE phi.id = ? ";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, purchseHistoryId);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){

				purchaseHistoryDetailsDTO.setProductName(rs.getString("product_name"));
				purchaseHistoryDetailsDTO.setProductNameKana(rs.getString("product_name_kana"));
				purchaseHistoryDetailsDTO.setProductDescription(rs.getString("product_description"));
				purchaseHistoryDetailsDTO.setImageFileName(rs.getString("image_file_name"));
				purchaseHistoryDetailsDTO.setImageFilePath(rs.getString("image_file_path"));
				purchaseHistoryDetailsDTO.setPrice(rs.getInt("price"));
				purchaseHistoryDetailsDTO.setId(rs.getString("id"));
				purchaseHistoryDetailsDTO.setProductId(rs.getString("product_id"));
				purchaseHistoryDetailsDTO.setProductCount(rs.getInt("phi.product_count"));
				purchaseHistoryDetailsDTO.setUserAddress(rs.getString("user_address"));
				purchaseHistoryDetailsDTO.setRegistDate(rs.getString("regist_date").replaceAll("\\.0$", ""));
				purchaseHistoryDetailsDTO.setCategoryId(rs.getInt("category_id"));
				purchaseHistoryDetailsDTO.setDirector(rs.getString("director"));
				purchaseHistoryDetailsDTO.setCastName1(rs.getString("cast_name1"));
				purchaseHistoryDetailsDTO.setCastName2(rs.getString("cast_name2"));
				purchaseHistoryDetailsDTO.setCastName3(rs.getString("cast_name3"));
				purchaseHistoryDetailsDTO.setReleaseYear(rs.getInt("release_year"));

			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return purchaseHistoryDetailsDTO;
	}


}


