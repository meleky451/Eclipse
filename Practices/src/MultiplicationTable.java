import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a number");
		
		int num= scan.nextInt();
		int product;
		
		for(int i=1; i<=10; i++) {
			product=num*i;
			
			System.out.println(num + "x" + i + " = " +product );
			
		}
		
		
		
	
		

	}

}
