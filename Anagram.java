import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
	
	static boolean Anagram(char a[], char b[])
	{
		int l1 =a.length;
		int l2 =b.length;
		
		if (l1 != l2)
			return false;
		
		for (int i =0 ; i < l1; i++)
		{
			if (a[i] != b [i])
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the String1: ");
		String s1 = scan.nextLine();

		System.out.print("Enter the String2: ");
		String s2 = scan.nextLine();
		
		char a[] =s1.toCharArray();
		char b[] =s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		boolean c = Anagram(a,b);
		
		if (c == true)
			System.out.print("Given strings are Anagram");
		
		else
			System.out.print("Given strings are not Anagram");

			

			

		
		

		
		


	}

}
