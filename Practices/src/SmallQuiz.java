import java.util.Scanner;

public class SmallQuiz {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);

		String answer1;
		boolean answer2;
		String answer3="";	
		int score=0;
	    
		//Q1
		System.out.println("Please type the choice number of your answer");
		System.out.println("1. What is the capital of NewJersey?");
		System.out.println("a:MountLaurel");
		System.out.println("b:Peterson");
		System.out.println("c:Trenton");
		
		answer1=scan.nextLine();
		if (answer1.equalsIgnoreCase("c")) {
			System.out.println("This answer is correct");
			score += 10;
		}else {
			System.out.println("This answer is incorrect");
		}
		//Q2
		System.out.println();
		System.out.println("2.The president of the USA is Obama. true/false");
		answer2=scan.nextBoolean();
		
		if (answer2) {
			System.out.println("Your answer is incorrect");
			
			
		}else {
			System.out.println("Your answer is correct");
			score+=10;
			
		}
		//Q3
		System.out.println();
		
		System.out.println("3. The color of roses is ....... (fill the blank)");
		
		answer3 = scan.next();

		
		if(answer3.equalsIgnoreCase("Red")) {
			System.out.println("Your answer is correct");
			score+=10;
		}else {
			System.out.println("Your answer is incorrect");
		}
		
	
		System.out.println("This is end of you test. Your score is" + score);
		
		
		if(score<=10) {
		System.out.println("failed");
		}else {
			System.out.println("Pass");
		}
	}
}
