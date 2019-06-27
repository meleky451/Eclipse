package class27;

public class TestHuman {

	public static void main(String[] args) {

		
		//Human h1=new Human("Ali", 45);
		
		//h1.speak();
		
		//Tester t1=new Tester("Veli", 50, 1500000);
		//t1.speak();
		//t1.code();
		
		Human h1=new Tester("Veli", 50, 150000);
		
		h1 .speak();
		//h1.code();
		
		System.out.println("-----");
		
		
		Tester t1=(Tester)h1;
		t1.speak();
		t1.code();
		

	}

}
