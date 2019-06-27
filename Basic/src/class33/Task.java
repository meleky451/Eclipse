package class33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task {

	public static void main(String[] args) {
		
		List<String>aList=new ArrayList<String>();
		
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		System.out.println(aList);
		
		
		
		Set<String>hSet=new HashSet<String>(aList);
		
		System.out.println("collection" +hSet);
		
		
		
		

	}

}
