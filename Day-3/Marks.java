package lu;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e;
		System.out.println("Enter your marks :");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		double pre = ((( a + b + c + d + e ) / 5) );
		if(pre >= 90)
			System.out.println("Grade is A+ and percentage is "+pre);
		else if(pre >= 80)
			System.out.println("Grade is A and percentage is "+pre);
		else if(pre >= 70)
			System.out.println("Grade is B+ and percentage is "+pre);
		else if(pre >= 60)
			System.out.println("Grade is B and percentage is "+pre);
		else if(pre >= 50)
			System.out.println("Grade is C+ and percentage is "+pre);
		else if(pre >= 40)
			System.out.println("Grade is C and percentage is "+pre);
		else
			System.out.println("Better luck next time your percentage is"+pre);
	}
}
