package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.RegisterDAO;
import model.User;

/**
 * Servlet implementation class Registergamen
 */
@WebServlet("/Registergamen")
public class Registergamen extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registergamen() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/Register.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//受け取る前に文字コードを指定する
		request.setCharacterEncoding("UTF-8");
		//画面に入力された情報(リクエストパラメータ)を取得
		String name = request.getParameter("username");
		String mail = request.getParameter("email");
		String pass = request.getParameter("pass");

		//登録情報DTOのインスタンス生成
		User user = new User();

		//画面に入力された情報をセットする
		user.setUsername(name);
		user.setEmail(mail);
		user.setPass(pass);

		//登録用のDAOのインスタンスを生成
		RegisterDAO dao = new RegisterDAO();

		//ログイン情報を登録するメソッドの呼び出し
		dao.AccountRegister(user);

		//登録成功時の処理
		if(user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("RegisterUser", user);

			//フォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/Registercomplete.jsp");
			dispatcher.forward(request, response);
		}else{
			//フォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/Registerfailure.jsp");
			dispatcher.forward(request, response);

		}
	}

}
