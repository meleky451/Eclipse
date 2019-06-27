package Class14;

public class Task {

	public static void main(String[] args) {
		
		//Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		
		
		
		String str="Butun dunya buna inansa";
		String newsentence=str.replace(" ", "");
		
		System.out.println(newsentence);
		
		/*Create string that should be combination of letters, numbers and special characters.
		 * Find out how many alpha characters are there in the string
		 */
		
		String str1="Bugungunlerden&^$$2.baharmi?";
		
		String replaced=str1.replaceAll("[^a-z0-9]", "");
		System.out.println(replaced.length());
		
		/*You have a String a="Is Saturday! Is it raining! Do we have a
		 * Java Class today?" How would you find out how many sentences are in that String?
		 */
		
		String str2="Is Saturday? Is it raining!? Do we have a Java Class today?";
	
	
		String[] array=str2.split("[?]");
		
		System.out.println(array.length);
	
	
	}
	
	
	

}
