package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ejb.interfaces.StatelessBean;



/**
 * Servlet implementation class JspServlet
 */
@WebServlet("/JspServlet")
public class JspServlet extends HttpServlet {
		
	private static final long serialVersionUID = 1L;
	
	@EJB(mappedName="java:global/javaee7-ear/javaee7-ejb/StatelessBeanImpl!com.ejb.interfaces.StatelessBean")
	private StatelessBean statelessBean;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JspServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws IOException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @throws IOException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer param = Integer.valueOf(request.getParameter("param"));
		List<Integer> list = new ArrayList<Integer>();
		
		statelessBean.test();
		
		list.add(param);
		list.add(123123);
		request.setAttribute("listOnJsp", list);
		request.setAttribute("message", "Hello Wordl");
		//request.getRequestDispatcher("jstl.jsp").forward(request, response);
		request.getRequestDispatcher("scriptlet.jsp").forward(request, response);
		
		
	}


}
