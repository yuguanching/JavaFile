import java.util.Scanner;

public class Guess 
{
	public static void main (String[] args )
	{
		float number = (float)Math.random();  //給予0~1之間的小數
		number *=1000.0f ;
		int number2 = (int)number ;
		
		
		
		Scanner ss = new Scanner(System.in);
		boolean bool1 = true ;
		
		while(bool1)
		{
			int guess = ss.nextInt();
			
			if(guess >number2)
			{
				System.out.println("too large!!");
				
			}
			else if (guess < number2)
			{
				System.out.println("too small!!");
				
			}
			else
			{
			System.out.println("Guess right !!");	
			bool1 = false ;
			}
		}
		
		
		}
		
	}
