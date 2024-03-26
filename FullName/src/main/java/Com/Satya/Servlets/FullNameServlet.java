package Com.Satya.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//
@WebServlet("/FullNameServlet")
public class FullNameServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname = request.getParameter("firstname");
		String middlename = request.getParameter("middlename");
		String lastname = request.getParameter("lastname");
		
		
		String status;
		if(firstname.equals("Vallepu")&& middlename.equals("Venkata")&&lastname.equals("Suneel"))
				{
			      status=firstname+" "+middlename+" "+lastname;
				}
		else
		{
			status    ="Not Valid";
		}
		PrintWriter   writer  =response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		
		writer.println("<hl>FullName is </h1> "+status);
		writer.println("</html>");
		



}

	}


