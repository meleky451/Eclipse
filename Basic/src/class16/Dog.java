package class16;

public class Dog {
	
	String breed, color, size;
	int  age;

	
	
	public static void main(String[]args) {
		
		
		Dog dog1=new Dog();
		dog1.breed="Bulidog";
		dog1.color="light gray";
		dog1.size="large";
		dog1.age=5;
		
		 dog1.eat();
		 dog1.plays();
		 dog1.barks();
		
		
		
		Dog dog2=new Dog();
		dog2.breed="Beagle";
		dog2.color="orange";
		dog2.size="large";
		dog2.age=6;
		
		 dog2.eat();
		 dog2.plays();
		 dog2.barks();
		
		
		Dog dog3=new Dog();
		
		dog3.breed="Germen Shepherd";
		dog3.color="white & orange";
		dog3.size="large";
		dog3.age=6;
		
		 dog3.eat();
		 dog3.plays();
		 dog3.barks();
		
		
		
		
		
	}
	void eat() {
		System.out.println("We can eat " +breed);
	}
	void plays() {
		System.out.println("We can plays " +breed);
	}
	void barks() {
		System.out.println("We can barks " +breed);
	}
	
	

}
