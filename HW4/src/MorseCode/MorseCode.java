package MorseCode;

import java.util.ArrayList;

public class MorseCode {

	
static private String[] str_e = new String[26] ;
static private String[] str_c = new String[26] ;
	
public static void  morseTable(String str)
	{
		int equal=0 ;
		int semicolon=0 ;
		int a,b ;
		int i,j ;
		String temp1 = "" ;
		String temp2 = "" ;
		char c ;

		for(i=0;i<26;i++)
		{
			a = str.indexOf("=", equal);
			b = str.indexOf(";", semicolon);
			temp1 = str.substring(a+1,b);
			str_e[i] = temp1 ;
			equal = a + 1 ;
			semicolon = b + 1 ;
		}
		
		int length ;
		
		for(i=0;i<26;i++)
		{
			length = str_e[i].length();
			for(j=0;j<length;j++)
			{
				c = str_e[i].charAt(j);
				if(c == '.')
				{
					temp2 = temp2.concat("1");
				}
				else if(c=='-')
				{
					temp2 = temp2.concat("111");
				}
				
				if(j!=(length-1))
				{
					temp2 = temp2.concat("0");
				}
			}
			str_c[i] = temp2 ;
			temp2 = "";

		}
		
	}
	
public static String encode(String str)
	{
	 	String strConvert = str.toUpperCase() ;
		String[] stringArray = new String[300] ;
		ArrayList<String> stringArray1 = new ArrayList<String>() ;
		String stringSum = "" ;
		int length = str.length() ;
		int i,j=0 ;
		char c1,c2 ;
		
		for(i=0;i<length;i++)
		{
			c1 = strConvert.charAt(i);
			switch (c1)
			{
			case 'A':
				stringArray1.add(str_e[0]);
				break ;
			case 'B':
				stringArray1.add(str_e[1]);
				break ;
			case 'C':
				stringArray1.add(str_e[2]);
				break ;
			case 'D':
				stringArray1.add(str_e[3]);
				break ;
			case 'E':
				stringArray1.add(str_e[4]);
				break ;
			case 'F':
				stringArray1.add(str_e[5]);
				break ;
			case 'G':
				stringArray1.add(str_e[6]);
				break ;
			case 'H':
				stringArray1.add(str_e[7]);
				break ;
			case 'I':
				stringArray1.add(str_e[8]);
				break ;
			case 'J':
				stringArray1.add(str_e[9]);
				break ;
			case 'K':
				stringArray1.add(str_e[10]);
				break ;
			case 'L':
				stringArray1.add(str_e[11]);
				break ;
			case 'M':
				stringArray1.add(str_e[12]);
				break ;
			case 'N':
				stringArray1.add(str_e[13]);
				break ;
			case 'O':
				stringArray1.add(str_e[14]);
				break ;
			case 'P':
				stringArray1.add(str_e[15]);
				break ;
			case 'Q':
				stringArray1.add(str_e[16]);
				break ;
			case 'R':
				stringArray1.add(str_e[17]);
				break ;
			case 'S':
				stringArray1.add(str_e[18]);
				break ;
			case 'T':
				stringArray1.add(str_e[19]);
				break ;
			case 'U':
				stringArray1.add(str_e[20]);
				break ;
			case 'V':
				stringArray1.add(str_e[21]);
				break ;
			case 'W':
				stringArray1.add(str_e[22]);
				break ;
			case 'X':
				stringArray1.add(str_e[23]);
				break ;	
			case 'Y':
				stringArray1.add(str_e[24]);
				break ;
			case 'Z':
				stringArray1.add(str_e[25]);
				break ;
			case ' ':
				stringArray1.add(" ");
				break ;
			}
			
		}

		int lengthTerminal = 0;
		String stringList = "" ;
		String sss = "" ;

		for(i=0;i<length;i++)
		{	
			stringList = stringArray1.get(i);
			lengthTerminal = stringList.length();

			for(j=0;j<lengthTerminal;j++)
			{
				c2 = stringList.charAt(j);
				//System.out.println(stringSum);
				if(c2=='.')
				{
					stringSum = stringSum.concat("1");
				}
				else if(c2=='-')
				{
					stringSum = stringSum.concat("111");
				}
				else if(c2==' ')
				{
					stringSum = stringSum.concat("0000000");
				}
				
				if(j!=(lengthTerminal-1))
				{
					stringSum = stringSum.concat("0");
				}
				
			}
			int z = i + 1 ;
			if(z!=stringArray1.size())
			{
			
				sss = stringArray1.get(z);
			}
			if(i!=(length-1)&&stringList!=" "&&sss!=" ")
			{
				stringSum = stringSum.concat("000");
			}
			}
		
		
		return stringSum ;
	}
	
	
	
public static String decode(String str)
	{
	String stringConvert = str.toUpperCase();
	String strTerminal1 = "000";
	String strTerminal2 ;
	String stringSum = "";
	int a=0,b ;
	int temp=0 ;
	int length = stringConvert.length() ;
	b = stringConvert.indexOf(strTerminal1);
	if(b == -1)
	{
		b = length ;
	}
	while(temp==0)
	{

		strTerminal2 = (str.substring(a, b));
		if(strTerminal2.equals(str_c[0]))
		{
			stringSum = stringSum.concat("A");
		}
		else if(strTerminal2.equals(str_c[1]))
		{
			stringSum = stringSum.concat("B");
		}
		else if(strTerminal2.equals(str_c[2]))
		{
			stringSum = stringSum.concat("C");
		}
		else if(strTerminal2.equals(str_c[3]))
		{
			stringSum = stringSum.concat("D");
		}
		else if(strTerminal2.equals(str_c[4]))
		{
			stringSum = stringSum.concat("E");
		}
		else if(strTerminal2.equals(str_c[5]))
		{
			stringSum = stringSum.concat("F");
		}
		else if(strTerminal2.equals(str_c[6]))
		{
			stringSum = stringSum.concat("G");
		}
		else if(strTerminal2.equals(str_c[7]))
		{
			stringSum = stringSum.concat("H");
		}
		else if(strTerminal2.equals(str_c[8]))
		{
			stringSum = stringSum.concat("I");
		}
		else if(strTerminal2.equals(str_c[9]))
		{
			stringSum = stringSum.concat("J");
		}
		else if(strTerminal2.equals(str_c[10]))
		{
			stringSum = stringSum.concat("K");
		}
		else if(strTerminal2.equals(str_c[11]))
		{
			stringSum = stringSum.concat("L");
		}
		else if(strTerminal2.equals(str_c[12]))
		{
			stringSum = stringSum.concat("M");
		}
		else if(strTerminal2.equals(str_c[13]))
		{
			stringSum = stringSum.concat("N");
		}
		else if(strTerminal2.equals(str_c[14]))
		{
			stringSum = stringSum.concat("O");
		}
		else if(strTerminal2.equals(str_c[15]))
		{
			stringSum = stringSum.concat("P");
		}
		else if(strTerminal2.equals(str_c[16]))
		{
			stringSum = stringSum.concat("Q");
		}
		else if(strTerminal2.equals(str_c[17]))
		{
			stringSum = stringSum.concat("R");
		}
		else if(strTerminal2.equals(str_c[18]))
		{
			stringSum = stringSum.concat("S");
		}
		else if(strTerminal2.equals(str_c[19]))
		{
			stringSum = stringSum.concat("T");
		}
		else if(strTerminal2.equals(str_c[20]))
		{
			stringSum = stringSum.concat("U");
		}
		else if(strTerminal2.equals(str_c[21]))
		{
			stringSum = stringSum.concat("V");
		}
		else if(strTerminal2.equals(str_c[22]))
		{
			stringSum = stringSum.concat("W");
		}
		else if(strTerminal2.equals(str_c[23]))
		{
			stringSum = stringSum.concat("X");
		}
		else if(strTerminal2.equals(str_c[24]))
		{
			stringSum = stringSum.concat("Y");
		}
		else if(strTerminal2.equals(str_c[25]))
		{
			stringSum = stringSum.concat("Z");
		}
		else {
			stringSum=  "*INVALID*";
			break ;
		}
		
		
		if(b==(length))
		{
			break ;
		}
		
		if(stringConvert.charAt(b+3)=='0')
		{
			stringSum = stringSum.concat(" ");
			a = b + 7 ;
			b = stringConvert.indexOf(strTerminal1,a);
			if(b==-1)
			{
				b=(length);
			}
		
			continue ;
		}
		a = b + 3 ;
		b = stringConvert.indexOf(strTerminal1,a);
		
		if(b==-1)
		{
			b = (length) ;
		}
		
		
	}

		return stringSum ;
	}
}
