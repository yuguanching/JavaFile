package SpecialNumber;

import SpecialNumber.DealWithBoolean;
import SpecialNumber.DealWithSequance;
import SpecialNumber.DealWithPosition;

public class MainFunction {
	
	public static void main (String[] args)
	{
		String str = args[0];
		char index1 = str.charAt(0) ;
		String str1 = str.substring(2);
		int number = Integer.parseInt(str1);
		String str2 ;
		int sequencecount ;
		int value ;
		
		if(index1=='X')
		{
			DealWithBoolean dwb1 = new DealWithBoolean() ;
			str2 = dwb1.specialNumberBoolean(number);
			System.out.println(str2);
			
		}
		else if(index1=='Y')
		{
			DealWithPosition dwp = new DealWithPosition() ;
			value = dwp.positionValue(number) ;
			System.out.println(value);
			
		}
		else if (index1=='Z')
		{
			DealWithBoolean  dwb2 = new DealWithBoolean()  ;
			str2 = dwb2.specialNumberBoolean(number);
			if(str2=="false")
			{
				System.out.println("This is not a special number!!");
				System.exit(1);
				
			}
			
			DealWithSequance dws = new DealWithSequance() ;
			sequencecount = dws.specialNumberSequence(number);
			System.out.println(sequencecount);
			

		}
		
	}

}
