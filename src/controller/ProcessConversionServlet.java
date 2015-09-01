package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bpi.forex.model.ForexBean;
import bpi.forex.utility.Factory;


@WebServlet("/ProcessConversionServlet")
public class ProcessConversionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				//step 2 - use servlet to handle requests
				double phpAmount = Double.parseDouble(request.getParameter("phpAmount"));
				String currencyType = request.getParameter("currencyType");
				
				//step 3 populate the bean
				Item item = Factory.getInstance(phpAmount, currencyType);
				
				//step 4 - store the bean in the request (or session or ServletContext)
				request.setAttribute("myForexBean", forex);
				
				//step 5 - forward the request to a JSP page
				RequestDispatcher dispatcher = request.getRequestDispatcher("displayvalues.jsp");
				dispatcher.forward(request,  response);
	}

}
