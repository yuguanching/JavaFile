import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PerfectNumber {

	public static void main (String[] args) throws IOException {
	
		
		String x,y,z;
		String str1 = " is a perfect number" ;
		String str2 = " is not a perfect number " ;
		int x1,y1,z1;
		int i ;
		int sum=0 ;
		FileReader fr = new FileReader("C:/Users/Administrator/Desktop/java/PerfectNumber/text1.txt") ;
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("text2.txt") ;
		x = br.readLine() ;
		x1 = Integer.parseInt(x) ;
		for(i=1;i<x1;i++)
		{
			if((x1%i)==0)
			{
				sum = sum + i ;
			}
			
			
		}
		
		if(sum==x1)
		{
			fw.write(x1 + str1 + "\r\n");
			
		}
		else{
			fw.write(x1 + str2 + "\r\n");
			
		}
		sum = 0;
		
		y = br.readLine() ;
		y1 = Integer.parseInt(y) ;
		for(i=1;i<y1;i++)
		{
			if((y1%i)==0)
			{
				sum = sum + i ;
			}
			
			
		}
		
		if(sum==y1)
		{
			fw.write(y1 + str1 + "\r\n");
			
		}
		else{
			fw.write(y1 + str2 + "\r\n");
			
		}
		sum = 0;
		
		z = br.readLine() ;
		z1 = Integer.parseInt(z) ;
		
		for(i=1;i<z1;i++)
		{
			if((z1%i)==0)
			{
				sum = sum + i ;
			}
			
			
		}
		
		if(sum==z1)
		{
			fw.write(z1 + str1 + "\r\n");
			
		}
		else{
			fw.write(z1 + str2 + "\r\n");
			
		}
		sum = 0;
		
		fr.close();
		fw.close();
	}

}
