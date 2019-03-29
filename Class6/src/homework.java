import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		
		
		double num1, num2, num3;
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter 3 distinct double values");
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		num3=scan.nextDouble();
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1+ "is the largest");
			
		}else if (num2>num1 && num2>num3) {
			System.out.println(num2+ "is the largest");
			
		}
		else if (num3>num1 && num3>num2) {
			System.out.println(num3+ "is the largest");
		}
		
		

	}

}
