import java.util.Scanner;

public class ScannerDemo2 {

	
	public static void main (String[] args){
		
		int n1,n2 ; 
		
		Scanner scannerobject = new Scanner(System.in) ;
		
		System.out.println("Enter two WCharSeqHolder numbers");
		System.out.println("seperated by one or more spaces:");
		
		n1 = scannerobject.nextInt();
		n2 = scannerobject.nextInt();
		
		System.out.println("You entered " + n1 + " and " + n2);
		
		System.out.println("Next enter two numbers");
		System.out.println("Decimal points are allowed");
		
		double d1,d2 ;
		d1 = scannerobject.nextDouble();
		d2 = scannerobject.nextDouble();
		System.out.println("Yout entered" + d1 + " and " + d2);
		
		System.out.println("Next enter two words");
		
		
		String word1 = scannerobject.next();
		String word2 = scannerobject.next();
		
		System.out.println("You entered \"" + word1 + "\" and \" " + word2 + "\"");
	
		String junk = scannerobject.nextLine();
		
		System.out.println("Next enter a line of text");
		String line = scannerobject.nextLine();
		System.out.println("You entered: \"" + line + "\"");
	}
}
