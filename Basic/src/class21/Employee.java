package class21;

public class Employee {
	
	 int eID;
	 int salary;
	 static String CEO;
	
	
	
	

	public static void main(String[] args) {
		
		Employee obj=new Employee();
		obj.eID=45;
		obj.salary=4000;
		obj.CEO="Sumair";
		
		Employee obj1=new Employee();
		obj1.eID=47;
		obj1.salary=3000;
		obj1.CEO="Sumair";
		
		obj.InfoOfEmployees();
		obj1.InfoOfEmployees();
		
		
		
		
		

	}
	void InfoOfEmployees() {
		System.out.println(eID +" "  + salary +" " +  CEO );
		
	}
}
