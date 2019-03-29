package class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		/*Create a grocery list:fruits{}
		 *                      veggies{}
		 *                       dairy{}
		 *Retrieve all values using 2 different loops                       
		 */
		
		
		String[][] groceryList= {
				{"apple", "banana", "orange"},
				{"avacado", "beans", "pepper"},
				{"milk", "yogurt", "egg"}
					
				
				
		};
		for(String[] list:groceryList) {
			
			for(String item:list) {
				
				System.out.println(item);
			}
		

	}

}}
