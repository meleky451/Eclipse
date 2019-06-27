package class23;

public class Employee {
	
	public static String department="ITE";

	 int salary;
	
	protected  int salary1;

	public void getPaid() {

		System.out.println("Employee get's paid " + salary);
	}
	
	public static void work() {
		System.out.println("Employee works in " +department+ " department ");
	}

}
