package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Encryption;
import model.User;

public class RegisterDAO {

	// データベース接続に使用する情報
	private final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private final String JDBC_URL ="jdbc:mysql://localhost:3306/docoTsubu";
	private final String DB_USER = "root";
	private final String DB_PASS = "";

	//ユーザー情報登録メソッド
	public User AccountRegister(User ab) {
		Connection conn = null;
		try {

			//JDBCドライバを読み込み
			Class.forName("com.mysql.cj.jdbc.Driver");
			  //データベースへ接続
			  conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS);

		//メールアドレスのDB存在チェック
		String mailchecksql ="SELECT EMAIL FROM ACCOUNT1 WHERE EMAIL = ?";

		//sqlの準備
		PreparedStatement pStmt0 = conn.prepareStatement(mailchecksql);
		//sqlの「?」部分に画面に入力された値を流す
		pStmt0.setString(1,ab.getEmail());

		//sqlの実行
		ResultSet rs = pStmt0.executeQuery();

		//selectした結果が返ってきたら、何も処理をしない
		if(rs.next()) {
			return null;
		//selectした結果が0件の場合は登録処理を実行する
		}else {
			//登録処理 パスワード暗号化も実施
			Encryption encryption = new Encryption();
			String sql = "INSERT INTO ACCOUNT1(sei,mei,tel,post,zyuusho1,zyuusho2,banchi,tatemono,email,thutomesaki,username,pass) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pStmt1 = conn.prepareStatement(sql);
			pStmt1.setString(1,ab.getSei());
			pStmt1.setString(2,ab.getMei());
			pStmt1.setString(3,ab.getTel());
			pStmt1.setString(4,ab.getPost());
			pStmt1.setString(5,ab.getZyuusho1());
			pStmt1.setString(6,ab.getZyuusho2());
			pStmt1.setString(7,ab.getBanchi());
			pStmt1.setString(8,ab.getTatemono());
			pStmt1.setString(9,ab.getEmail());
			pStmt1.setString(10,ab.getThutomesaki());
			pStmt1.setString(11,ab.getUsername());
			pStmt1.setString(12,encryption.seacret(ab.getPass()));

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
