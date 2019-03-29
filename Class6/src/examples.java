import java.util.Scanner;

public class examples{ 

	public static void main(String[] args) {
		
		
		Scanner scan;
		boolean snow =true;
		boolean rain =true;
		boolean sunny=true;
		int temp;
		String activity = "";
		 scan=new Scanner (System.in);
		  System.out.println("Please enter a temperature");
		  
		  temp=scan.nextInt();
		 
		  if (temp>=40 && temp>=80) {
			  System.out.println("it is raining");
			  rain=scan.nextBoolean();
			  
			  if(rain) {
				  activity="watch movie";
						  
			  }else {
			  }
				  activity="Go hiking";
		}else if(temp>=25 && temp>=40) {
			System.out.println("it is snowing");
			snow=scan.nextBoolean();
			if(snow) {
				activity="snowboarding";
				
			}else {
				activity="Coding";
			}
		  }
			else if(temp>=80) {
				System.out.println("it is sunny");
				sunny=scan.nextBoolean();
				
			if(sunny) {
				System.out.println("beach");
				
			}else {
				System.out.println("more coding");
			}}else {
				
			
				System.out.println("Please enter different temperature");
				activity="Unknown";
			}
			System.out.println("my activity today is" + activity);
		}}
			  
	  
		  
		  
	
	
	
	
	


