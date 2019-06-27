package class30;

import java.util.ArrayList;

public class Task {

	public static void main(String[] args) {
		
		ArrayList <String> name=new ArrayList<String>();
		
		name.add("Melek");
		name.add("Asya");
		name.add("Emin");
		name.add("Yigit");
		name.add("Ayse");
		//name.add(123);not valied since we have generic arraylist of a type of String
		
		System.out.println(name.isEmpty());
		System.out.println(name.contains("Melek"));
		System.out.println(name.size());

		System.out.println("--------");
		for(String nm:name) {
			System.out.println(nm);
		}
	}

}
