package class16;

import java.util.Scanner;

public class ReviewClassWegas {

	
		
		String eyes;
		String hair;
		String nose;
		String shirt;
		public static void main(String[] args) {
			
			ReviewClassWegas melek=new ReviewClassWegas();
			
			melek.eyes="brown";
			melek.hair="grey";
			melek.nose="brown";
			melek.eyes="blue";
			melek.shirt="yellow";
			
			ReviewClassWegas melek1=new ReviewClassWegas();
			
			melek1.eyes="green";
			
			System.out.println(melek1.eyes);
			
		
		}
		void humanEyes() {
			ReviewClassWegas melek1=new ReviewClassWegas();
			melek1.eyes="blue";
			System.out.println(melek1.eyes);
			
		}
		
		void noReturn() {
			System.out.println("I do not have a return type");
		}
		
		void scannerFirstName() {
			Scanner scan=new Scanner(System.in);
			scan.nextLine();
			
		}
		void scannerInt() {
			Scanner scan=new Scanner(System.in);
			scan.nextInt();

			
		}

}
