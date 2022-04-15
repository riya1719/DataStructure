package DataStructure;
import java.util.Scanner;
import java.util.Stack;

public class Free {
	
	
	static int prec (Character ch)
	{
		switch(ch)
		{
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
		
		
	}
	
	
	
	
	static String infix (String s)
	{
		Stack <Character> stack = new Stack <Character>();
		
		String res = "";
		
		
		
		
		for (int i= 0 ; i < s.length(); i ++)
		{
			char ch = s.charAt(i);
			
			if (Character.isLetterOrDigit(ch))
			res  += ch;
	
			
			else if (ch == '(')
				stack.push('(');
			
			else if (ch == ')')
			{
				while(!stack.isEmpty() && stack.peek() != '(')
				res += stack.pop();
				
				stack.pop();
			}
			

			else 
			{
				while (!stack.isEmpty() && prec (ch) <= prec(stack.peek()) )
					res += stack.pop();
				
				stack.push(ch);

			}
	
		}
		
		 while (!stack.isEmpty())
			{
				res = res + stack.pop();
			}
			
		
		return res;

	}
	
	

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the expression: ");
		String exp = scan.nextLine();
		
		System.out.print(infix (exp));
		
		
		
		
		
		
		
		

	}

}
