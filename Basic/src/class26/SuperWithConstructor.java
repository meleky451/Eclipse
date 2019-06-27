package class26;

public class SuperWithConstructor {
	
	public  SuperWithConstructor () {
		
		System.out.println("I am a parent class constructor ");
	}
	
SuperWithConstructor (String str) {
		
		System.out.println("I am a parent class constructor with 1 parameters");
	}
	


}
class ChildOfSuperWithConstructor extends SuperWithConstructor{
	
	public ChildOfSuperWithConstructor() {
		
		//super();-compiler adds it by default
		
		super("Hello");
		System.out.println("I am a child class constructor");
	}
}
