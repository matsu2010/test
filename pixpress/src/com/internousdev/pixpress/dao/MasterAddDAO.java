package com.internousdev.pixpress.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.pixpress.dto.ProductListDTO;
import com.internousdev.pixpress.util.DBConnector;

/**
 * @author ookawa
 *
 */
public class MasterAddDAO {


	public int productAddInfo(int productId,String productName,String productNameKane,int categoryId,int releaseYear, int price,String director,String castName1,String castName2,String castName3,String productDescription,String imageFilePath) throws SQLException{
		DBConnector dbConnector = new DBConnector();
		int count=0;
		Connection connection = dbConnector.getConnection();
		ProductListDTO productListDTO = new ProductListDTO();
		String sql = "INSERT INTO product_info(product_id,product_name,product_name_kana,category_id,release_year,price,director,cast_name1,cast_name2,cast_name3,product_description,image_file_path,regist_date) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,now())";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, productId);
			preparedStatement.setString(2, productName);
			preparedStatement.setString(3, productNameKane);
			preparedStatement.setInt(4, categoryId);
			preparedStatement.setInt(5, releaseYear);
			preparedStatement.setInt(6, price);
			preparedStatement.setString(7, director);
			preparedStatement.setString(8, castName1);
			preparedStatement.setString(9, castName2);
			preparedStatement.setString(10, castName3);
			preparedStatement.setString(11, productDescription);
			preparedStatement.setString(12, imageFilePath);
			count = preparedStatement.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
		return count;
	}



	public ArrayList<ProductListDTO> productIdCheck(){

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		ArrayList<ProductListDTO> productList = new ArrayList<ProductListDTO>();

		String sql = "SELECT product_id FROM product_info";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				ProductListDTO productListDTO = new ProductListDTO();

				productListDTO.setProductId(resultSet.getInt("product_id"));
				productList.add(productListDTO);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			  try{
				connection.close();
			  }catch(SQLException e){
				  e.printStackTrace();
			  }
		}
		return productList;
	}

}
