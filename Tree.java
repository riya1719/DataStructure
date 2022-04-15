// Program for expression tree

import java.util.*;
import java.util.Scanner;

//import Travasal.nptr;

class Tree
{

static class pt
{
	char data;
	pt left, right;
} ;

static pt newNode(char c)
{
	pt n = new pt();
	n.data = c;
	n.left = n.right = null;
	return n;
}

static pt build(String s)
{

	Stack<pt> stN = new Stack<>();

	Stack<Character> stack1 = new Stack<>();
	pt t, t1, t2;

	int []p = new int[123];
	p['+'] = p['-'] = 1;
	p['/'] = p['*'] = 2;
	p['^'] = 3;
	p[')'] = 0;

	for (int i = 0; i < s.length(); i++)
	{
		if (s.charAt(i) == '(') {

			stack1.add(s.charAt(i));
		}

		else if (Character.isAlphabetic(s.charAt(i)))
		{
			t = newNode(s.charAt(i));
			stN.add(t);
		}
		else if (p[s.charAt(i)] > 0)
		{
	
			while (
				!stack1.isEmpty() && stack1.peek() != '('
				&& ((s.charAt(i) != '^' && p[stack1.peek()] >= p[s.charAt(i)])
					|| (s.charAt(i) == '^'
						&& p[stack1.peek()] > p[s.charAt(i)])))
			{

				t = newNode(stack1.peek());
				stack1.pop();
		
				t1 = stN.peek();
				stN.pop();

				t2 = stN.peek();
				stN.pop();				

				
				t.left = t2;
				t.right = t1;

				stN.add(t);
			}
			stack1.push(s.charAt(i));
		}
		else if (s.charAt(i) == ')') {
			while (!stack1.isEmpty() && stack1.peek() != '(')
			{
				t = newNode(stack1.peek());
				stack1.pop();
				t1 = stN.peek();
				stN.pop();
				t2 = stN.peek();
				stN.pop();
				t.left = t2;
				t.right = t1;
				stN.add(t);
			}
			stack1.pop();
		}
	}
	t = stN.peek();
	return t;
}


static void postorder(pt root)
{
	if (root != null)
	{
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data);
	}
}


public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter the expression : ");
	String exp = scan.nextLine();
		
	exp = "(" + exp;
	exp += ")";
	pt root = build(exp);

	System.out.print("PostOrder Tree Travesal of given expression : ");
	postorder(root);
}
}


