package com.internousdev.pixpress.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdev.pixpress.util.DBConnector;

public class MasterChangeDAO {


		public int productChangeInfo(int productId,String productName,String productNameKane,String productDescription,int categoryId,int price,String director,String castName1,String castName2,String castName3,String imageFilePath, int releaseYear) {
			DBConnector dbConnector = new DBConnector();
			Connection connection = dbConnector.getConnection();

			String sql = "UPDATE product_info SET product_name=?,product_name_kana=?,product_description=?,category_id=?,price=?,director=?,cast_name1=?,cast_name2=?,cast_name3=?,image_file_path=?,release_year=? WHERE product_id = ?";
			int count = 0;
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, productName);
				preparedStatement.setString(2, productNameKane);
				preparedStatement.setString(3, productDescription);
				preparedStatement.setInt(4, categoryId);
				preparedStatement.setInt(5, price);
				preparedStatement.setString(6, director);
				preparedStatement.setString(7, castName1);
				preparedStatement.setString(8, castName2);
				preparedStatement.setString(9, castName3);
				preparedStatement.setString(10, imageFilePath);
				preparedStatement.setInt(11, releaseYear);
				preparedStatement.setInt(12, productId);
				count = preparedStatement.executeUpdate();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				try{
				connection.close();
			}catch (Exception e) {
				e.printStackTrace();
			}

		}
			return count;
	}

}
