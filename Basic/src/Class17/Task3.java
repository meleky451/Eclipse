package Class17;

public class Task3 {

	public static void main(String[] args) {
		// Create a method that will print whether given String is palindrome or not
		palindrome("mama");
		palindrome("hannah");
	
		
	}
	
	static void palindrome(String word) {
		String reverse="";
		for(int i=word.length()-1; i>=0; i--) {
			reverse += word.charAt(i);
		}
		
		if(word.equals(reverse)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
		
	}
	

}
