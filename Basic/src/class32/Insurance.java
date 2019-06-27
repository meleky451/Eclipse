package class32;

public abstract class Insurance {
	
	/*
	 * Create a class Insurance that will have an attribute as insuranceName 
	 * and unimplemented behaviour as getQuote and cancelInsurance. 
	 * Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and 
	 * Class Pet has petType attribute.
	 * Create 3 objects of the sub classes and store them in ArrayList. 
	 * Using 1 reference variable access methods from different classes.
	 * 
	 */
	

	public String InsuranceName;
	
	public Insurance(String InsuranceName) {
		this.InsuranceName=InsuranceName;
	}
	
	public abstract void getQuote();
	public abstract void cancelInsurance();
}
class CarInsurance extends Insurance {
    public String model;

    public CarInsurance(String insuranceName, String model) {
        super(insuranceName);
        this.model=model;
    }
    @Override
    public void getQuote() {
        System.out.println("This is quote for " + InsuranceName + " and " + model);
    }
    @Override
    public void cancelInsurance() {
        System.out.println("We canceled "+ InsuranceName + " and " + model);
    }
}

class HealthInsurance extends Insurance {
    public HealthInsurance(String insuranceName) {
        super(insuranceName);
    }
    @Override
    public void getQuote() {
        System.out.println("This is quote for " + InsuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("We canceled "+ InsuranceName );
    }
}
class PetInsurance extends Insurance {
    public String petType;
    public PetInsurance(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    public void getQuote() {
        System.out.println("This is quote for " + InsuranceName + " and " + petType);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("We canceled "+ InsuranceName + " and " + petType);
    }
}

	

