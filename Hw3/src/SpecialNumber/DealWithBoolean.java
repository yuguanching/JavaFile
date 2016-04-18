package SpecialNumber;

public class DealWithBoolean {

	int x2 ;
	int x3 ;
	int x5 ;
	int count2 ;
	int count3 ;
	int count5 ;
	int number2 ;
	
	public String specialNumberBoolean(int number)
	{
		if(number==1)
		{
			return "true" ;
		}
		
		x2 = number%2 ;//判斷number的質因數是(0)否(1)有2
		x3 = number%3 ;//判斷number的質因數是(0)否(1,2)有3
		x5 = number%5 ;//判斷number的質因數是(0)否(1,2,3,4)有5
		
		if(x2!=0 && x3!=0 && x5!=0)
		{
			return "false" ;
		}
		
		number2 = number ;
		count2 = 1 ;
		count3 = 1 ;
		count5 = 1 ;
		if (x2==0)
		{

			while((number%2) != 1)
			{
				number = number/2 ;
				count2 = count2 * 2;
			}

		}
		
		 if (x3==0)
		{
			while((number%3 != 1) && (number%3 !=2))
			{
				number = number/3 ;
				count3 = count3 * 3 ;
				
			}
		}
		 
		if (x5==0)
		{
			while((number%5 != 1) && (number%5 != 2) && (number%5 != 3 )&&( number%5 != 4))
			{
				number = number/5 ;
				count5 = count5 * 5 ;
			}
		}
	
		number2 = number2 / (count2*count3*count5) ;
		
		if(number2!=1)
		{
			return "false" ;
		}
		else {
			return "true" ;
		}
	}
	
}
