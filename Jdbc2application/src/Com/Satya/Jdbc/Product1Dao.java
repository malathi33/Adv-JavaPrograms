package Com.Satya.Jdbc;
import java.sql.*;
public class Product1Dao {
	public int save(Product1 p) throws ClassNotFoundException, SQLException {

	
	//
		//Declare the resources
		
		  Connection connection=null;
		  PreparedStatement preparedStatement=null;
		  int count=0;
		  
		  try {
			  //Get the connection
			  connection =DbConnection.createconnection();
			  
			  //create the Ps Object
			  preparedStatement =connection.prepareStatement("insert into Product1 values(?,?,?)");
			  
			  //read the data from pro object and set to parameters
			  preparedStatement.setInt(1,p.getpId());
			  preparedStatement.setString(2,p.getpName());
			  preparedStatement.setDouble(3,p.getPprice());
			  count=preparedStatement.executeUpdate();
			   
		  }
		  catch(SQLException e) {
			  e.printStackTrace();
			  
		  }
		  finally {
			  //before release connection check the connection present or not
			  if(preparedStatement!=null)
				  preparedStatement.close();
			  if(connection!=null)
				  connection.close();
		  } 
		  return count;
	}
		public Product1 findbyId(int  pId) throws SQLException
	
			{
			 Product1 product1=null;
			 
			  {
				
			
				//try with resources :once the try block is completed the resources automatically closed
				  
				  try(Connection connection= DbConnection.createconnection();
					  PreparedStatement preparedStatement=connection.prepareStatement("select * from product1 where pId=?");)
				  {
					    preparedStatement.setInt(1, pId);
					    ResultSet resultSet =preparedStatement.executeQuery();
					    
					    if(resultSet.next())
					    {
					    	Product1 product =new Product1();
					    	
					    	product.setpId(resultSet.getInt(1));
					    	product.setpName(resultSet.getString(2));
					    	product.setPprice(resultSet.getDouble(3));
					    	
					    }
					}
				
				catch(SQLException e) {
					e.printStackTrace();
					}
				return product1;
			}
	}
}
			
		
	
	


