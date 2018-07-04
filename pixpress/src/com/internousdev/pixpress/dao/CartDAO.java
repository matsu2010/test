package com.internousdev.pixpress.dao;
/*
 * @author yazaki
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.pixpress.dto.CartDTO;
import com.internousdev.pixpress.util.DBConnector;

public class CartDAO {

	// ログインユーザーがカートに商品を追加するメソッド
	public int insertUserCart(String userId, int productId, int productCount, int price){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "INSERT INTO cart_info(user_id, temp_user_id, product_id, product_count, price, regist_date, update_date) VALUES (?,?,?,?,?,NOW(),NOW())";

		int count = 0;

		try{
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, userId);
			ps.setInt(3, productId);
			ps.setInt(4, productCount);
			ps.setInt(5, price);
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

	// ゲストユーザーがカートに商品を追加するメソッド
		public int insertGuestCart(String tempUserId, int productId, int productCount, int price) {
			DBConnector db = new DBConnector();
			Connection con = db.getConnection();

			String sql = "INSERT INTO cart_info(user_id, temp_user_id, product_id, product_count, price, regist_date, update_date) VALUES (?,?,?,?,?,NOW(),NOW())";

			int count = 0;

			try{
				con = db.getConnection();
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, tempUserId);
				ps.setString(2, tempUserId);
				ps.setInt(3, productId);
				ps.setInt(4, productCount);
				ps.setInt(5, price);
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

	// ログインユーザーのカート情報を全取得するメソッド
	public ArrayList<CartDTO> getUserCartInfo(String userId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();

		String sql = "SELECT ci.id as id, "
				+ "ci.user_id as user_id, "
				+ "ci.temp_user_id as temp_user_id, "
				+ "ci.product_id as product_id, "
				+ "pi.category_id as category_id, "
				+ "pi.product_name as product_name, "
				+ "pi.product_name_kana as product_name_kana, "
				+ "pi.image_file_path as image_file_path, "
				+ "pi.price as price, "
				+ "pi.director as director, "
				+ "pi.release_year as release_year, "
				+ "ci.product_count as product_count "
				+ "FROM cart_info as ci LEFT JOIN product_info as pi "
				+ "ON ci.product_id = pi.product_id WHERE user_id = ? AND pi.price not in ('0') ";

		try{
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				CartDTO cartDTO = new CartDTO();

				cartDTO.setUserId(rs.getString("user_id"));
				cartDTO.setId(rs.getInt("id"));
				cartDTO.setProductId(rs.getInt("product_id"));
				cartDTO.setCategoryId(rs.getInt("category_id"));
				cartDTO.setProductName(rs.getString("product_name"));
				cartDTO.setProductNameKana(rs.getString("product_name_kana"));
				cartDTO.setImageFilePath(rs.getString("image_file_path"));
				cartDTO.setDirector(rs.getString("director"));
				cartDTO.setReleaseYear(rs.getString("release_year"));
				cartDTO.setPrice(rs.getInt("price"));
				cartDTO.setProductCount(rs.getInt("product_count"));

				cartDTO.setSubTotalPrice(rs.getInt("price") * rs.getInt("product_count"));

				cartList.add(cartDTO);

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

		return cartList;
	}

	// ゲストユーザーのカート情報を全取得するメソッド
	public ArrayList<CartDTO> getGuestCartInfo(String tempUserId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();

		String sql = "SELECT ci.product_id as product_id, "
				+ "pi.category_id as category_id, "
				+ "pi.product_name as product_name, "
				+ "pi.product_name_kana as product_name_kana, "
				+ "pi.image_file_path as image_file_path, "
				+ "pi.price as price, "
				+ "pi.director as director, "
				+ "pi.release_year as release_year, "
				+ "ci.product_count as product_count "
				+ "FROM cart_info as ci LEFT JOIN product_info as pi "
				+ "ON ci.product_id = pi.product_id WHERE temp_user_id = ?  AND pi.price not in ('0')  ";

		try{
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, tempUserId);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				CartDTO cartDTO = new CartDTO();

				cartDTO.setProductId(rs.getInt("product_id"));
				cartDTO.setCategoryId(rs.getInt("category_id"));
				cartDTO.setProductName(rs.getString("product_name"));
				cartDTO.setProductNameKana(rs.getString("product_name_kana"));
				cartDTO.setImageFilePath(rs.getString("image_file_path"));
				cartDTO.setDirector(rs.getString("director"));
				cartDTO.setReleaseYear(rs.getString("release_year"));
				cartDTO.setPrice(rs.getInt("price"));
				cartDTO.setProductCount(rs.getInt("product_count"));

				cartDTO.setSubTotalPrice(rs.getInt("price") * rs.getInt("product_count"));

				cartList.add(cartDTO);

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
		return cartList;
	}

	// ログインユーザーのカート情報を取得するメソッド
	public ArrayList<CartDTO> acquireUserCartInfo(String userId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<CartDTO> cartList = new ArrayList<>();

		String sql = "SELECT * FROM cart_info WHERE user_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				CartDTO dto = new CartDTO();
				dto.setProductId(rs.getInt("product_id"));
				dto.setProductCount(rs.getInt("product_count"));

				cartList.add(dto);
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

		return cartList;
	}

	// ログインユーザーのカートに同じ商品があるか判定するメソッド
	public boolean sameProductExistByUser(String userId, int productId) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		boolean result = false;

		String sql = "SELECT * FROM cart_info WHERE user_id = ? AND product_id = ? ";

		try{
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setInt(2, productId);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				result = true;
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

	// ゲストユーザーのカートに同じ商品があるか判定するメソッド
	public boolean sameProductExistByGuest(String tempUserId, int productId) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		boolean result = false;

		String sql = "SELECT * FROM cart_info WHERE temp_user_id = ? AND product_id = ? ";

		try{
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, tempUserId);
			ps.setInt(2, productId);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				result = true;
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

	// ログインユーザーのカートの既存の商品の個数を追加するメソッド
	public int updateUserCartProductCount(String userId, int productId, int productCount) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int count = 0;

		String sql = "UPDATE cart_info SET product_count = product_count + ?  WHERE user_id = ? AND product_id = ? ";

		try{
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, productCount);
			ps.setString(2, userId);
			ps.setInt(3, productId);

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

	// ゲストユーザーのカートの既存の商品の個数を追加するメソッド
	public int updateGuestCartProductCount(String tempUserId, int productId, int productCount){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int count = 0;

		String sql = "UPDATE cart_info SET product_count = product_count + ?  WHERE user_id = ? AND product_id = ? ";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, productCount);
			ps.setString(2, tempUserId);
			ps.setInt(3, productId);

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

	// 重複時にカート内の購入個数を変更するメソッド
	public int updateProductCount(String userId, int productId, int productCount, int price){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int count = 0;

		String sql = "UPDATE cart_info SET update_date = NOW(), product_count = product_count + ? WHERE user_id = ? AND product_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, productCount);
			ps.setString(2, userId);
			ps.setInt(3, productId);

			ps.executeUpdate();
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

	// ゲストユーザーでカートに入れた情報をログインユーザーに渡す
	public void changeUserId(String tempUserId, String userId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "UPDATE cart_info SET user_id = ? , temp_user_id = ? WHERE temp_user_id = ? ";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, userId);
			ps.setString(3, tempUserId);

			ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

	}

	// カートから全件削除するメソッド
	public void deleteAllCartInfo(String userId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "DELETE FROM cart_info WHERE user_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);

			ps.executeUpdate();

		}catch (SQLException e){
			e.printStackTrace();
		}finally{

			try {
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

	//カートから選択削除するメソッド
	public void deleteSeparate(String userId, int productId) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "DELETE FROM cart_info WHERE user_id = ? AND product_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setInt(2, productId);

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		try {
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}


/*	// カートから1件ずつ削除するメソッド
	public void deleteSeparate(String userId, Integer integer){

		String sql = "DELETE FROM cart_info WHERE user_id = ? AND product_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setLong(2, integer);

			ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}*/


}