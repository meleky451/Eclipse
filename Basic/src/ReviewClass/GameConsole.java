package ReviewClass;

public class GameConsole {
	
	String controller;
	int numberOfController;
	String powerSource;
	boolean cd;
	boolean ifTvNeeded;
	
	void ableToPlay() {
		System.out.println("I can play Games");
	}
	
	void readDisk() {
		
		System.out.println("I can read disk");
		
	}
	
	boolean surfWeb() {
		return true;
	}
	
	boolean portable() {
		return false;
	}
	
	
	

}
