package com.internousdev.pixpress.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.internousdev.pixpress.dto.MCategoryDTO;
import com.internousdev.pixpress.dto.ProductListDTO;
import com.internousdev.pixpress.util.DBConnector;

/**
 * @author ookawa
 *
 */
public class MCategoryDAO {
	public List<MCategoryDTO> getMCategoryList(){
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		List<MCategoryDTO> mCategoryDTOList = new ArrayList<MCategoryDTO>();

		String sql="select*from m_category";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				MCategoryDTO mCategoryDTO = new MCategoryDTO();
				mCategoryDTO.setId(resultSet.getInt("id"));
				mCategoryDTO.setCategoryId(resultSet.getInt("category_id"));
				mCategoryDTO.setCategoryName(resultSet.getString("category_name"));
				mCategoryDTO.setCategoryDescription(resultSet.getString("category_description"));
				mCategoryDTO.setInsertDate(resultSet.getDate("insert_date"));
				mCategoryDTO.setUpdateDate(resultSet.getDate("update_date"));
				mCategoryDTOList.add(mCategoryDTO);
			}
			Iterator<MCategoryDTO> iterator = mCategoryDTOList.iterator();
			if(!(iterator.hasNext())) {
				mCategoryDTOList = null;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return mCategoryDTOList;
	}
	public ArrayList<ProductListDTO> getSuggestProductInfo(int categoryId, int productId) throws SQLException {
		ArrayList<ProductListDTO> suggestList = new ArrayList<>();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();


		//同カテ商品取得
		String sql = "SELECT * FROM  product_info WHERE category_id = ? AND product_id <> ? ORDER BY RAND() LIMIT 3 ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, categoryId);
			ps.setInt(2, productId);

			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				ProductListDTO dto = new ProductListDTO();

				dto.setId(rs.getInt("id"));
				dto.setCategoryId(rs.getInt("category_id"));
				dto.setProductId(rs.getInt("product_id"));
				dto.setProductName(rs.getString("product_name"));
				dto.setPrice(rs.getInt("price"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setUpdateDate(rs.getString("update_date"));

				suggestList.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return suggestList;
	}

	public List<MCategoryDTO> getMasterCategoryList(){
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		List<MCategoryDTO> masterCategoryDTOList = new ArrayList<MCategoryDTO>();

		String sql="select*from m_category WHERE id > 1";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				MCategoryDTO masterCategoryDTO = new MCategoryDTO();
				masterCategoryDTO.setId(resultSet.getInt("id"));
				masterCategoryDTO.setCategoryId(resultSet.getInt("category_id"));
				masterCategoryDTO.setCategoryName(resultSet.getString("category_name"));
				masterCategoryDTO.setCategoryDescription(resultSet.getString("category_description"));
				masterCategoryDTO.setInsertDate(resultSet.getDate("insert_date"));
				masterCategoryDTO.setUpdateDate(resultSet.getDate("update_date"));
				masterCategoryDTOList.add(masterCategoryDTO);
			}
			Iterator<MCategoryDTO> iterator = masterCategoryDTOList.iterator();
			if(!(iterator.hasNext())) {
				masterCategoryDTOList = null;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return masterCategoryDTOList;
	}

}
