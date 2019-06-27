package class27;

public class ChildInheritance extends MainInheritance  {
	
	void swapNumbers(int a, int b) {
		
		
		System.out.println("not reversing" );
	}
	
	void swapString (String a, String b) {
		
		
		System.out.println("not reversing");
	}
	
	void parentNumbers(int a, int b) {
		super.swapNumbers(a, b);
	}
	
	void parentString(String a, String b) {
		super.swapString(a, b);
	}
		

	public static void main(String[] args) {
		ChildInheritance child=new ChildInheritance();
	    child.parentNumbers(5, 6);
	    child.parentString("Shaban", "Haq");
	    child.swapNumbers(7, 99);

	}

}
