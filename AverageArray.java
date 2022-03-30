import java.util.Scanner;

public class AverageArray {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int N = scan.nextInt();
		
		int a [] = new int[N];
		
		
		System.out.print("Enter the elements of array: ");
		for (int i=0; i< N; i++)
		a[i] = scan.nextInt();
		
		
		float sum =0 , avg = 0;
		
		for (int i=0; i< N; i++)
			sum = sum + a[i];
		
		avg = sum / N;
		System.out.print("The average of given numbers: " + avg);


		
		

		
	}

}
