package calss11;

public class Largest {

	public static void main(String[] args) {
		// create an array of integers and find largest number 
		
		int [] numbers= {1, 2, 3, 4, 5};
		
		int largest=numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
		}
		System.out.println("The largest number is " +largest);

	}

}
