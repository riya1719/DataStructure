// Reverse of a number

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num  = scan.nextInt();
		
	    int temp = num, rev =0 , rem =0; // temporary variable
	    
	    while (num >0)
	    {
	    	rem = num % 10;
	    	rev = (rev * 10) + rem;
	        num = num /10;
	    }
			
			
			
			
			
			System.out.println("Reverse of given number " + temp + " is " + rev);
	}}
