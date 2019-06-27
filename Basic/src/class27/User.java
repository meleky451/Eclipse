package class27;

public class User {
	
	//Write program: user class  has a constructor that takes name and mobile number. 
	//Extend this class  by userInfo that will have user address variable. 
	//Print users name, mobile number and address in userDetails method. Test your code. 
	
	public String name;
	public long  mobileNumber;
	
	//public User() {
	//}
	
	public User(String name, long mobileNumber){
	
	this.name=name;
	this.mobileNumber=mobileNumber;

  }
}
  class UserInfo extends User {
	  
	  public String address;
	  //public String name;
	  
	  public UserInfo(String name, long mobileNumber, String address) {
		  
		  super(name, mobileNumber);
		  this.address=address;
		  
	 
  }
	  public void userDetails() {
		  System.out.println("User name is " + super.name + "phone number is " + mobileNumber + "address " +address);
	  }

}