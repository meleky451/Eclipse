package ReviewClass;



public class Parent {
	
	String name;
	int num;
	boolean day;

	
	public Parent() {
		
		name="Melek";
		num=5;
		day=false;
		
		System.out.println("This is  Constractor");
	}
	public static void main(String[]args) {
		Parent parent=new Parent();
		System.out.println(parent.name + " " + parent.num + " " + parent.day );
				

}}
