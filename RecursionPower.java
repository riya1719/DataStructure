import java.util.Scanner;

public class RecursionPower {
	
	static int Expo(int N, int Power)
	{
		if (Power == 1)
			return N;
		else
			return N * (Expo(N,(Power -1)));
	}
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter a number: ");
		int N = scan.nextInt();
		
		System.out.print("Enter power for number: ");
		int Power = scan.nextInt();
		
		int Exponential = Expo(N, Power);
		
		System.out.println(N + " to the power " + Power + " is " + Exponential);

}
}
