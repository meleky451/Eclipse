import java.util.Scanner;

public class tekrar {

	public static void main(String[] args) {
		
     
     
     int temp=0;
     String output;
     
     
     
     if(temp>=100) {
    	 output="It is too hot";
    	 
     }else if(temp>= 50 && temp<=99) {
    	   output="wear summer clothes";
     }else if(temp>=30 && temp <=49) {
    	   output="wear winter clothes";
    	 
     }else if (temp>=10 && temp<=29) {
    	     output="Stay inside it is too cold";
     }else {
    	 output="help it is too cold";
    	 
     }
           
     System.out.println(output);
     
     //Write a program that allows a user to input age to find out if the user is either too young
     
     
     int age;
     Scanner input=new Scanner(System.in);
     System.out.println("How old is person");
        age=input.nextInt();
       
       
     if (!(age<18)) {
    	 System.out.println("too young");
    	 
     }else if(age>=18 && age<=35) {
    	 System.out.println("young person");
     }else if(age==36 || age <=99) {
    	 System.out.println("you are middle age person");
     }else if(age>=100) {
    	 System.out.println("you are too old");
     }
     
     
     
     
	}

}
