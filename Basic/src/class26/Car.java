package class26;

public class Car {
	
	public void drive() {
		System.out.println("Car drivers");
	}
	public void drive(int speed) {
		System.out.println("Car drives woth speed " +speed);
	}

}
class BMW extends Car{
	public void drive() {
	System.out.println("BMW drivers fast");
		
	}
	
}
class Toyota extends Car{
	public void drive() {
		System.out.println("Toyota  drivers safe");
	}
}
