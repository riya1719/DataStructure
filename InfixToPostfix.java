import java.util.Stack;

import java.util.Scanner;

class InfixToPostfix
{
	static int Prec(char ch)
	{
		switch (ch)
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

	static String infixToPostfix(String exp)
	{
		String result = new String("");
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i<exp.length(); ++i)
		{
			char c = exp.charAt(i);
			if (Character.isLetterOrDigit(c))
				result += c;
			
			else if (c == '(')
				stack.push(c);
			else if (c == ')')
			{
				while (!stack.isEmpty() && stack.peek() != '(')
					result += stack.pop();
				
					stack.pop();
			}
			else 
			{
				while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek()))
				{
				
					result += stack.pop();
			}
				stack.push(c);
				}
		}
		while (!stack.isEmpty())
		{
			if(stack.peek() == '(')
				return "Invalid Expression";
			result += stack.pop();
		}
		return result;
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		String exp = scan.nextLine();
		
		//String exp = "a+b*(c^d-e)^(f+g*h)-i";
		System.out.println(infixToPostfix(exp));
	}
}


