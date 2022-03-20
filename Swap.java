

public class Swap {
public static void main(String[] args) {
		

		int num1 = 5;
		int num2 = 4;
		
		System.out.println("Before Swap: num1 = " + num1 + ", num2 = " + num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After Swap: num1 = " + num1 + ", num2 = " + num2);
		
	}
		


}
