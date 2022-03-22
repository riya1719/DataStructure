
import java.lang.Math;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		
		double temp = num,rem =0,sum =0, digit =0;
		
		while(num > 0)
		{
			num = num / 10; 
			digit++;//
		}
		
		temp = num;
		
		while(num > 0) 
		{
			rem = num % 10; 
			sum = sum + Math.pow(rem, digit);
			num = num / 10; 
		}
		
		if (temp == sum)
			System.out.print("Is a Armstrong Number");
		
		else
			System.out.print("Is not a Armstrong Number");

	}

}
