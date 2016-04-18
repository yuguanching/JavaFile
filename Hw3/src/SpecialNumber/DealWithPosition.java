package SpecialNumber;

import SpecialNumber.DealWithBoolean;

public class DealWithPosition {
	
	int x5_0 = 1    ; 
	int x5_1 = 5    ; 
	int x5_2 = 16   ; 
	int x5_3 = 37   ; 
	int x5_4 = 72   ; 
	int x5_5 = 125  ; 
	int x5_6 = 198  ; 
	int x5_7 = 295  ;
	int x5_8 = 419  ;
	int x5_9 = 574  ; 
	int x5_10= 764  ; 
	int x5_11= 991  ;
	int x5_12= 1259 ;
	int x5_13= 1572 ;
	int x5_ex= 1598 ;
	int value ;
	DealWithBoolean dwb = new DealWithBoolean() ;
	String str1 ;
	
public int positionValue(int position)
{
	if(position>=x5_0 && position<x5_1)
	{
		value = 1 ;
		if(position==x5_0)
		{
			return 1 ;
		}
		while(x5_0<=position)
		{
			str1 = dwb.specialNumberBoolean(value);
			if(str1 == "true")
			{
				x5_0 = x5_0 + 1 ;
			}
			if(x5_0>position)
			{
				break ;
			}
			value = value + 1 ;

		}
		
		return value ;
	}
	
	else if(position>=x5_1 && position<x5_2)
	{
		value = 5 ;
		if(position==x5_1)
		{
			return 5 ;
		}
		while(x5_1<=position)
		{
			str1 = dwb.specialNumberBoolean(value);
			//System.out.println(str1);
			//System.out.println("* " + value);
			//System.out.println(x5_1);

			if(str1 == "true")
			{
				x5_1 = x5_1 + 1 ;
			}
			if(x5_1>position)
			{
				break ;
			}
			value = value + 1 ;
			
		}

			return value ;
		

	}
	
	else if(position>=x5_2 && position<x5_3)
	{
		value = 25 ;
		if(position==x5_2)
		{
			return 25 ;
		}
		while(x5_2<=position)
		{
			str1 = dwb.specialNumberBoolean(value);
			if(str1 == "true")
			{
				x5_2 = x5_2 + 1 ;
			}
			if(x5_2>position)
			{
				break ;
			}
			value = value + 1 ;
		}
		return value ;
	}
	
	else if(position>=x5_3 && position<x5_4)
	{
		value = 125 ;
		if(position==x5_3)
		{
			return 125 ;
		}
		while(x5_3<=position)
		{
			str1 = dwb.specialNumberBoolean(value);
			if(str1 == "true")
			{
				x5_3 = x5_3 + 1 ;
			}
			if(x5_3>position)
			{
				break ;
			}
			value = value + 1 ;
		}
		return value ;
	}
	
	else if(position>=x5_4 && position<x5_5)
	{
		value = 625 ;
		if(position==x5_4)
		{
			return 625 ;
		}
		while(x5_4<=position)
		{
			str1 = dwb.specialNumberBoolean(value);
			if(str1 == "true")
			{
				x5_4 = x5_4 + 1 ;
			}
			if(x5_4>position)
			{
				break ;
			}
			value = value + 1 ;
		}
		return value ;
	}
	
	else if(position>=x5_5 && position<x5_6)
	{
		value = 3125 ;
		if(position==x5_5)
		{
			return 3125 ;
		}
		while(x5_5<=position)
		{
			str1 = dwb.specialNumberBoolean(value);
			if(str1 == "true")
			{
				x5_5 = x5_5 + 1 ;
			}
			if(x5_5>position)
			{
				break ;
			}
			value = value + 1 ;
		}
		return value ;
	}
	
	else if(position>=x5_6 && position<x5_7)
	{
		value = 15625 ;
		if(position==x5_6)
		{
			return 15625 ;
		}
		while(x5_6<=position)
		{
			str1 = dwb.specialNumberBoolean(value);
			if(str1 == "true")
			{
				x5_6 = x5_6 + 1 ;
			}
			if(x5_6>position)
			{
				break ;
			}
			value = value + 1 ;
		}
		return value ;
	}
	
	else if(position>=x5_7 && position<x5_8)
	{
		value = 78125 ;
		if(position==x5_7)
		{
			return 78125 ;
		}
		while(x5_7<=position)
		{
			str1 = dwb.specialNumberBoolean(value);
			if(str1 == "true")
			{
				x5_7 = x5_7 + 1 ;
			}
			if(x5_7>position)
			{
				break ;
			}
			value = value + 1 ;
		}
		return value ;
	}
	
	else if(position>=x5_8 && position<x5_9)
	{
		value = 390625 ;
		if(position==x5_8)
		{
			return 390625 ;
		}
		while(x5_8<=position)
		{
			str1 = dwb.specialNumberBoolean(value);
			if(str1 == "true")
			{
				x5_8 = x5_8 + 1 ;
			}
			if(x5_8>position)
			{
				break ;
			}
			value = value + 1 ;
		}
		return value ;
	}
	
	else if(position>=x5_9 && position<x5_10)
	{
		value = 1953125 ;
		if(position==x5_9)
		{
			return 1953125 ;
		}
		while(x5_9<=position)
		{
			str1 = dwb.specialNumberBoolean(value);
			if(str1 == "true")
			{
				x5_9 = x5_9 + 1 ;
			}
			if(x5_9>position)
			{
				break ;
			}
			value = value + 1 ;
		}
		return value ;
	}
	
	else if(position>=x5_10 && position<x5_11)
	{
		value = 9765625 ;
		if(position==x5_10)
		{
			return 9765625 ;
		}
		while(x5_10<=position)
		{
			str1 = dwb.specialNumberBoolean(value);
			if(str1 == "true")
			{
				x5_10 = x5_10 + 1 ;
			}
			if(x5_10>position)
			{
				break ;
			}
			value = value + 1 ;
		}
		return value ;
	}
	
	else if (position >=x5_11 && position < x5_12)
	{
		value = 48828125 ;
		if(position==x5_11)
		{
			return 48828125 ;
		}
		while(x5_11<=position)
		{
			str1 = dwb.specialNumberBoolean(value);
			if(str1 == "true")
			{
				x5_11 = x5_11 + 1 ;
			}
			if(x5_11>position)
			{
				break ;
			}
			value = value + 1 ;
		}
		return value ;
	}
	else if (position >=x5_12 && position < x5_13)
	{
		value = 244140625 ;
		if(position==x5_12)
		{
			return 244140625 ;
		}
		while(x5_12<=position)
		{
			str1 = dwb.specialNumberBoolean(value);
			if(str1 == "true")
			{
				x5_12 = x5_12 + 1 ;
			}
			if(x5_12>position)
			{
				break ;
			}
			value = value + 1 ;
		}
		return value ;
	}
	else if(position >=x5_13 && position < x5_ex)
	{
		value = 1220703125 ;
		if(position==x5_13)
		{
			return 1220703125 ;
		}
		while(x5_13<=position)
		{
			str1 = dwb.specialNumberBoolean(value);
			if(str1 == "true")
			{
				x5_13 = x5_13 + 1 ;
			}
			if(x5_13>position)
			{
				break ;
			}
			value = value + 1 ;
		}
		return value ;
	}
	
	
	else 
	{
		value = 1377495072;
		if(position==x5_ex)
		{
			return 1377495072 ;
		}
		while(x5_ex<=position)
		{
			str1 = dwb.specialNumberBoolean(value);
			if(str1 == "true")
			{
				x5_ex = x5_ex + 1 ;
			}
			if(x5_ex>position)
			{
				break ;
			}
			value = value + 1 ;
		}
		return value ;
	}
}


}
