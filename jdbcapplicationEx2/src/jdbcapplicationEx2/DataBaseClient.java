package jdbcapplicationEx2;

import java.sql.*;
import java.util.List;

public class DataBaseClient {

	public static void main(String[] args) throws SQLException {
		 ProductDao productDao =new ProductDao();
		
			/*int res1=productDao.createproductTable();
			System.out.println("Table created sucessfully"+res1);*/
			//inserting data 
		/*	int res2=productDao.save(new Product(1001,"TV",30000));
			System.out.println("Data inserted Sucessfully...."+res2);
			
			int res3=productDao.save(new Product(1002,"Refri",12000));
			System.out.println("Data inserted Sucessfully...."+res3);

			int res4=productDao.save(new Product(1003,"Washing",30000));
			System.out.println("Data inserted Sucessfully...."+res4);
			
			int res5=productDao.save(new Product(1003,"sofa",300));
			System.out.println("Data inserted Sucessfully...."+res5);
			
			int res6=productDao.save(new Product(1003,"dricleaner",25000));
			System.out.println("Data inserted Sucessfully...."+res6);*/
			//finding details through id
		/*	Product pro=productDao.getProductById(1001);
			System.out.println(pro);
			// product details
			 List<Product> pl=productDao.getAllProducts();
			 pl.forEach(p -> System.out.println(p));*/

			 //price updating
//			 int count2=productDao.updateByPrice(30000, 5000);
//			 System.out.println("Data updated successfully"+ count2);

	 //delete by id
//			 int count3=productDao.deleteById(1001);
//			 System.out.println("Data deleted successfully"+count3);

//			 int count4=productDao.deleteByprice(3000.50);
//			 System.out.println("price deleted successfully"+count4);

//			 int count5=productDao.dropTable();
//			 System.out.println("Table dropped successfully"+count5);


			
	}
}
			