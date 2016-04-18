package LessonLabPractice;

import java.util.Random;

public class Lab6Random {
	public static void main (String[] args)
	{
		Random random = new Random();
		
		for(int i=0;i<100;i++)
		{
			int x = random.nextInt(40);
			System.out.print(x+" ");
		}
	}

}
