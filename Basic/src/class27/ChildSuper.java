package class27;

public class ChildSuper extends MainSuper {
	
	ChildSuper(String a){
		
		super(a);
		
		System.out.println("this is from child with 1 paramater");
	}
	
	ChildSuper(String a, String b){
		
		super(a,b);
		
		System.out.println("this is from child with 2 paramater");
	}
	public static void main (String []args) {
		
		ChildSuper obj=new ChildSuper("Melek");
		
		ChildSuper obj1=new ChildSuper("Ayse", "Fatma");
	
	

	}
}
