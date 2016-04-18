package LessonLabPractice;

import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x    ;
		int y    ;
		int z    ;
		System.out.println("Please input a number:");
		x = scanner.nextInt();
		z = x ;
		
		for(y=1;x>=2;x--)
		{
			y = y * (x) ;
			
			
		}

		System.out.println(z+"!="+y);
	}

}
