package Com.Sathya.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginapplication")
public class loginapplication extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step_1  :Read the form data
		 String username = request.getParameter("username");
		 String password = request.getParameter("password");
		 //steo_2 Process the data
		 String Status;
		 if(username.equals("chinnu")&& password.equals("chinnu@123"))
		 {
			 Status   ="LoginSuccessful.....";
		 }
		 else
		 {
			Status    =  "LoginFail...." ;
			 
		 }
		 //step_3 Render the response to client
		 PrintWriter  writer  =response.getWriter();
		 response.setContentType("text/html");
		 writer.println("<html>");
		 writer.println("<h1>Login Status.....</h1>"+Status);
		 writer.println("</html>");

	}

}
