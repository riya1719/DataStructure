
// Program to find the sum of all number
// between n to 1 using recusion
import java.util.Scanner;

public class RecursionSum {
	
	static int Sum(int N)
	{
		if (N == 1)
			return 1;
		
		else
			return N + Sum(N-1);
	}


	
public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter a number: ");
		int N = scan.nextInt();
		
		int Summation = Sum(N);
		
		System.out.println("Sum of all numbers between " + N + " to 1 is  " + Summation);

		
		

}
}
