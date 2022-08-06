package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Encryption;
import model.User;

public class EmployeeDAO {

	private final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	  private final String JDBC_URL ="jdbc:mysql://localhost:3306/docoTsubu";
	  private final String DB_USER = "root";
	  private final String DB_PASS = "";

		//ログイン認証用のメソッド
	  public User certification(User ab) {

		  Connection conn = null;
		  try {

			//JDBCドライバを読み込み
				Class.forName("com.mysql.cj.jdbc.Driver");
			  //データベースへ接続
			  conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);
			  Encryption encryption = new Encryption();
			  //SELECT文の準備
			  String sql = "SELECT EMAIL,USERNAME,PASS FROM ACCOUNT1 WHERE EMAIL = ? && USERNAME = ? && PASS = ?";

			  PreparedStatement pStmt = conn.prepareStatement(sql);

			  pStmt.setString(1, ab.getEmail());
			  pStmt.setString(2, ab.getUsername());
			  pStmt.setString(3, encryption.seacret(ab.getPass()));

			  ResultSet rs = pStmt.executeQuery();


			  //nextメソッドで先頭行から該当する行まで検索をかける
			  if(rs.next()) {
				// 見つかったアカウント情報を戻り値にセット
				  ab.setUsername(rs.getString("username"));
				  ab.setEmail(rs.getString("email"));
				  ab.setPass(rs.getString("pass"));
			  }else {
				  return null;
			  }

		  }catch(SQLException e) {
			  e.printStackTrace();
			  //return false; →return nullが正しい
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
