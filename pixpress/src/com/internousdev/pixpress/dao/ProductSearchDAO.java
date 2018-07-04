package com.internousdev.pixpress.dao;

/*
 * @author yazaki
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.pixpress.dto.ProductListDTO;
import com.internousdev.pixpress.util.DBConnector;

public class ProductSearchDAO {

	ArrayList<ProductListDTO> searchList = new ArrayList<ProductListDTO>();

	// カテゴリーのみで検索
	public ArrayList<ProductListDTO> byProductCategory(int categoryId) throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "SELECT * FROM product_info WHERE category_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, categoryId);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ProductListDTO dto = new ProductListDTO();

				dto.setId(rs.getInt("id"));
				dto.setProductId(rs.getInt("product_id"));
				dto.setProductName(rs.getString("product_name"));
				dto.setCategoryId(rs.getInt("category_id"));
				dto.setPrice(rs.getInt("price"));
				dto.setCastName1(rs.getString("cast_name1"));
				dto.setCastName2(rs.getString("cast_name2"));
				dto.setCastName3(rs.getString("cast_name3"));
				dto.setDirector(rs.getString("director"));
				dto.setReleaseYear(rs.getInt("release_year"));
				dto.setProductDescription(rs.getString("product_description"));
				dto.setImageFileName(rs.getString("image_file_name"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setRegistDate(rs.getString("regist_date"));
				searchList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}

		return searchList;
	}

	// カテゴリー、検索ワードで検索
		public ArrayList<ProductListDTO> bySearchWord(String searchWord, String searchWordKana, int categoryId) throws SQLException{
			DBConnector db = new DBConnector();
			Connection con = db.getConnection();
			String sql = "SELECT * FROM product_info WHERE (product_name LIKE \'%" + searchWord + "%\' "
			  		+ "OR product_name_kana LIKE \'%" + searchWordKana + "%\' "
	  				+ "OR cast_name1 LIKE \'%" + searchWord + "%\' "
	  				+ "OR cast_name2 LIKE \'%" + searchWord + "%\' "
	  				+ "OR cast_name3 LIKE \'%" + searchWord + "%\' "
	  				+ "OR director LIKE \'%" + searchWord + "%\')";
			if (categoryId > 1){
				sql = sql + " AND category_id = ?";
			}

			try{
				PreparedStatement ps = con.prepareStatement(sql);
				if(categoryId > 1){
					ps.setInt(1, categoryId);
				}

				ResultSet rs = ps.executeQuery();

				while(rs.next()){
					ProductListDTO dto = new ProductListDTO();

					dto.setId(rs.getInt("id"));
					dto.setProductId(rs.getInt("product_id"));
					dto.setProductName(rs.getString("product_name"));
					dto.setCategoryId(rs.getInt("category_id"));
					dto.setPrice(rs.getInt("price"));
					dto.setCastName1(rs.getString("cast_name1"));
					dto.setCastName2(rs.getString("cast_name2"));
					dto.setCastName3(rs.getString("cast_name3"));
					dto.setDirector(rs.getString("director"));
					dto.setReleaseYear(rs.getInt("release_year"));
					dto.setProductDescription(rs.getString("product_description"));
					dto.setImageFileName(rs.getString("image_file_name"));
					dto.setImageFilePath(rs.getString("image_file_path"));
					dto.setRegistDate(rs.getString("regist_date"));
					searchList.add(dto);
				}
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				con.close();
			}

			return searchList;
		}

		// カテゴリー、複数ワードで検索
		public ArrayList<ProductListDTO> multiple(String[] serchWords, String[] keywords, int categoryId) throws SQLException{
			DBConnector db = new DBConnector();
			Connection con = db.getConnection();
			String sql = "SELECT * FROM product_info WHERE ";

			for(int s = 0; s < serchWords.length; s++){
				if(s != 0){
					sql = sql + " AND (product_name LIKE '%" + keywords[s] + "%' OR product_name_kana LIKE '%"+ serchWords[s] + "%' "
							+ "OR cast_name1 LIKE '%" + keywords[s] + "%'"
							+ "OR cast_name2 LIKE '%" + keywords[s] + "%'"
							+ "OR cast_name3 LIKE '%" + keywords[s] + "%'"
							+ "OR director LIKE '%" + keywords[s] + "%') ";

				} else {
					sql = sql + " (product_name LIKE '%" + keywords[s] + "%' OR product_name_kana LIKE '%"+ serchWords[s]+ "%'"
							+ "OR cast_name1 LIKE '%" + keywords[s] + "%'"
							+ "OR cast_name2 LIKE '%" + keywords[s] + "%'"
							+ "OR cast_name3 LIKE '%" + keywords[s] + "%'"
							+ "OR director LIKE '%" + keywords[s] + "%') ";


				}
			}

			if (categoryId > 1) {
				sql = sql + "AND category_id=?";
			}

			try{
				PreparedStatement ps = con.prepareStatement(sql);
				if(categoryId > 1){
					ps.setInt(1, categoryId);
				}

				ResultSet rs = ps.executeQuery();

				while(rs.next()){
					ProductListDTO dto = new ProductListDTO();

					dto.setId(rs.getInt("id"));
					dto.setProductId(rs.getInt("product_id"));
					dto.setProductName(rs.getString("product_name"));
					dto.setCategoryId(rs.getInt("category_id"));
					dto.setPrice(rs.getInt("price"));
					dto.setCastName1(rs.getString("cast_name1"));
					dto.setCastName2(rs.getString("cast_name2"));
					dto.setCastName3(rs.getString("cast_name3"));
					dto.setDirector(rs.getString("director"));
					dto.setReleaseYear(rs.getInt("release_year"));
					dto.setProductDescription(rs.getString("product_description"));
					dto.setImageFileName(rs.getString("image_file_name"));
					dto.setImageFilePath(rs.getString("image_file_path"));
					dto.setRegistDate(rs.getString("regist_date"));
					searchList.add(dto);
				}
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				con.close();
			}

			return searchList;
		}
}