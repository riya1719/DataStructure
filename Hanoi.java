// Program to solve tower of hanoi puzzle
import java.util.Scanner;
class Hanoi
{
	static void towerOfHanoi(int N, char rod1, char rod2, char rod3)//3 A C B
	{
		if (N == 1)
		{
			System.out.println("Move plates 1 from rod " + rod1 + " to rod " + rod2);
			return;
		}
		towerOfHanoi(N-1, rod1, rod3, rod2); // 2,A B C,   //1, A C B
		// 1 B A C
		System.out.println("Move the plates " + N + " from rod " + rod1 + " to rod " + rod2);
		
		towerOfHanoi(N-1, rod3, rod2, rod1); // 1, C B A
	} // 2 B C A // 1 A C B
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter the number of plates: ");
		int N = scan.nextInt(); 
		
		towerOfHanoi(N, 'A', 'C', 'B'); 
				
	}
}




