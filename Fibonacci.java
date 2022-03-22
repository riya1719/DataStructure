

public class Fibonacci {
	
	public static void main(String args[])
	{
		int a = 0;
		int b = 1;
		int sum;
		
		while (a < 15)
		{
			System.out.print(a + " ");
			sum = a + b;
			a = b;
			b = sum; 
		}
	}

}
