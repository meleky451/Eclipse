package class12;

public class StringManipulations {

	public static void main(String[] args) {
		//Length() function/or method-returns number of character in the String
		
		String str="Syntax";
		
		int length0fString=str.length();
		
		System.out.println(length0fString);
		
		String str1="Syntax Technologies";
		
		int length0f2String=str1.length();
		
		String str2="Welcome, students!";
		System.out.println(str2.length());
		
		//toUpperCase()--> convert all character to UpperCase
		//toLowerCase()--> convert all character to LowerCase
		
		String str3="Hello";
		
		String newString=str3.toUpperCase();
		System.out.println(newString);
		
		String lowerCaseString=newString.toLowerCase();
		System.out.println(lowerCaseString);
		
		//equals()-compares 2 string, if strings are equal->true, else->false
		
		String str4="Hello";
		String str5="hello";		
	 
	boolean equality=str4.equals(str5);
	System.out.println(equality);
	//equalsIgnoreCase()- compares 2 string but ignores case
	
	String expectedBrowser="chrome";
	String actualBrowser="Chrome";
	
	boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
	System.out.println(equals);
	} 
	
	

}