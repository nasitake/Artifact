package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Encryption;
import model.User;

public class PassChangeDAO {

	// データベース接続に使用する情報
	private final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private final String JDBC_URL ="jdbc:mysql://localhost:3306/docoTsubu";
	private final String DB_USER = "root";
	private final String DB_PASS = "";

	//パスワード変更メソッド
	public User PasswordChange(User ab) {
		Connection conn = null;
		try {

			//JDBCドライバを読み込み
			Class.forName("com.mysql.cj.jdbc.Driver");
			  //データベースへ接続
			  conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);

			  String Passchecksql="SELECT PASS FROM ACCOUNT1 WHERE EMAIL = ? && PASS = ?";

			  PreparedStatement pStmt0 = conn.prepareStatement(Passchecksql);

			  pStmt0.setString(1,ab.getEmail());
			  pStmt0.setString(2,ab.getPass());

			  ResultSet rs = pStmt0.executeQuery();

			  if(rs.next()) {
					return null;


			  }else{
				  Encryption encryption = new Encryption();
				  String Changesql="UPDATE ACCOUNT1 SET PASS = ? WHERE EMAIL = ?";
				  PreparedStatement pStmt1 = conn.prepareStatement(Changesql);
				  pStmt1.setString(1,encryption.seacret(ab.getPass()));
				  pStmt1.setString(2,ab.getEmail());

				  int result = pStmt1.executeUpdate();

				  if(result != 1) {
					  return null;
				  }

			  }
		 }catch(SQLException e) {
			  e.printStackTrace();
			  return null;

		  }catch(ClassNotFoundException e) {
				e.printStackTrace();
				return null;


		  }finally {
			  //データベース切断
			  if(conn != null) {
				  try {
					  conn.close();
				  }catch(SQLException e) {
					  e.printStackTrace();
					  return null;
				  }
			  }
		  }
			return ab;




		}
	}
