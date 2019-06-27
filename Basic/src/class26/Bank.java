package class26;

public class Bank {
	
	public int getBalance() {
		//System.out.println("");
		return 0;
		
	}

}

class BankA extends Bank{
	
	public int getBalance() {
		//System.out.println("money depsited $1000");
		return 1000;
		
	}
	
}
class BankB extends Bank{
	public int getBalance() {
		//System.out.println("money depsited $1500");
		return 1500;
		
	}
}
class BankC extends Bank{
	public int getBalance() {
		//System.out.println("money depsited $2000");
		return 2000;
		
	}
}
