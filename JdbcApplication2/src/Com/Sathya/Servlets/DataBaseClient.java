package Com.Sathya.Servlets;

import java.sql.*;

public class DataBaseClient {

	public static void main(String[] args) throws SQLException {
		Product1Dao product1Dao = new Product1Dao();
		
		int res1=product1Dao.CreateProduct1Table();
		System.out.println("create table successfully..."+res1);
		//inserting:
		//int res2=product1Dao.save(new Product1(101,"laptop",50000.0));
	//	System.out.println("data is inserted successfully"+res2);
	//	int res3=product1Dao.save(new Product1(102,"mobile",16000.0));
	//	System.out.println("data is inserted successfully"+res3);
	//	int res4=product1Dao.save(new Product1(103,"smart watch",1000.0));
	//	System.out.println("data is inserted successfully"+res4);
		
	}

}
