package class20;

public class Task2 {

	public static void main(String[] args) {
		
		/*Create class student that will have a method getGrade
		 * your method should accept the score of a student and retrun a grade
		 * score>90-A
		 * score>80-B
		 * score>70-C
		 * score>50-D
		 * anything else-F
		 */
	    
		
		Task2 obj=new Task2();
		System.out.println(obj.getGrade(51));

	} char getGrade(int score) {
	
      char grade=0;
	if(score>90) {
	   grade='A';
	}else if(score>80) {
		grade='B';
	}else if(score>70) {
		grade='C';
		
	}else if(score>50) {
		grade='D';
	}else {
		grade='F';
	}
    return grade;
}
}
