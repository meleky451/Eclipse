package class33;

import java.util.HashMap;
import java.util.Map;

public class Building {

	public static void main(String[] args) {
		
		Map<Integer, String > building=new HashMap<>();
		
		building.put(1,"Google");
		building.put(2, "Syntax");
		building.put(3, "Amazon");
		building.put(4, "Youtube");
		building.put(5, "Ebay");
		building.put(6, "Facebook");
		building.put(7, "Instigram");
		
		System.out.println(building.size());
		building.replace(4, "youtube");
        System.out.println(building);
		building.remove(7);
		System.out.println(building);
	}

}
