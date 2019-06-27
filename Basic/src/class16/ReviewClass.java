package class16;

public class ReviewClass {
	
	
    String str="Syntax Technologies";
    String reverse="";

    public static void main(String[] args) {
        /* Create a String method called ReverseString
         *  method return the string you hard coded
         * in reverse order(This is the static way)
         * have the string you will create will say
         *  "seigolonhceT xatnyS"
         */
     ReviewClass obj= new ReviewClass();
     
    	
	 System.out.println(obj.reverseString(obj.str));
	
    }
    
    String reverseString(String word) {
    	
    	for(int i=word.length()-1; i>=0; i--) {
    		reverse +=word.charAt(i);
    		
    	}
    	return reverse;
    	
    }

}
