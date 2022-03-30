
public class SwapingWithout3Var {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		
		System.out.println("Before Swaping a = " + a+ "b = " +b);
		
		a = a+b;// 5+7 =12; a=12
		b = a-b; // 12- 7 = 5 ; b = 5
		a = a-b; // 12 -5; a =7;
		
		System.out.println("After Swaping a = " + a+ "b = " +b);

		

	}

}
