import java.util.Scanner;

public class RecursionFibo {
	
	static int Fibonacci(int N,int a,int b)
	{
		int sum;
		if (N==1)
			return a;
		else
		{
			System.out.print(a + " ");
			sum = a + b;
			N--;
			return Fibonacci(N,b,sum);
			
		}
	}
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter the nth number till series has to print: ");
		int N = scan.nextInt();
		
		int a = 0;
		int b = 1;
		System.out.print(Fibonacci(N,a,b));
		
		
		
}
}
