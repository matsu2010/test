package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template.util.DBConnector;
import com.internousdev.template.util.DateUtil;


public class UserCreateCompleteDAO {
	private DateUtil dateUtil = new DateUtil();
	private String sql ="INSERT INTO login_user_transaction(login_id,login_pass,user_name,birthday,sex,address,mail,tell,insert_date)VALUES(?,?,?,?,?,?,?,?,?)";
	public void createUser(String loginUserId,String loginUserPassword,String userName,String userBirthday,String userSex,String userAddress,String userMail, String userTell)throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,loginUserId);
			preparedStatement.setString(2,loginUserPassword);
			preparedStatement.setString(3, userName);
			preparedStatement.setString(4, userBirthday);
			preparedStatement.setString(5, userSex);
			preparedStatement.setString(6, userAddress);
			preparedStatement.setString(7, userMail);
			preparedStatement.setString(8, userTell);
			preparedStatement.setString(9, dateUtil.getDate());

			preparedStatement.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}
}
