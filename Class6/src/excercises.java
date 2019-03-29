import java.util.Scanner;

public class excercises {

	public static void main(String[] args) {
		
		
		Scanner scan;
		String country;
		String Language;
		
		scan=new Scanner (System.in);
		System.out.println("Please enter which country you are from");
		country=scan.nextLine();
		
		switch (country) {
		
		case "USA":
			Language="English";
			break;
		case "Russia":
			Language="Russian";
		    break;
		case "Romania":
			Language="Romanian";
			break;
		case "Italy":
			Language="Italian";
			break;
		case "Turkey":
			Language="Turkish";
			break;
		case "Greece":
			Language="Greek";
			break;
		case "Cuba":
			Language="Spanish";
			break;
		case "Japan":
			Language="Japanese";
			break;
			default:
				Language="Unknown";
				
		}
		System.out.println("Your favorite food is " +Language);
		
		
		
		}
	


	}


