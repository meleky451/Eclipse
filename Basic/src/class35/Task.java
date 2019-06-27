package class35;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// How would handle Input MismatchException?
		//Input Mismatch Exception when user enters mismatch value then programmer expected.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter number");
		try {
		int a=scan.nextInt();
		}catch (Exception e) {
			System.out.println("Please be careful");
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Hersey bitti");
	}

}
