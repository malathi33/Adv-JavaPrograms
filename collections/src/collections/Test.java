package collections;

public class Test {

	public static void main(String[] args) {
		//constructor injection the values
		Employee employee=new Employee(111,"chinnu",116);
		System.out.println(employee);
		//setter are injection the values
		Employee employee2=new Employee();
		employee2.setEmpId(1001);
		employee2.setEmpName("chinnu");
		employee2.setEmpSalary(116.07);
		System.out.println(employee2.getEmpId()+"   "+employee2.getEmpName() +"  " +employee2.getEmpSalary());
				
		

	}

}
