package Com.Satya.Servlets;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.PrimitiveIterator;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/chinnu")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter  writer = response.getWriter();
		response.setContentType("text/html");
		writer.println("<htm>l");
		writer.println("<h1>Wlcome to satya technologies<h1>");
		writer.println("<h2>Welcome to java clasess<h2>");
		writer.println("<h3>welcome to Ratan sir clasess<h3>");
		
		writer.println("</html>");
	}
}
