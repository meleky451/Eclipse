package class3;

public class IfElself {

	public static void main(String[] args) {
		
		
		int num1=23;
		int num2=14;
		
		
		if(num1>num2) {
			System.out.println("I am if block");
			System.out.println("I have multiple lines to print");
			System.out.println("Num 1 is larger than num2");
			
		}else {
			System.out.println("I am else block");
		    System.out.println("Num1 is smaller than num2");
			
			
		}
		
		
	     num1=23;
		 num2=23;
		
		if (num1>num2) {
			System.out.println("Num1 is larger than num2");
		}else if(num2==num1) {
			System.out.println("Num1 is equal to num2");
		}else {
			System.out.println("Num1 is smaller than num2");
			
			
		}
		System.out.println("I am done with if condition");		
		
		
	}

}
