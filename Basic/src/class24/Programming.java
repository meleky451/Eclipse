package class24;

public class Programming {
	
	/*Create a class named 'Programming'. While creating an objects of the class,
	 * if nothing is passed to it, then the message "I love programming languages"
	 * the value variable should be printed.
	 * Example, if we pass"Java"
	 * then "I love Java" should be printed.
	 * 
	 * 
	 */
	
	public Programming() {
		System.out.println("I love programming languages");
	}
	
	public Programming(String str) {
		System.out.println("I love " + str);
	}
	public static void main(String[]args) {
		Programming obj=new Programming();
		Programming ob1=new Programming("Java");
	}
}
