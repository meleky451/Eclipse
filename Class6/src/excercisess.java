import java.util.Scanner;

public class excercisess {

	public static void main(String[] args) {
		
		Scanner scan;
		char grade;
		String gradeLevel;
		
		
		scan = new Scanner(System.in);
		System.out.println("What is your Grade?");
		
		grade=scan.next().charAt(0);
		
		
		switch (grade) {
		
		
		
		case 'A':
			gradeLevel="Excellent";
			break;
		case 'B':
			gradeLevel="Good";
			break;
		case 'C':
			gradeLevel="Average";
				break;
		case 'D':
			gradeLevel="Bad";
			break;
			default:
				gradeLevel="Not Grade";
				
				System.out.println("Your Grade is " +gradeLevel+ "and it is " + gradeLevel);
				
		}
		
	}

}
