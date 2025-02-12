package Com.Satya.Jdbc;

import java.sql.SQLException;
import java.util.List;

public class DataBaseClient {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	EmployeeDao employeeDao =new EmployeeDao();
	
	int res1=employeeDao.save(new Employee (1001,"chinnu",116));
	
	System.out.println("Data inserted Successfully..."+res1);
	
	int res2=employeeDao.save(new Employee (1002,"ammu",1016));
	
	System.out.println("Data inserted successfully..."+res2);
	
	//read the data from Database
	Employee emp = employeeDao.findById(1001);
	
	System.out.println(emp);
	
	Employee emp1 = employeeDao.findById(1002);
	
	System.out.println(emp1);
	//deleted data from database
	
	int   count=employeeDao.deleteById(1002);
	if( count==1)
		System.out.println("data deleted successfully");
	else
		System.out.println("data delete failed");
	//delete by salary
	
   int count1=employeeDao.deleteBySalary(1016);
	System.out.println("Number of records deleted successfully..."+count1);

	//Read the all records
	List<Employee> emps=employeeDao.findAll();
	emps.forEach(e->System.out.print(emp));
	
	//update the salary

	int count2 =employeeDao.updateSalary(116,5000);
	System.out.println(" updated  salary successfully..."+count2 );
	}
}


		
		