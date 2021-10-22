package day8;

public class BankAccount {
	
	private double balance=1000;
	
	
	public void getBalance(int pin)
	{
		
		if(pin==5678)
		{
			System.out.println(balance);
		}
		else
		{
			System.out.println("Wrong pin");
		}
	}
	
	

}
