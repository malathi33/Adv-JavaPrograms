package Com.Satya.Servlet;

import java.io.IOException;
import java.text.Normalizer.Form;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Secondservlet")
public class Secondservlet extends HttpServlet {
	
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the client data
		
		String Qualification=request.getParameter("Qualification");
		String Designation=request.getParameter("Designation");
		 
		//insert the session
		HttpSession session=request.getSession(false);
		 
		//place the data
		session.setAttribute("Qualification", Qualification);
		session.setAttribute("Designation",Designation );
		
		//request the dispatcher
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("Form3.html");
		
		dispatcher.forward(request, response);
	}

}
