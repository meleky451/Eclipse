package class26;

public class TestBank {

	public static void main(String[] args) {
		
		Bank bank1 =new Bank();
		System.out.println(bank1.getBalance());
		
		BankA bank2=new BankA();
		System.out.println(bank2.getBalance());
		
		BankB bank3=new BankB();
		System.out.println(bank3.getBalance());
		
		BankC bank4=new BankC();
		System.out.println(bank4.getBalance());

	}

} 
