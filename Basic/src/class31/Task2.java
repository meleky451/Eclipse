package class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

	public static void main(String[] args) {
		
		//Create an arrayList of words.
		//Remove every word that ends with “e”.
		
		ArrayList<String> words=new ArrayList<String>();
		
		words.add("star");
		words.add("welcome");
		words.add("car");
		
		Iterator<String>iterator=words.iterator();
		
		while(iterator.hasNext()) {
			String word=iterator.next();
			if(word.endsWith("e")){
				iterator.remove();
			}
			
		}
		System.out.println(words);

}
}