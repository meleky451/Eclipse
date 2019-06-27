package Class17;

public class NoMainMethod {
//methods and variables are member of the class
	
	String str;
	int num;
	 
	
	void hello() {
		System.out.println("Hello");
		System.out.println("Hello friendes");
		System.out.println("Hello");
		System.out.println("Hello friends");
	}
	void bye() {
		System.out.println("Bye");
		
	}
	public static void main(String[]args) { //method signature
		
		NoMainMethod obj=new NoMainMethod();//method body
		
		obj.hello(); //we calling a method hello
		obj.bye();
		
	}
	 void howAreYou() {
		 System.out.println("How are you?");
	 }
	
}
