import java.util.Scanner;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a first number: ");
		int num1 = scan.nextInt();
		
		System.out.print("Enter a first number: ");
		int num2 = scan.nextInt();
		
		int lcm;
		if (num1 > num2)
		lcm = num1;
		
		else
			lcm = num2;

	    while(true) 
	    {
	      if( lcm % num1 == 0 && lcm % num2 == 0 ) 
	      {
	        System.out.printf("The LCM of " + num1 + " & " + num2 + " is " + lcm);
	        break;
	      }
	      ++lcm;
	    }

	}}
