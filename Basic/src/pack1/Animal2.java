package pack1;

public class Animal2 {

	public static void main(String[] args) {
		
		Animal dog=new Animal();
		
		System.out.println("This is dog ");
		
		System.out.println(dog.age);
		System.out.println(dog.name);
		
		dog.name="Joe";
		dog.age=40;
		System.out.println(dog.age);
		System.out.println(dog.name);

		Animal dog2=new Animal();
		
       System.out.println("This is dog2 ");
		
		System.out.println(dog2.age);
		System.out.println(dog2.name);
		
		
		Animal dog3=new Animal();
	    
		System.out.println("This is dog3 ");
		System.out.println(dog3.age);
		System.out.println(dog3.name);
		
		int my_array[]= {-1,1,2,3,4,5,6,7,8,9,10};
		
		int []array= {25,14,56,15,36,57,77,18,29,49};
		System.out.println("Printing the minimum value");
		
		System.out.println(Minimum.minOfValues(my_array));
		System.out.println(Minimum.maxOfValues(array));
		
		Minimum min=new Minimum ();
		min.print();
	}

}
