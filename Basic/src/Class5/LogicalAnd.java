package Class5;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Ask user to enter age and based on the age we will pint:
		 * if age is older than 1 but less then 3--> baby
		 * if age is older than 3 but less then 5-->toddler
		 * if age is older than 5 but less then 12-->kid
		 * if age is older than 12 but less then 20-->teenager
		 * if age is older than 20 but less then 64-->adult
		 * if age is older or equal to 64-->senior
		 * 
		 */
		
		Scanner myScanner;
		int age;
		myScanner=new Scanner(System.in);
		System.out.println("Please enter your age");
		age = myScanner.nextInt();
		
		if (age>=1 && age<3) {
			System.out.println("you are a baby");
			
		}else if (age>=3 && age<5) {
			System.out.println("you are a toodler");
			
		}else if (age>=5 && age<13) {
			System.out.println("you are a kid");
			
		}else if (age>=13 && age<20) {
			System.out.println("you are a tennager");
			
		}
		else if (age>=20 && age <64) {
			System.out.println("you are a adult");
			
		}else {
			System.out.println("you are a senior");
		}
	}

}
