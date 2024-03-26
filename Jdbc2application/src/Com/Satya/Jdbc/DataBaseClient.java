package Com.Satya.Jdbc;

import java.sql.SQLException;

public class DataBaseClient {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		 Product1Dao product1Dao =new Product1Dao();
		
		//int res1=product1Dao .save(new Product1 (1001,"Tv",333));
		
	//	System.out.println("Data inserted Successfully..."+res1);
		
	//	int res2=product1Dao .save(new Product1 (1002,"Ac",999));
		
	//	System.out.println("Data inserted Successfully..."+res2);
		
	
		Product1 res3=product1Dao.findbyId(1001);
		System.out.println(res3);
		
		//Product1 res4=product1Dao.findbyId(1002);
	//	System.out.println(res4);


	}

}
