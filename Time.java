

public class Time {

	public static void main(String[] args) {

		int m1 = 2230;
		int m2 = 200;

		
		int a = m1/100; //12
		int b = m1 % 100; // 45
		
		
		int a1 = m2/100; //3
		int b1 = m2 % 100; //45
		
		int hour = (b + b1) / 60; //1
		
		int min = (b+b1)% 60; //30
		
		int hours = (a + a1 + hour) % 24;
		
		System.out.println(hours);

		int Time = (hours * 100) + min;
		
		System.out.println(Time);
			
	}

}
