package BigData;


import java.util.ArrayList;

public class Addition extends IOperation {
	
	
	public String perform(String num1, String num2) {
  	int carry = 0 ;  //進位
	int i,j=0 ;
	int length_minux ;
	char ch1,ch2 ;
	int int1,int2,int_sum;
	ArrayList<String> arrayList = new ArrayList<String>() ;
	String string_sum = "" ;
	String string_zero= "";
	String string_neg = "-";
	
	//作加法

	if(num1.charAt(0)!='-' && num2.charAt(0)!='-')
	{

	i = (num1.length()>=num2.length())?num1.length():num2.length() ;
	length_minux  = num1.length() - num2.length() ;
	length_minux = Math.abs(length_minux) ;
	i = i - 1;

	for(j=1;j<=length_minux;j++)
	{
		string_zero = string_zero.concat("0");
	}
	
	if(num1.length()>num2.length()){
	
		num2 = string_zero.concat(num2);
	}
	else if(num1.length()<num2.length())
	{
		num1 = string_zero.concat(num1) ;
	}
	
	while(i>=0)
	{

		ch1 = num1.charAt(i);
		ch2 = num2.charAt(i);
		int1 = Character.getNumericValue(ch1);
		int2 = Character.getNumericValue(ch2);
		if(carry==1)
		{
			int1 = int1 + 1 ;
			carry = 0 ;
		}
		int_sum = int1 + int2 ;
		if(int_sum>=10)
		{
			int_sum = int_sum - 10 ;
			carry = 1 ;
			arrayList.add(Integer.toString(int_sum));
		}
		else{
			arrayList.add(Integer.toString(int_sum));
		}
		i = i - 1 ;
		if(i<0&&carry==1)
		{
			arrayList.add("1");
		}
	}
	j = (arrayList.size() - 1);

	while(j>=0)
	{
		string_sum = string_sum.concat(arrayList.get(j));
		j = j - 1 ;
	}
	
	}
	//作加法
	else if(num1.charAt(0)=='-' && num2.charAt(0)=='-')
	{
		i = (num1.length()>=num2.length())?num1.length():num2.length() ;
		i = i - 1;
		length_minux  = num1.length() - num2.length() ;
		length_minux = Math.abs(length_minux) ;
		if(num1.length()<num2.length())
		{
			num1 = num1.substring(1);
			for(j=1;j<=length_minux;j++)
			{
				string_zero = string_zero.concat("0");
			}
			num1 = string_zero.concat(num1);
			num1 = string_neg.concat(num1);
		}
		else
		{
			num2 = num2.substring(1);
			for(j=1;j<=length_minux;j++)
			{
				string_zero.concat("0");
			}
			num2 = string_zero.concat(num2);
			num2 = string_neg.concat(num2);
		}

		while(i>=1)
		{

			ch1 = num1.charAt(i);
			ch2 = num2.charAt(i);
			int1 = Character.getNumericValue(ch1);
			int2 = Character.getNumericValue(ch2);

			if(carry==1)
			{
				int1 = int1 + 1 ;
				carry = 0 ;
			}
			int_sum = int1 + int2 ;
			
			if(int_sum>=10)
			{
				int_sum = int_sum - 10 ;
				carry = 1 ;
				arrayList.add(Integer.toString(int_sum));
			}
			else{
				arrayList.add(Integer.toString(int_sum));
			}

			i = i - 1 ;
			if(i==0&&carry==1){
				arrayList.add("1");
			}
			
		}
		j = (arrayList.size() - 1);

		string_sum = string_neg.concat(string_sum) ;

		while(j>=0)
		{
			string_sum = string_sum.concat(arrayList.get(j));
			j = j - 1 ;
		}

		
		
	}
	//呼叫減法
	else if(num1.charAt(0)!='-'&&num2.charAt(0)=='-')
	{
		Subtraction subtraction = new Subtraction() ;
		num2 = num2.substring(1);
		string_sum = subtraction.perform(num1, num2);
	}
	//呼叫減法
	else if(num1.charAt(0)=='-'&&num2.charAt(0)!='-')
	{
		Subtraction subtraction = new Subtraction() ;
		num1 = num1.substring(1);
		string_sum = subtraction.perform(num2, num1);	
	}
	
	
	
		return string_sum;
	}

}
