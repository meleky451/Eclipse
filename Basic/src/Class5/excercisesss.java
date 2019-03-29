package Class5;

import java.util.Scanner;

public class excercisesss {

	public static void main(String[] args) {
		
		/*
		 * Write a Java program to ask user enter daily sales amount
		 * Based on the sakes range commission will be different;
		 * Example: sales is <100==> commission=2
		 * sales more than 100 and less than 200=5
		 */
		
		Scanner scan;
		int sales;
		int commission;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter sales amount");
		sales=scan.nextInt();
		
		if(sales>0 && sales<100) {
			commission=2;
		}else if(sales>=100 && sales<200) {
				commission=5; 
		}else if(sales>=200 && sales<500) {
			commission=10;
		}else if (sales>=500) {
			commission=20;
		}else {
			commission=0;
		
		}
		System.out.println("Your commission is " +commission);
		
	}

}
