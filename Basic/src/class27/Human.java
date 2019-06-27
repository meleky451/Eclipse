package class27;

public class Human {
	
	String name;
	int age;
	
	Human(){
		
	}
	
	Human(String name, int b){
		this.name=name;
		age=b;
	}
	
	void speak() {
		System.out.println("My name is " + name);
		
		
	
	}
}

class Tester extends Human{
	int salary;
	
	Tester(String name, int age, int salary){
		super(name, age);
		this.salary=salary;
	}
	
	void code() {
		System.out.println("I am coding");
	}
}
	
	
