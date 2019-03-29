package Class5;

public class NestefIfPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * check if user has credit card-->
		 * check what is the balance is balance is more than 1000-->pay off
		 * else "you are good"
		 * 
		 */
   
		boolean creditCard=true;
		int balance=1000;
		
		if (creditCard) {
			System.out.println("Lest's check the balance");
			if(balance>=1000) {
				System.out.println("pay off now");
			}else {
				System.out.println("you are good");
			}
			
		}else {
			System.out.println("Do you want a credit card");
		}
	}

}
