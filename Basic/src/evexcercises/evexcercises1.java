package evexcercises;

public class evexcercises1 {

	public static void main(String[] args) {
		char[] str= {'m', 'e', 'r', 'h', 'a', 'b', 'a'};
		String str2=new String(str);
		System.out.println(str);

		
		
		String str1="Merhaba";
		String str3="Dunya";
		
		String str5=str1.concat(str3);
		System.out.println(str5 );
		
		String str6=str1+str3;
		System.out.println(str6);
		
		String ornek=" merhaba dunya";
		System.out.println(ornek.replace("merhaba", "elveda"));
		
		
		String str7= "12Hello 3234 World 465%^%";
		String replaced=str7.replaceAll("[0-9]", "");
		System.out.println(replaced);
		
	}

}
