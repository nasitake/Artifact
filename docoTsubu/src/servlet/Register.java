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
import model.Encryption;
import model.User;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		request.setCharacterEncoding("UTF-8");
		String sei = request.getParameter("sei");
		String mei = request.getParameter("mei");
		String tel = request.getParameter("tel");
		String post = request.getParameter("post");
		String zyuusho1 = request.getParameter("zyuusho1");
		String zyuusho2 = request.getParameter("zyuusho2");
		String banchi = request.getParameter("banchi");
		String tatemono = request.getParameter("tatemono");
		String email = request.getParameter("email");
		String thutomesaki = request.getParameter("thutomesaki");
		String username =request.getParameter("username");
		String pass = request.getParameter("pass");

		Encryption encryption = new Encryption();
		User user = new User();

		user.setSei(sei);
		user.setMei(mei);
		user.setTel(tel);
		user.setPost(post);
		user.setZyuusho1(zyuusho1);
		user.setZyuusho2(zyuusho2);
		user.setBanchi(banchi);
		user.setTatemono(tatemono);
		user.setEmail(email);
		user.setThutomesaki(thutomesaki);
		user.setUsername(username);
		user.setPass(pass);



		RegisterDAO dao = new RegisterDAO();
		User user1 =dao.AccountRegister(user);

		//登録成功時の処理
		if(user1 != null) {
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
