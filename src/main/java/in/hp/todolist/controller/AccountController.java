package in.hp.todolist.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.hp.todolist.dao.IAccountDAO;
import in.hp.todolist.entities.Account;

import java.io.IOException;

/**
 * Servlet implementation class AccountController
 */
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private IAccountDAO accountDAO = null;
	
	private String msg = null;
	
    /**
     * Default constructor. 
     */
    public AccountController() {

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch(action) {
		case "Create":
			createUser(request, response);
			break;
		}
	}

	private void createUser(HttpServletRequest request, HttpServletResponse response) {
		Account account = new Account();
		account.setUserName(request.getParameter("username"));
		account.setFirstName(request.getParameter("firstname"));
		account.setLastName(request.getParameter("lastname"));
		account.setPassword(request.getParameter("password"));
		
		Boolean result = accountDAO.insertAccount(account);
		
		if(result) {
			msg = "User Created !!!";
		}else {
			msg = "User Creation Failed !!!";
		}
		
		request.setAttribute("msg", msg);
		RequestDispatcher rd = request.getRequestDispatcher("/pages/admin/newAccount.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
