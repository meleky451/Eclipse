package Class17;

public class Greetings {

	public static void main(String[] args) {
		
	 Greetings obj=new Greetings ();
		obj.hello();
		//how to find largest number
		obj.findLargest(20, 10); //calling method FondLargest and passing values
		obj.findLargest(30, 31);
		obj.findLargest(2000, 664674);
		obj.helloInstructor("Asel");
		obj.helloInstructor("Arif");
		
		
		
		}
	void helloInstructor(String name) { //method with 1 parameters
		System.out.println("Hello " + name);
	}
	
	void hello() {//method signature
		System.out.println("Hello");// method body
		
	}
	
	
	void findLargest(int a, int b) {//method with 2 parameters
		
		if(a>b) {
			System.out.println("A is larger than B ");
		}else {
			System.out.println("B is larger than A ");
			
		}
		
	}

}
