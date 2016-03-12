package HW2;

import java.text.DecimalFormat;
import java.util.Scanner;
public class QuadraticEquation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double a,b,c ;
		double x1,x2 ;
		String str ;
		//for user to input 
		do {
			a = scanner.nextDouble();
			b = scanner.nextDouble();
			c = scanner.nextDouble();
			str = scanner.next();
			
		} while ((Math.pow(b, 2)-4*a*c) < 0);
		
		
		// use math operation to get two roots for x1, x2
		x1 =  (-b + (Math.sqrt(Math.pow(b, 2.0)-4.0*a*c)))/(2.0*a) ;
		x2 =  (-b - (Math.sqrt(Math.pow(b, 2.0)-4.0*a*c)))/(2.0*a) ;
		
		//let x1,x2 match the format given by user in String str  
		DecimalFormat df  = new DecimalFormat(str) ;
		String result1 ;
		String result2 ;
		result1 = df.format(x1);
		result2 = df.format(x2);
		System.out.println(result1);
		System.out.println(result2);
		

	}

}
