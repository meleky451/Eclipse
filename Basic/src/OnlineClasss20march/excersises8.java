package OnlineClasss20march;

public class excersises8 {

	public static void main(String[] args) {
		
		int[]numbers= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int[]numbers1= new int [10];
		
		int sum=0;
		
		for(int i=0; i<numbers.length; i++){
		
		//sum=sum + numbers[i];
		sum+= numbers[i];
	}
		
		System.out.println("The sum of all array elements= " + sum);
		
		
		
	}

}
