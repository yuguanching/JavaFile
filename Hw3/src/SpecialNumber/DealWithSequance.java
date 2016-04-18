package SpecialNumber;


public class DealWithSequance {
	long pow2 =0 ;
	long pow3 =0 ;
	long pow5 =0 ;
	int powbiggest2 = 1 ;
	int number2 ;
	int sequencecount = 0 ;
	long numbercount ;
	
	public long pow (long x,long y) //自定義整數型pow
	{
		
		long z = x ;
		if(y==0)
		{
			return 1 ;
		}
		for(int i = 1; i<y ;i++)
		{
			z = z * x ;
			
		}
		return z ;
	}

	public int specialNumberSequence(int number)
	{
		number2 = number ;
		
		while((number2/2)!=1)
		{

			number2 =( (number2/2) + (number2%2) ) ;
			powbiggest2 = powbiggest2 + 1 ;
			

		}

		pow2 = powbiggest2 ;
		pow3 = powbiggest2 ;
		pow5 = powbiggest2 ;

		while((pow(2, pow2))>number || pow(2, pow2)<0)
		{
			pow2 = pow2 - 1 ;
		}

		while((pow(3, pow3))>number || pow(3, pow3)<0)
		{
			pow3 = pow3 - 1 ;
			
		}
		while((pow(5, pow5))>number || pow(5, pow5)<0)
		{
			pow5 = pow5 - 1 ;
			
		}
		

		int i=0 ;
		int j=0 ;
		int k=0 ;
	
		for(k = 0;k<=pow2;k++)
		{
				for(j = 0;j<=pow3;j++)
			{
						for(i=0;i<=pow5;i++)
				{
					numbercount = pow(2, k)*pow(3, j)*pow(5, i) ;
				
					
					if(numbercount>number ||numbercount<0)
					{

						continue ;
	
					}
					
					if(numbercount <=number)
					{
						sequencecount = sequencecount + 1 ;
					}
				
				}
			
			}
			
			
		}
		
		return sequencecount ;
	}
	}

