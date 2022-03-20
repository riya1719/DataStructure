

import java.util.Scanner;
public class ReverseArray {	
	
	private static int[] RevArr(int original [], int N) // Method return reverse array
	{
		int reverse [] = new int [N];

		for (int i= N-1; i>= 0; i--)
			reverse[i] = original[N - i -1 ];
		
		return reverse;
	}
	 public static void main (String args [])
	 {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int N = scan.nextInt();
		
		int original [] = new int [N];

		System.out.print("Enter the elements in an array: ");  // Reading array values
		for (int i=0; i< N; i++)
			original[i] = scan.nextInt();
		
		
		int reverse [] = RevArr(original, N);                   // Call Method by name RevArr
		
		System.out.print("Reverse of given array: ");          // Print Reverse array
		for (int i=0; i< N; i++)
			System.out.print(reverse[i] + " ");
		}
	 
}

