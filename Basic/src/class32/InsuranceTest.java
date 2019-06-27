package class32;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {
		
		Insurance obj=new CarInsurance("Geico", "Toyota");
		Insurance obj2=new PetInsurance("Progressive", "Dog");
		Insurance obj3=new HealthInsurance("Kaiser");
		
		ArrayList<Insurance> insList=new ArrayList<>();
		insList.add(obj);
		insList.add(obj2);
		insList.add(obj3);
		//for loop
		for (int i=0; i<insList.size(); i++) {
			System.out.println(insList.get(i).InsuranceName);
		}
		//advance for loop
		for(Insurance ins:insList) {
			ins.getQuote();
		}
		//iterator
		Iterator<Insurance> it=insList.iterator();
		while(it.hasNext()) {
			it.next().cancelInsurance();
		}
		

	}

}
