package Com.Satya.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

		//This method create the connection and return connection
		public static Connection createconnection()
		{
			Connection connection =null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ammu","967656");
				
			}
			catch (ClassNotFoundException |SQLException e) {
				e.printStackTrace();
			}
			return connection;
			
		
		
	
	}

}
