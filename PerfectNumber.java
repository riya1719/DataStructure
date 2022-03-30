import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		
		
		int sum =0;
		for (int i =1; i<= num/2; i++ )
		{
			if (num % i == 0)
			{
				sum = sum + i;
			}
		}
		
		if (sum == num)
		System.out.print(num + " is a Perfect Number");
		
		else
			System.out.print(num + " is NOT a Perfect Number");

	}

}
