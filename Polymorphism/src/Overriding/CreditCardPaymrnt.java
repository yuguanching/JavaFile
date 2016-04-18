package Overriding;

public class CreditCardPaymrnt extends Payment {
	
	public void pay()
	{
		System.out.println("pay with credit card");
	}
	
	public void sign() 
	{
		System.out.println("Signing...");
	}

}
