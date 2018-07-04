package com.internousdev.pixpress.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.internousdev.pixpress.dto.ProductListDTO;
import com.internousdev.pixpress.util.DBConnector;

/**
 * @author ookawa
 *
 */
public class ProductListDAO {

	private ArrayList<ProductListDTO> productList = new ArrayList<>();


	public ArrayList<ProductListDTO> getProductInfo(){
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "SELECT id, product_id, category_id, image_file_path, product_name, price, director, cast_name1, cast_name2, cast_name3 FROM product_info";


		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				ProductListDTO productListDTO = new ProductListDTO();
				productListDTO.setId(resultSet.getInt("id"));
				productListDTO.setProductId(resultSet.getInt("product_id"));
				productListDTO.setCategoryId(resultSet.getInt("category_id"));
				productListDTO.setImageFilePath(resultSet.getString("image_file_path"));
				productListDTO.setProductName(resultSet.getString("product_name"));
				productListDTO.setPrice(resultSet.getInt("price"));
				productListDTO.setDirector(resultSet.getString("director"));
				productListDTO.setCastName1(resultSet.getString("cast_name1"));
				productListDTO.setCastName2(resultSet.getString("cast_name2"));
				productListDTO.setCastName3(resultSet.getString("cast_name3"));

				productList.add(productListDTO);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return productList;
	}

	public ProductListDTO getSelectProductInfo(int id) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		ProductListDTO productListDTO = new ProductListDTO();

		String sql = "SELECT id, product_id, category_id, image_file_path, product_name, product_name_kana, price, director, cast_name1, cast_name2, cast_name3, product_description, release_year, status FROM product_info WHERE product_id = ?";


	try{
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();


		if(resultSet.next()){
			productListDTO.setId(resultSet.getInt("id"));
			productListDTO.setProductId(resultSet.getInt("product_id"));
			productListDTO.setCategoryId(resultSet.getInt("category_id"));
			productListDTO.setImageFilePath(resultSet.getString("image_file_path"));
			productListDTO.setProductName(resultSet.getString("product_name"));
			productListDTO.setProductNameKana(resultSet.getString("product_name_kana"));
			productListDTO.setPrice(resultSet.getInt("price"));
			productListDTO.setDirector(resultSet.getString("director"));
			productListDTO.setCastName1(resultSet.getString("cast_name1"));
			productListDTO.setCastName2(resultSet.getString("cast_name2"));
			productListDTO.setCastName3(resultSet.getString("cast_name3"));
			productListDTO.setProductDescription(resultSet.getString("product_description"));
			productListDTO.setReleaseYear(resultSet.getInt("release_year"));
		}else{
			return null;
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	return productListDTO;
}



	public ProductListDTO getSelectProductInfoName(String productName) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		ProductListDTO productListDTO = new ProductListDTO();

		String sql = "SELECT id, product_id, category_id, image_file_path, product_name, product_name_kana, price, director, cast_name1, cast_name2, cast_name3, product_description, release_year, status FROM product_info WHERE product_name = ?";


	try{
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, productName);
		ResultSet resultSet = preparedStatement.executeQuery();


		if(resultSet.next()){
			productListDTO.setId(resultSet.getInt("id"));
			productListDTO.setProductId(resultSet.getInt("product_id"));
			productListDTO.setCategoryId(resultSet.getInt("category_id"));
			productListDTO.setImageFilePath(resultSet.getString("image_file_path"));
			productListDTO.setProductName(resultSet.getString("product_name"));
			productListDTO.setProductNameKana(resultSet.getString("product_name_kana"));
			productListDTO.setPrice(resultSet.getInt("price"));
			productListDTO.setDirector(resultSet.getString("director"));
			productListDTO.setCastName1(resultSet.getString("cast_name1"));
			productListDTO.setCastName2(resultSet.getString("cast_name2"));
			productListDTO.setCastName3(resultSet.getString("cast_name3"));
			productListDTO.setProductDescription(resultSet.getString("product_description"));
			productListDTO.setReleaseYear(resultSet.getInt("release_year"));
		}else{
			return null;
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	return productListDTO;
}


}
