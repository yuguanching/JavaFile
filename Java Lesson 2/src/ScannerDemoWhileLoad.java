import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import javax.swing.table.TableStringConverter;

public class ScannerDemoWhileLoad {

	public static void main (String[] args)
	{
		try{
			Scanner scanner = new Scanner(new FileInputStream("c:\\test.txt"));
			
			while(scanner.hasNextLine()){
				String line = scanner.nextLine();
				System.out.println(line);
				
			}
		}
			catch(Exception e) {
			e.printStackTrace();;
		}
		
		
		
	}
}
