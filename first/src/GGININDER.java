import java.util.Scanner;

public class GGININDER

{
	
public static void main (String[] args)	
{
	Scanner scanner1 = new Scanner(System.in);
	
	String s = scanner1.nextLine() ;
	
	
	
	if(s.equals("scissors")){
		
		System.out.println("stone");
		
	}
	else if (s.equals("stone")){
		
		System.out.println("paper");
		
	}
	else {
		
		System.out.println("scissors");
	}
	
}
	
	
	
	
	
}