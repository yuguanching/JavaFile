import java.util.Scanner;

public class ScannerDemoLine {

	public static void main (String [] args )
	{
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		System.out.println("num=" + num);
		
		//此nextline為收取\n
		scanner.nextLine();
		
		String line2 = scanner.nextLine();
		System.out.println("Line=" + line2);
		
		
		
	}
}
