package Addition;

import java.util.Scanner;

public class SquareRoot {
public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter a number: ");
		int N = scan.nextInt();

		float Start = 0, End = N;
	float mid =0;
		
		while((End - Start) >= 0.000001)
		{
			 mid = (Start + End) / 2;
			
			if (mid * mid < N)
				Start = mid;
			
			else if (mid * mid >= N)
				End = mid;
			
		}
		System.out.println(mid);
		
}


}
