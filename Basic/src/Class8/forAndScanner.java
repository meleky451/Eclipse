package Class8;

import java.util.Scanner;

public class forAndScanner {

	public static void main(String[] args) {
		
		/*prompt user to enter 2 integers and compare
		 * At the ende print largest
		 */
		
		Scanner myScanner;
		
		int num1, num2;
		int largest=0;
		
		myScanner=new Scanner(System.in);
		
		System.out.println("Please enter first number");
		num1=myScanner.nextInt();
		
		System.out.println("Please enter second number");
		num2=myScanner.nextInt();
		
		for (int i=1; i<=5; i++) {
		
		
		
		if(num1>num2) {
			largest=num1;
			
		}else if(num2>num1) {
			largest=num2;
			
			
		}else {
			System.out.println(num1+ "is equals to" +num2);
		}
		
		System.out.println(largest+ " is the largest ");
		}

	}

}
