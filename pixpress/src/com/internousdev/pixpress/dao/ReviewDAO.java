package com.internousdev.pixpress.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.pixpress.dto.ReviewDTO;
import com.internousdev.pixpress.util.DBConnector;

/*
 * @author yazaki
 */

public class ReviewDAO {

	List<ReviewDTO> reviewList = new ArrayList<>();
	List<ReviewDTO> reviewMyList = new ArrayList<>();

	// 投稿されたレビューをテーブルに挿入
	public int insertReview(String userId, int productId, String productName, String reviewTitle, int reviewScore, String reviewBody){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
/*		DateUtil dateUtil = new DateUtil();*/

		int count = 0;

		String sql = "INSERT INTO review (user_id, product_id, product_name, review_title, review_score, review_body, regist_date) VALUES (?,?,?,?,?,?,now())";


		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, userId);
			ps.setInt(2, productId);
			ps.setString(3, productName);
			ps.setString(4, reviewTitle);
			ps.setInt(5, reviewScore);
			ps.setString(6, reviewBody);
//			ps.setString(7, dateUtil.getDate());


			count = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		return count;
	}

	// 商品のレビュー検索

	public List<ReviewDTO> getReviewInfo(int productId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM review WHERE product_id LIKE ? ";
		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, productId);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ReviewDTO reviewDTO = new ReviewDTO();

				reviewDTO.setUserId(rs.getString("user_id"));
				reviewDTO.setProductId(rs.getInt("product_id"));
				reviewDTO.setReviewTitle(rs.getString("review_title"));
				reviewDTO.setReviewScore(rs.getInt("review_score"));
				reviewDTO.setReviewBody(rs.getString("review_body"));

				reviewList.add(reviewDTO);
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

		return reviewList;
	}

	// ログインユーザー自身のレビュー検索

	public List<ReviewDTO> getMyReview(String userId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM review WHERE user_id =?" ;

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,userId);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ReviewDTO reviewDTO = new ReviewDTO();
				reviewDTO.setId(rs.getInt("id"));
				reviewDTO.setUserId(rs.getString("user_id"));
				reviewDTO.setProductId(rs.getInt("product_id"));
				reviewDTO.setProductName(rs.getString("product_name"));
				reviewDTO.setReviewTitle(rs.getString("review_title"));
				reviewDTO.setReviewScore(rs.getInt("review_score"));
				reviewDTO.setReviewBody(rs.getString("review_body"));
				reviewDTO.setRegistDate(rs.getString("regist_date"));

				reviewMyList.add(reviewDTO);
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

		return reviewMyList;
	}

	// 既にレビューを投稿しているか確認
	public int checkAlreadyReview(String userId, int productId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		int count = 0;

		String sql = "SELECT COUNT(product_id) as count FROM review WHERE product_id = '" + productId + "' "
				+ "AND user_id = '" + userId + "'";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				count = rs.getInt("count");
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

		return count;
	}

	// 選択したレビューを削除

	public int deleteSelect(List<Integer> id, String user_id){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "DELETE FROM review WHERE id = ? AND user_id = ?";

		int count = 0;

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			for(int pi : id){
				ps.setInt(1, pi);
				ps.setString(2, user_id);
				count += ps.executeUpdate();
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

		return count;
	}

	// レビュー一括削除

	public int deleteAll(String user_id){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "DELETE FROM review WHERE user_id = ?";

		int count = 0;

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, user_id);
			count = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		return count;
	}

}
