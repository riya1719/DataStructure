import java.util.Scanner;

public class SinwaveNumberPattern {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
					
					System.out.print("Enter the size of rows  : ");
					int N = scan.nextInt();
					
					for (int i =1; i<=N; i++)
					{
						for (int j =1; j <= N; j++)
						{ 
							if (j% 2 == 0)
							{
								System.out.print((N*j -(i-1)) + " ");
							}
							else
								System.out.print((N*(j-1)+i) + " ");
	
						}
						System.out.println();

					}
	}

}
