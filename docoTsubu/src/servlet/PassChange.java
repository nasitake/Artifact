package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.PassChangeDAO;
import model.User;

/**
 * Servlet implementation class Passchange
 */
@WebServlet("/PassChange")
public class PassChange extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		        //ログインしているか確認するため
				//セッションスコープからユーザー情報を取得
				HttpSession session = request.getSession();
				User loginUser = (User)session.getAttribute("loginUser");

				//ログインしていない場合
				if(loginUser == null) {
					//リダイレクト
					response.sendRedirect("/docoTsubu/");
				}else {
					RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/PassChange.jsp");
					dispatcher.forward(request, response);

				}
					}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			String email = request.getParameter("email");
			String pass = request.getParameter("pass");

			User user = new User();
			user.setEmail(email);
			user.setPass(pass);

			PassChangeDAO dao = new PassChangeDAO();
			User user1 = dao.PasswordChange(user);

			if(user1 != null) {
			HttpSession session = request.getSession();
			session.setAttribute("PassChange", user);
			//フォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/PassChangecomplete.jsp");
			dispatcher.forward(request, response);
			//フォワード
	        }else {
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/PassChangefailure.jsp");
	        dispatcher.forward(request, response);
	}
	}
}
