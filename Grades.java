

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {

Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter the marks: ");
		int marks = scan.nextInt();
		
		if (marks < 50)
			System.out.println("You have scored F Grade");
		
		else if (marks >= 50 && marks < 60)
			System.out.println("You have scored D Grade");

		else if (marks >= 60 && marks < 70)
			System.out.println("You have scored C Grade");
		
		else if (marks >= 70 && marks < 80)
			System.out.println("You have scored B Grade");
		
		else if (marks >= 80 && marks < 90)
			System.out.println("You have scored A Grade");
		
		else if (marks >= 90)
			System.out.println("You have scored A+ Grade");
	
			
	}

}
