package class23_2;

import class23.Employee;

public class WaterFallTeam extends Employee{
	
	public static void main(String[]args) {
		
		WaterFallTeam wt=new WaterFallTeam();
		
		wt.salary1=90000;//can access protected values from different package through
		//wt.salary;//default values cannot be access in different package
		
		
		
	}

}
