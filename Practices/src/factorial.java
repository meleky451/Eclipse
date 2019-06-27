import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number");
		int num=0;
		num=scan.nextInt();
		int result=1;
		
		for(int i=num; i>0; i--) {
			result*=i;
		}
		System.out.println(" the factoriel of " + num+ " is " + result);
		
		
		
		String a = "text";
		
		
	}
	


}
