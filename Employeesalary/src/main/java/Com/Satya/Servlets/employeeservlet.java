package Com.Satya.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmployeeServlet")
public class employeeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the request data
		int employeeId =Integer.parseInt(request.getParameter("employeeId"));
		String employeeName=request.getParameter("employeeName");
		double employeeBasicsalary=Double.parseDouble(request.getParameter("employeeBasicsalary"));
		
		
		//process the data
		double HRA,DA,PF,Gross_Salary;
		if(employeeBasicsalary>=50000)
		{
			HRA=0.30*employeeBasicsalary;
			DA=0.10*employeeBasicsalary;
			PF=0.06*employeeBasicsalary;
			
		}
		else if(employeeBasicsalary <50000  && employeeBasicsalary >25000 )
		{
		
			HRA=0.20*employeeBasicsalary;
			DA=0.05*employeeBasicsalary;
			PF=0.03*employeeBasicsalary;
		}
		else
		{
			HRA=0.10*employeeBasicsalary;
			DA=0.03*employeeBasicsalary;
			PF=0.02*employeeBasicsalary;
		}
		Gross_Salary=employeeBasicsalary+HRA+DA+PF;
		
		
		//render the responce
		response.setContentType("text/html");
	     PrintWriter writer=response.getWriter();	    
	     writer.println("<html>");
	     writer.println("<body bgcolor=pink>");
	     writer.println("<h1>Employee Salary Application</h1>");
	     writer.println("EmployeeId="+employeeId+"<br><br>");
	     writer.println("EmployeeName="+employeeName+"<br><br>");
	     writer.println(" employeeBasicsalary="+ employeeBasicsalary+"<br><br>");
	     writer.println("HRA Amount="+HRA+"<br><br>");
	     writer.println("DA Amount="+DA+"<br><br>"); 
	     writer.println("PF Amount="+PF+"<br><br>");
	     writer.println("Gross_Salary="+Gross_Salary+"<br><br>");
	     writer.println("</body>");
	     writer.println("</html>");
	     
	}
}
		


