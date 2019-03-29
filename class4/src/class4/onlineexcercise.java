package class4;

import java.util.Scanner;

public class onlineexcercise {

	public static void main(String[] args) {
		
		int time=0700;
		if(time<=0700) {
			System.out.println("Good morning");
		}else if (time<=1205){
			System.out.println("Good day");
		}else { 
			System.out.println("Good evening");
		}
		
		boolean summer= true;
		boolean sunny=true;
				if (summer==true) {
					System.out.println("it is summer");
					
				}else {
					System.out.println("It is not summer");
				}
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("what is your name?");
		String name=scan.nextLine();
		System.out.println("What is your gender");
		String gender=scan.nextLine();
		System.out.println("What is your age");
		int age=scan.nextInt();
		System.out.println("What is your phone number");
		long number=scan.nextLong();
		
	}

}
