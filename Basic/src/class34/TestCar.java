package class34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestCar {

	public static void main(String[] args) {
		// Create a map in which we will store the CarNumber and Car itself
		
		Car car1=new Car("Toyota" , "Corolla");
		Car car2=new Car("Honda" , "Accord");
        Car car3=new Car("Lada" , "Priora");

        //car1.printCarDetails();
        //car1.printCarDetails();
        //car1.printCarDetails();
        
        Map<Integer, Car> carMap=new HashMap<>();
        
        carMap.put(1, new Car("BMW", "x8"));
        carMap.put(2, new Car("Audi", "R8"));
        carMap.put(3, new Car("Mercedes" , "cls"));
        
        Collection<Car>carValues=carMap.values();
        for(Car car:carValues) {
        	car.printCarDetails();
        }

	}

}
