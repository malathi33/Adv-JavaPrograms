package Com.Sathya.Servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.net.aso.p;

public class Product1Dao {
	//CRAETION OF TABLE:
		
			public int CreateProduct1Table() throws SQLException
			{
			//DECLARE THE RESOURCES:
				Connection connection=null;
				Statement statement=null;
				int count=0;
				try { 
			//GET THE CONNECTION:
					connection=DbConnection.createconnection();
			//STATIC QUERY EXECUTION:
				statement=connection.createStatement();
				String q1="create table Product1(proid number,proname varchar2(20),proprice number)";
				 count=statement.executeUpdate(q1);
				
				}
				catch( SQLException e)
				{
					e.printStackTrace();
				}
				finally {
				//before release connection v have the connection present or not
					if(connection!=null)
						connection.close();
					if(statement!=null)
						statement.close();
			}
				return count;
			
			
				
			}
}
			
			
		