package ReviewClass;

public class Nintendo  extends GameConsole {

	public static void main(String[] args) {
		
		Nintendo nintendo=new Nintendo();
		
		nintendo.controller="red & blue";
		nintendo.numberOfController=4;
		nintendo.ifTvNeeded=true;
		nintendo.cd=false;
		nintendo.powerSource="outlet";
		
		//------below are attributes------
		
		
		
	
		//------below are behaviors------
		
		System.out.println(nintendo.portable() + " is game system portable ");
		
		System.out.println(nintendo.surfWeb() + " able to surf the web");
		 nintendo.readDisk();
		 nintendo.ableToPlay();
		
		

	}
	
	

}
