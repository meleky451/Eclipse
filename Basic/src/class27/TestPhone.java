package class27;

public class TestPhone {

	public static void main(String[] args) {
		
		//Phone.obj=new Phone(); cannot instantiate Phone class,
		//because it is abstract class
		
		Phone phone1=new iPhone();
		phone1.makeCall();
		phone1.sendText();
		phone1.unlockPhone();
		phone1.viewPictures();
		
		Phone phone2=new Samsung();
		
		phone2.makeCall();
		phone2.sendText();
		phone2.unlockPhone();
		phone2.viewPictures();

	}

}
