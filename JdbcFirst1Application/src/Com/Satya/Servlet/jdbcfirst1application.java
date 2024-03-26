package Com.Satya.Servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcfirst1application {

	private static final String Connection = null;

	public static void main(String[] args)throws ClassNotFoundException,  SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded Successfully");
	
//stap: 2 create the connection
	Connection  Connectin=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:XE","ammu","967656");
	  System.out.println("Connection  Created Successfully");
	  
	}
	
}
