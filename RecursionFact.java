
// Recursion Program for finding Factorial of a number

import java.util.Scanner;

public class RecursionFact {
	
	static int Fact (int N)
	{
		if(N == 0 || N == 1)
			return 1;
	
		else
			return N * Fact(N-1);
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter a number: ");
		int N = scan.nextInt();
		
		int Factorial = Fact(N);
		
		System.out.println("Factorial of " + N + " is " + Factorial);
		
	}

}
