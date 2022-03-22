

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner (System.in);
		
		System.out.print("Enter the number: ");
		int num = scan.nextInt();
		
		int temp = num;
		int rem =0 , rev =0;
		
		while (num > 0)
		{
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num /10;
		}
		
		if (temp == rev)
			System.out.print(" The given number is Palindrome");
		
		else
			System.out.print(" The given number is Not a Palindrome");

			
			
		
		
		
		

	}

}
