package class7;

import java.util.Scanner;

public class ScannerAndloop {

	public static void main(String[] args) {
		
		/*Prompt user to ask the name 3 times and print "You are doing great______"*/
		
		
		Scanner scan;
		String name;
		
		scan=new Scanner(System.in); 
		int a=1;
		
		
		
		while(a <=3 ) {
			System.out.println("Please enter your name");
			name=scan.nextLine();
			
			System.out.println("You are doing great " + name);
			
			a++;
		}
		
		 
	}

}
