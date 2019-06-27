package class33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {

		// Create a map of countries with its capital.
		// Print all keys and values from a country map using for each loop and
		// iterator.
		// Print all values from a country map using for each loop and iterator.

		Map<String, String> map = new HashMap<>();
		map.put("Ankara", "Turkey");
		map.put("Washington", "USA");
		map.put("Roma", "Italy");
		map.put("Paris", "France");

		System.out.println(map);

		Set<String> keys = map.keySet();
		System.out.println("-------");

		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		System.out.println("---------");
		Iterator<String> keysIt = keys.iterator();
		while (keysIt.hasNext()) {
			String key = keysIt.next();
			System.out.println(key + ":" + map.get(key));
			

		}
		System.out.println("-------");
		Collection <String > valCol=map.values();
		
		for (String value: valCol) {
			System.out.print(value+", ");
			
	}
		System.out.println("-------");
		Iterator<String> itValues=valCol.iterator();
		while(itValues.hasNext()) {
			System.out.println("");
			System.out.print(itValues.next()+", ");
		}
}}