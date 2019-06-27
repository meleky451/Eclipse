package class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {

	public static void main(String[] args) {
		// Create an arrayList of drinks. 
		//If any drink has letter “a” or “e” replace it with water.
    
		ArrayList<String> drink=new ArrayList<String>();
		
		drink.add("pop");
		drink.add("milkshake");
		drink.add("cola");
		
Iterator<String>iterator=drink.iterator();
		
		while(iterator.hasNext()) {
			String drinks=iterator.next();
			if(drinks.contains("e") || drinks.contains("a")){
				iterator.remove();
			}
				
			}
		System.out.println(drink);
	}

}
