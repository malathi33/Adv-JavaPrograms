package Com.Satya.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GenerateServlat")
public class GenerateServlat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int a=Integer.parseInt(request.getParameter("start"));
		int b=Integer.parseInt(request.getParameter("end"));
		String operation=request.getParameter("operation");

		
		//step2:-process the data
		
		switch(operation)
		{
		case "even" : for(int i=a;i<=b;i++) {
						if(i%2==0) {
							al.add(i);
						}
						}
		
						break;
						
		case "odd" : for(int i=a;i<=b;i++) {
						if(i%2==0) {
							al.add(i);
						}
						}
						break;

		case "prime" :for(int i=a;i<=b;i++) {
						for(int j=2;j<=i/2;j++)
						{
							if(i%j==0)
							{
								a1.add(i);
							}
						}
						}
			    		break;
		       
		case "Perfect" : ;
				break;
		int temp = 0,rem,fact,sum=0;
		case "Strong" :while(temp>0)
						{
			  			rem=temp%10;
			  			if(rem==0)
			  				fact=1;
			  			else
			  			{
			  				fact=1;
			  				for(int i1=1;i1<=rem;i1++)
			  					fact=fact*i1;
			  			}	
			  			sum=sum+fact;
			  			temp=temp/10;
						}
			   			if(sum==i)
							al.add(i);

			   			break;
			}
	

		//step3:render the responce
	
		response.setContentType("text/html");
		PrintWriter writer =response.getWriter();
		writer.println("<html>");
		writer.println("<body bgcolor=pink>");
		writer.println("<h1>Calculation Result</h1>");
		writer.println("Start Number="+a+"<br><br>");
		writer.println("End Number"+b+"<br><br>");
		writer.println("Operation Type="+operation+"<br><br>");
		writer.println("Result="+al+"<br><br>");
	
		writer.println("</body>");
		writer.println("</html>");
		}
	

	}


