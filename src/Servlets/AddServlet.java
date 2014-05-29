package Servlets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Business.Wiki;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Date currentDate;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession();
		synchronized (session) {
			Wiki wiki = Wiki.Initialize();
			String newArticle = request.getParameter("addArticle");
			wiki.getArticles().add(newArticle);
			String author = request.getParameter("name");
			wiki.getAuthors().add(author);
			currentDate = new Date();
			wiki.getDates().add(currentDate.toString());
			session.setAttribute("Articles", wiki.getArticles());
			wiki.setMap(newArticle, author);
			// Cookie cookie = new Cookie(newArticle, author);
			// response.addCookie(cookie);

			response.sendRedirect("Welcome.jsp");
		}
	}

}
