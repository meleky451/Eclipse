package class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {

	public static void main(String[] args) {
		// Create an arrayList of even numbers from 1 to 50. 
		//Using Integer remove any number that is divisible by 5 from that arrayList.

		ArrayList<Integer> numbers=new ArrayList<Integer>();
		
		

	    for(int i=1; i<=50; i++){
	    	if(i%2==0)
	        numbers.add(i);
	    }
	    
	    
	    Iterator<Integer> iterator=numbers.iterator();
	    while(iterator.hasNext()) {
	        int number=iterator.next();
	        if(number%5==0) {
	            iterator.remove();
	        }
	    }
	    System.out.println(numbers);
	}

	}

