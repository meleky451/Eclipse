package class9;

public class Nestedsloop {

	public static void main(String[] args) {
		 
		
		for (int a=0; a<4; a++) {
			for(int b=0; b<5; b++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
			
			for (int i=0; i<5; i++) {
				
				for (int c=5; c>0; c-- ) {
					System.out.print(c);
				}
					System.out.println();
				
			
		}
			
			for ( int d=1; d<=5; d++) {
				
				for( int e=1; e<=d; e++) {
					System.out.print("*");
				}
				System.out.println();
				
				
			}
			for (int m=1; m<=4; m++) {
				
				for(int n=1; n<=6; n++) {
					
					if(m == 1 || m == 4 || n == 1 || n == 6) {
					
					System.out.print("*");
					}else {
						System.out.print(" ");
					}
				
				}
				System.out.println();
			}
			
			
	}

}