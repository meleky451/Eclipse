import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		double height;
		double weight;
		
		System.out.println("Please enter your weight in kilos");
		weight=scan.nextDouble();
		
		System.out.println("Please enter your height in meters");
		height=scan.nextDouble();
		
		double bmi;
		bmi=weight/height;
		
		System.out.println("Your body mass index is " + bmi);
		
		
		
		
		//18.5 > underweight
		//18.5-25 normal
		//25-30 overweight
		//30< obese
		
		if( bmi<=18.25) {
			System.out.println("underweight");
			
		}else if(bmi>18.5 && bmi<=25) {
			System.out.println("normal");
			
		}else if(bmi>25 && bmi<=30) {
			System.out.println("over weight");
		
		}else {
			System.out.println("obese");
		}
		
		
		
		
	}

}
