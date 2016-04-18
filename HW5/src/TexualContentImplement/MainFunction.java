package TexualContentImplement;

import java.util.Scanner;

public class MainFunction {

	public static void main(String[] args) {
		int t ;
		String str_1 ;
		String str_2 ;
		String str_3 ;
		String str_4 ;
		String str_5 ;
		String str_6 ;
		String str_B ;
		String str_C_1;
		String str_C_2;
		String str_sum ;
		Scanner scannerObject = new Scanner(System.in) ;
		
		str_1 = scannerObject.nextLine();
		str_2 = scannerObject.nextLine();
		
		if(str_2.equals("Document"))
		{
			Document document = new Document();
			str_3 = scannerObject.nextLine() ;
			document.setText(str_3);

			if(str_1.equals("A"))
			{
				str_sum = document.toString() ;
				System.out.println(str_sum );
			}
			else if(str_1.equals("B"))
			{
				str_B = scannerObject.nextLine();
				str_sum = document.toString() ;
				t = str_sum.indexOf(str_B);
				if(t==-1)
				{
					System.out.println("false");
				}
				else
				{
					System.out.println("true");
				}
				
			}
			else if(str_1.equals("C"))
			{
				str_C_1 = scannerObject.nextLine();
				str_C_2 = scannerObject.nextLine();
				if(str_C_1.equals("text"))
				{
					document.setText(str_C_2);
				}
				str_sum = document.toString();
				System.out.println(str_sum);
			}
		}
		
		else if(str_2.equals("Email"))
		{
			Email email = new Email();
			str_3 = scannerObject.nextLine() ;
			str_4 = scannerObject.nextLine() ;
			str_5 = scannerObject.nextLine() ;
			str_6 = scannerObject.nextLine() ;
			email.setSender(str_3);
			email.setRecipient(str_4);
			email.setTitle(str_5);
			email.setText(str_6);
			
			if(str_1.equals("A"))
			{
				str_sum = email.toString();
				System.out.println(str_sum);
			}
			else if(str_1.equals("B"))
			{
				str_B = scannerObject.nextLine();
				str_sum = email.toString() ;
				t = str_sum.indexOf(str_B);
				if(t==-1)
				{
					System.out.println("false");
				}
				else
				{
					System.out.println("true");
				}
			}
			else if(str_1.equals("C"))
			{
				str_C_1 = scannerObject.nextLine();
				str_C_2 = scannerObject.nextLine();
				if(str_C_1.equals("text"))
				{
					email.setText(str_C_2);
				}
				else if(str_C_1.equals("sender"))
				{
					email.setSender(str_C_2);
				}
				else if(str_C_1.equals("recipient"))
				{
					email.setRecipient(str_C_2);
				}
				else if(str_C_1.equals("title"))
				{
					email.setTitle(str_C_2);
				}
				
				str_sum = email.toString();
				System.out.println(str_sum);
			}
			
		}
		
		else if(str_2.equals("File"))
		{
			File file = new File() ;
			str_3 = scannerObject.nextLine() ;
			str_4 = scannerObject.nextLine() ;
			file.setPathname(str_3);
			file.setText(str_4);
			if(str_1.equals("A"))
			{
				str_sum = file.toString();
				System.out.println(str_sum);
			}
			else if(str_1.equals("B"))
			{
				str_B = scannerObject.nextLine();
				str_sum = file.toString() ;
				t = str_sum.indexOf(str_B);
				if(t==-1)
				{
					System.out.println("false");
				}
				else
				{
					System.out.println("true");
				}
			}
			else if(str_1.equals("C"))
			{
				str_C_1 = scannerObject.nextLine();
				str_C_2 = scannerObject.nextLine();
				if(str_C_1.equals("text"))
				{
					file.setText(str_C_2);
				}
				else if(str_C_1.equals("pathname"))
				{
					file.setPathname(str_C_2);
				}
				
				str_sum = file.toString();
				System.out.println(str_sum);
			}
			
		}

	}

}
