// Sum of Factorial of all elements from N to 1 using recursion

import java.util.Scanner;

public class FactSum {
	
	static int Fact (int N)
	{
		if(N == 1)
			return 1;
	
		else
			return N * Fact(N-1);
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter a number: ");
		int N = scan.nextInt();
		
		int sum =0;
		for (int i = N; i > 0; i--)
		{
			sum = sum + Fact(i);
		}
				
		System.out.println("Sum of all Factorial from " + N + " to 1 is " + sum);
		
	}

}
