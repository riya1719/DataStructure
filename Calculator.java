

import java.util.Scanner;

public class Calculator {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter First number: ");
		int a = scan.nextInt();
		
		System.out.print("Enter Second number: ");
		int b = scan.nextInt();
		
		System.out.print("Enter the operator: ");
		char ch = scan.next().charAt(0);
		
		switch (ch)
		{
		case ('+'):
		{
			System.out.print("Addition of given numbers: " + (a+b));
			break;
		}
		
		case ('-'):
		{
			System.out.print("Subracting of given numbers: " + (a-b));
			break;
		}
		
		case ('*'):
		{
			System.out.print("Multiplication of given numbers: " + (a*b));
			break;
		}
		
		case ('/'):
		{
			System.out.print("Division of given numbers: " + (a/b));
			break;
		}
		
		default:
		System.out.print("Invaild Input");
		
		}
		
		
		
		
		
}

}
