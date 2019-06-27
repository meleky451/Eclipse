package evexcercises;

public class StringMetodlari {
	public static void main(String[]args) { 
		
		
		//String uzunluk bulma
		
		String str="Butun Dunya buna inansa bir inansa";
		System.out.println(str.length());
		
		System.out.println(str.substring(6,23));
		
		System.out.println(str.indexOf("buna"));
		
		if(str.equalsIgnoreCase("butun dunya buna inansa bir inansa")) {
			
			System.out.println("Ayni deger");
			
			System.out.println(str.toLowerCase());
			System.out.println(str.toUpperCase());
			
			System.out.println(str.trim());
			
			System.out.println(str.charAt(7));
			
			String str2= "12Hello 3234 World 465%^%";
			String replacedNoNumbers=str2.replaceAll("[0-9]", "");
			System.out.println(replacedNoNumbers);
			
			
			String newString=replacedNoNumbers.replaceAll("[^A-Za-z]", "");
			System.out.println(newString);
			
			
		}
		 
		 
		 
	}
	

}
