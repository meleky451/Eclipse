package calss11;

public class Task2 {

	public static void main(String[] args) {
		
		
		String[] array= {"USA", "Russia", "Turkey", "Spain"};
		
		
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i].equals("USA")) {
				System.out.println("Washington DC");
				
			}else if(array[i].equals("Russia")) {
				System.out.println("Moscow");
				
			}else if(array[i].equals("Turkey")) {
				System.out.println("Ankara");
			}else if (array[i].equals("Spain")) {
				System.out.println("Madrit");
				
			}
		
			
		}
		
		String[] country= {"USA", "Italy", "Turkey", "Spain"};
		
		for(String countri:country) {
			
			switch(countri) {
			case "USA":
				System.out.println("Washington DC");
				break;
			case "Italy":
				System.out.println("Roma");
				break;
			case "Turkey":
				System.out.println("Ankara");
				break;
			case "Spain":
				System.out.println("Madrit");
				break;
				
				
			}
			
		}
		
		
		
		
		
		
	}

}