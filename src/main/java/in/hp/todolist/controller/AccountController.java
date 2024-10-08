package in.hp.todolist.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import in.hp.todolist.dao.IAccountDAO;
import in.hp.todolist.dao.impl.AccountDAOImpl;

/**
 * Servlet implementation class AccountController
 */
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IAccountDAO accountDAO = null;
	

    /**
     * Default constructor. 
     */
    public AccountController() {
        accountDAO = new AccountDAOImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
