package BigData;

public class Comparison extends IOperation{

	
	public String perform(String num1, String num2) {
	String string_sum = "0" ;
	char ch1 , ch2 ;
	int  int1, int2 ;
	int length1,length2 ;
	int i=0 ;
	
	if(num1.charAt(0)=='-'&&num2.charAt(0)!='-')
	{
		string_sum = "-1" ;
	}
	else if(num1.equals(num2))
	{
		string_sum = "0";
	}
	else if(num1.charAt(0)!='-'&&num2.charAt(0)=='-')
	{
		string_sum = "1";
	}
	else if(num1.charAt(0)!='-'&&num2.charAt(0)!='-')
	{
		while(true)
		{
			ch1 = num1.charAt(i) ;
			ch2 = num2.charAt(i) ;
			int1 = Character.getNumericValue(ch1);
			int2 = Character.getNumericValue(ch2);
			length1 = num1.length();
			length2 = num2.length();
			
			if(length1>length2)
			{
				string_sum = "1";
				break;
			}
			else if(length1<length2)
			{
				string_sum = "-1";
				break;
			}
			if(int1==int2)
			{
				i = i + 1 ;
				continue ;
			}
			else if(int1>int2)
			{
				string_sum = "1";
				break ;
			}
			else if(int1<int2)
			{
				string_sum = "-1";
				break ;
			}
		}
	}
	else if(num1.charAt(0)=='-'&&num2.charAt(0)=='-')
	{
		while(true)
		{
			i = i + 1 ;
			ch1 = num1.charAt(i) ;
			ch2 = num2.charAt(i) ;
			int1 = Character.getNumericValue(ch1);
			int2 = Character.getNumericValue(ch2);
			length1 = num1.length();
			length2 = num2.length();
			
			if(length1>length2)
			{
				string_sum = "-1";
				break;
			}
			else if(length1<length2)
			{
				string_sum = "1";
				break;
			}
			if(int1==int2)
			{
				i = i + 1 ;
				continue ;
			}
			else if(int1>int2)
			{
				string_sum = "-1";
				break ;
			}
			else if(int1<int2)
			{
				string_sum = "1";
				break ;
			}
		}
	}

		return string_sum;
	}
}
