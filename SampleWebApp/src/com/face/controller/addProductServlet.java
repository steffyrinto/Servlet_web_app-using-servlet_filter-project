package com.face.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.AddBO;
import com.face.dao.AddDAO;
import com.face.dao.MyUtils;
import com.mysql.jdbc.Connection;

/**
 * Servlet implementation class addProductServlet
 */
@WebServlet(urlPatterns = {"/add"})
public class addProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to AddProductServlet");
		RequestDispatcher dispatcher=this.getServletContext().getRequestDispatcher("/WEB-INF/views/add.jsp");
		dispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		int productid=Integer.parseInt(request.getParameter("productid"));
		String productname=request.getParameter("productname");
		
		AddBO abo=new AddBO();
		abo.setProductid(productid);
		abo.setProductname(productname);

		Connection conn = (Connection) MyUtils.getStoredConnection(request);
		try {
			AddDAO.save(conn,abo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		
		
	}

}
