package Com.Satya.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Thirdservlet")
public class Thirdservlet extends HttpServlet {
	    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer =response.getWriter();
		HttpSession session=request.getSession(false);
		writer.println ("<html>");
		writer.println ("<body>");
		writer.println ("<pre>");
		writer.println ("username..."+session.getAttribute("username"));
		writer.println ("age..."+session.getAttribute("age"));
		writer.println ("Qualification..."+session.getAttribute("Qualification"));
		writer.println ("Designation..."+session.getAttribute("Designation"));
		writer.println ("userEmail..."+session.getAttribute("userEmail"));
		writer.println ("userMobil..."+session.getAttribute("userMobil"));
		writer.println ("</pre>");
		writer.println ("</body>");
		
		writer.println ("</html>");
		
	}

}
