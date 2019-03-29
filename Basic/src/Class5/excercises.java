package Class5;

import java.util.Scanner;

public class excercises {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter  your height");
		double height=scan.nextDouble();
		
		if(height<5) {
			System.out.println("you are short");
			
		}else if(height==5 || height==6) {
			System.out.println("you are medium");
		}else if(height>=6) {
			System.out.println("you are tall");
		}else {
			System.out.println("Please enter valit height");
		}
		

		
	
		
		
		
		
	}

}
