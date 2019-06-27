package class22;

public class StaticVsNonStatic {

	
		
		public String name="John";//instance variable
		public static String lastName="Snow";
		
		public static void main(String[] args) {
			
			StaticVsNonStatic obj=new StaticVsNonStatic();
			
			obj.getInfo();
			
			getInfo1();//within same class we can call it by using method/variable name
			
			System.out.println(lastName);
			
		
	}
		//non static method -can access both instance static variables
		public void getInfo() {
			System.out.println("My name is "+name+" and my last name is " +lastName);
		}
		
		//static method can have an acess only to static variables
		public static void getInfo1() {
			//System.out.println("My name is "+name+" and my last name is " +lastName);
			//will get an error
			System.out.println("I am a static method");
		}

}
