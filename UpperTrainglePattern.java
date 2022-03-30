import java.util.Scanner;

public class UpperTrainglePattern {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of rows: ");
		int N = scan.nextInt();
		
		for (int i =1; i<=N; i++)
		{
			for (int j =1; j < i; j++)
			{ 
				
				System.out.print(" " + " ");
			}
			for (int k =1; k <= N -i +1; k++)
			{ 
				System.out.print("*" + " ");
			}
			System.out.println();


		}
		
	}
	

}
