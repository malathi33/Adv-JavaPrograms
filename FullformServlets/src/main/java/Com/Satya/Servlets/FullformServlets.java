package Com.Satya.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FullformServlets")
public class FullformServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		String firstform = request.getParameter("firstform");
    		String middleform = request.getParameter("middleform");
    		String lastform = request.getParameter("lastform");
    		String Fullform;
    		Fullform=firstform+"   "+middleform+"    "+lastform;
    		String Status;
    		if(firstform.equals("vallepu")&& middleform.equals("venkata")&&lastform.equals("suneel"))
    				{
    			      Status   ="Fullform Enter....";
    				}
    		else
    		{
    			Status    ="Fullform not Enter";
    		}
    		PrintWriter   writer  =response.getWriter();
    		response.setContentType("text/html");
    		writer.println("<html>");
    		writer.println("<hl>Fullform is </h1>"+Fullform);
    		writer.println("</html>");
    		



	}

}
