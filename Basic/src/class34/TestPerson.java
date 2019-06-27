package class34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestPerson {

	public static void main(String[] args) {
		
		 Map<Integer, Person> personMap=new HashMap<>();
	        
	        personMap.put(1, new Person("Jones", "Oliver", 18, 25000));
	        personMap.put(2, new Person("Taylor", "Damian", 22, 35000));
	        personMap.put(3, new Person("Browns" , "Smith",36, 56000));
	        
	        Collection<Person>personValues=personMap.values();
	        for( Person person:personValues) {
	        	person.PersonDetails();
		
	}

}
}