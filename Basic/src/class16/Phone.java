package class16;

public class Phone {
	
	boolean camera;
	int GB;
	String make, brand, model;
	
	public static void main(String[]args) {
		
		//
		Phone phone1=new Phone();
	    phone1.model="xsMax";
		phone1.brand="Iphone";
		phone1.camera=true;
		phone1.GB=512;
		
		
		phone1.navigation();
		phone1.camera();
		phone1.memory();
		
		//
		
		Phone phone2=new Phone();
	    phone2.brand="Nokia";
		phone2.model="3310";
		phone2.camera=false;
		phone2.GB=16;
		
		phone2.navigation();
		phone2.memory();
		
		
		// 
		
		Phone phone3=new Phone();
	    phone3.brand="Android";
		phone3.model="Samsung Galaxy note 9";
		phone3.camera=true;
		phone3.GB=128;
		
		phone3.navigation();
		phone3.camera();
		phone3.memory();
		
		
		
		
	}
	
	void navigation() {
		System.out.println(" We can use the navigation in phone " + brand);
	}
	void camera(){
		System.out.println(" We can take the picture with the phone " + brand);
		
	}
	void memory() {
		System.out.println(" We can store data in the phone " + brand);
	}
	
	

}
