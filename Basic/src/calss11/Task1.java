package calss11;

public class Task1 {

	public static void main(String[] args) {
		 
		String [] car=new  String[7];
		
		car [0]="Mercedes";
		car [1]="Toyota";
		car [2]="Nissan";
		car [3]="Audi";
		car [4]="porche";
		car [5]="Bmw";
		car [6]="Kia";
		 
		for(int i=0; i<car.length; i++) {
		System.out.println(car[i]);
		
		}
		
		for(String cars : car) {
			System.out.println(cars+ " ");
		}
		
	}

}