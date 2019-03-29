package class12;

public class StringManipulations2 {

	public static void main(String[] args) {
		
		//contains->checks for specific value in the string
		//if value is present-->true, else-->false
		
		
		
		String str="Good morning students!";
		boolean contains=str.contains("Morning");
		System.out.println(contains);
	 
	String present="Welcome,Asel";
	String needValue="Welcome,";
	
	
	boolean flag=present.contains(needValue);
	System.out.println(flag);
			
	
	boolean flag1=present.toUpperCase().contains(needValue);
	System.out.println(flag1);
	//startsWith(), endsWith(),-->will return true if String starts/ends with
	//else-->false
	String str1="syntax";
	
	boolean starts=str1.startsWith("s");
	System.out.println(starts);
	
	System.out.println(str1.endsWith("X"));
	
	//
	System.out.println("----isEmpty()-----");
	String str2="";
	boolean isEmpty=str2.isEmpty();
	System.out.println(isEmpty);
			
	
	
	}
	
	
	

}
