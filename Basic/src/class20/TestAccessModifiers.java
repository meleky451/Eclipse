package class20;

public class TestAccessModifiers {

	public static void main(String[] args) {
		
		Task3 obj= new Task3();
		
		obj.isPalindrome("madam");//access public method
		obj.reverseString("hello");//accessing protected method
		//obj.sayHello();//accesing default method
		//obj.getWordsFromString("Hello Student"); //private method is not accessible

		
		//System.out.println(obj.name1); //accesing default variable
	}

}
