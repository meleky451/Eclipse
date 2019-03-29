package Class8;

public class Sum {

	public static void main(String[] args) {
		 
		int sum=0;
		
		for (int  i=1; i<=5; i++) {
			 
			sum=sum+i;
		}
		System.out.println(sum); //6,5,15,7,1
		
		/*find sum of all even numbers from 1 to 100*/
		
		
		int sum2=0;
		
		for(int b=1; b<=100; b++ ) {
			if(b%2==0) {
				sum2=sum2+b;
				
			}

		}
		System.out.println(sum2);

	}

}
