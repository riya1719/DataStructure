
import java.text.DecimalFormat;


public class Clock {
	 public static void main (String args [])
	 {
	        DecimalFormat num = new DecimalFormat("00");

		 
		 int seconds = 10832;
		 
		 int hours = seconds / 3600; // hours
		 
		 int Leftsec = seconds % 3600;
		 
		 int mins = Leftsec / 60; // mins
		 
		 int sec = Leftsec % 60; // sec
		 
		 System.out.println(seconds + " seconds is equivalent to = "
		 + num.format(hours) + ":H "+ num.format(mins) + ":M " + num.format(sec) + ":S ");
		 
	 }
	 

}
