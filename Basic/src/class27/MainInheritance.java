package class27;

public class MainInheritance {
	
	/* I want you to create two classes one called MainInherintence and ChildInherintence
    *
    * in your main class i want you to create 1 method to swap numbers, and another to swap strings
    *
    * and in your child i want you to extend main, and i want you to create the same methods, and paramters, but in the block of code
    * i want you to print "not reversing" for swap numbers, and print 2 "not reversing" swap String
    */
	
	
	void swapNumbers(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a + " " + b );
	}
	
	void swapString (String a, String b) {
		String str=a;
		a=b;
		b=str;
		
		System.out.println(a + " " + b);
	}
	
	
}
