package calss11;

public class Recap {

	public static void main(String[] args) {
		//let's create an array of names thats will hold 5 elements and retrieve all values from it

		
		String[]names=new String[5];
		
		names [0]="Asel";
		names [1]="Awet";
		names [2]="Arif";
		names [3]="Wegas";
		names [4]="Dzmitri";
		//names [5]="Shiva"; will get an runtime exception when trying to access it
		
		
		for( int i=0; i<=4; i++) {
			System.out.println(names[i]);
		}
	
	

	
	
	
	}
	

}
