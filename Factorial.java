
import java.util.Scanner;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner (System.in);
		
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		
		if (num ==0 || num ==1)
			System.out.println("Factorial of " + num + " is 1");
		
		else
		{
			int Fact =1;
			
			for (int i = num; i > 1; i--)
			 Fact = Fact * i;
			
			System.out.println("Factorial of " + num + " is " + Fact);
		}

		
		
	}

}
