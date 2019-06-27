package class33;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {

	public static void main(String[] args) {
		
		//Create a map of Best Buy store. 
		//Place item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
		//Print all keys and values from a Best Buy map using EntrySet.
		
		Map<Integer, String> BestBuyStore=new LinkedHashMap<>();
		BestBuyStore.put(7664847,"Printer"); 
		BestBuyStore.put(7879885, "TV etc"); 
		BestBuyStore.put(7878645, "Laptop");
		BestBuyStore.put(7863322, "Coffee machine");
		
         System.out.println(BestBuyStore);
		
		for (Map.Entry<Integer,String> entry:BestBuyStore.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		System.out.println("----------------");
		
		Iterator<Map.Entry <Integer,String>> BestBuy=BestBuyStore.entrySet().iterator();
		while(BestBuy.hasNext()) {
			Map.Entry<Integer, String> me=BestBuy.next();
			System.out.println(me.getKey()+"="+me.getValue());
		}
		}
	}


