package calss11;

public class excercises {

	public static void main(String[] args) {
		
		
		//2. create an array using array literal
		
				String[] studentNames= {"Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank" };
				
				for (int i=0; i<studentNames.length -1; i++) {
					System.out.println(studentNames[i]);
					
				}
				//retrieve values using : advanced for loop. for each loop, enhanced for loop 
				
				for(String student:studentNames) {
					System.out.println(student);
				}

	}

}
