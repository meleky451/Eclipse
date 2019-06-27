package class27;



public class Student {
	
	//Write program as a student class   that has instance variables name and address. 
	//Create a constructor that will initialize those variables. 
	//Print name & address of given  student by the displayInfo method.
	
	

	String name;
	String address;
	
	
	
	public Student(String name, String address) {
		
		this.name=name;
		this.address=address;
		
	}
	public  void details() {
		System.out.println("Student  name is " + name + " and address " +address);
	}
	
	public static void main(String[]args) {
		Student obj=new Student("John", "17 ballinger way");
		obj.details();
	}
	

}



