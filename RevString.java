import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String s1 = scan.nextLine();

		
		char a[] =s1.toCharArray(); // Convert String to character Array
		
		int i =0, j = a.length-1;
		char ch;
		
		while (i < j)
		{
			ch = a[i];
			a[i]=a[j];
			a[j] = ch;
			
			i++;
			j--;
			
		}
		
		System.out.print("Reverse of given string: ");
		for (int k =0 ; k<=a.length-1; k++)
		System.out.print(a[k]);

	}
}
