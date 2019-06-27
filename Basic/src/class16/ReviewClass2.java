package class16;

public class ReviewClass2 {
	
	 /* create a method that shows you all the vowals in a string
    * output: should only show these characters a,e,i,o,u,A,E,I,O,U,
    * this method can have any string value you put in, but must return
    * all the vowals within the string
    *"hello world my name is wEqas"
    *
    */
	
	public static void main(String[]args) {
		String str="hello world my name is wEqas";
		System.out.println(vowals(str));
		
	}
	static String vowals(String s) {
		
		String vow="";
		char []arry= {'a','e','i','o','u','A','E','I','O','U'};
		
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<arry.length; j++) {
				
				if(s.charAt(i)==arry[j]) {
					vow +=s.charAt(i);
				}
			}
		}
		return vow;
		
	}

}
