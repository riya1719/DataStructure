
import java.util.Scanner;
public class PrimeNo {
	
	public static boolean PrimeNo(int num)
	{
		if (num % 2 == 0)
			return false;
		
	
			for (int i = 3; i <=num/2; i+=2)
			{
				if (num % i == 0)
					return false;
			}
		
		return true;
	}

	public static void main(String[] args) {
		
	Scanner scan =new Scanner (System.in);
	
	System.out.print("Enter the number: ");
	int num = scan.nextInt();
	
	if (num <= 0)
		System.out.print("Invalid Input");
	
	for (int i = 1; i <= num; i++)
	{
		boolean b = PrimeNo(i);
	
	if (b == true)
		System.out.print(i + " ");
	
	}

	}

}
