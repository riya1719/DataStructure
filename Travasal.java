
//Program for expression tree

import java.util.*;
import java.util.Scanner;

class Travasal
{

static class nptr
{
	char data;
	nptr left, right;
} ;

static nptr newNode(char c)
{
	nptr n = new nptr();
	n.data = c;
	n.left = n.right = null;
	return n;
}

static nptr build(String s)
{
	Stack<nptr> stN = new Stack<>();

	Stack<Character> stC = new Stack<>();
	nptr t, t1, t2;

	int []p = new int[123];
	p['+'] = p['-'] = 1;
	p['/'] = p['*'] = 2;
	p['^'] = 3;
	p[')'] = 0;

	for (int i = 0; i < s.length(); i++)
	{
		if (s.charAt(i) == '(') {

			stC.add(s.charAt(i));
		}

		else if (Character.isAlphabetic(s.charAt(i)))
		{
			t = newNode(s.charAt(i));
			stN.add(t);
		}
		else if (p[s.charAt(i)] > 0)
		{
	
			while (
				!stC.isEmpty() && stC.peek() != '('
				&& ((s.charAt(i) != '^' && p[stC.peek()] >= p[s.charAt(i)])
					|| (s.charAt(i) == '^'
						&& p[stC.peek()] > p[s.charAt(i)])))
			{

				t = newNode(stC.peek());
				stC.pop();

				
				t1 = stN.peek();
				stN.pop();

				t2 = stN.peek();
				stN.pop();

				t.left = t2;
				t.right = t1;

				stN.add(t);
			}
			stC.push(s.charAt(i));
		}
		else if (s.charAt(i) == ')') {
			while (!stC.isEmpty() && stC.peek() != '(')
			{
				t = newNode(stC.peek());
				stC.pop();
				t1 = stN.peek();
				stN.pop();
				t2 = stN.peek();
				stN.pop();
				t.left = t2;
				t.right = t1;
				stN.add(t);
			}
			stC.pop();
		}
	}
	t = stN.peek();
	return t;
}


static void postorder(nptr root)
{
	if (root != null)
	{
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data);
	}
}

  static void preorder(nptr root) {
    if (root == null)
      return;

    System.out.print(root.data );
    preorder(root.left);
    preorder(root.right);
  }

  static void inorder(nptr root) {
	    if ( root== null)
	      return;

	    inorder(root.left);
	    System.out.print(root.data);
	    inorder(root.right);
	  }

public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter the expression : ");
	String exp = scan.nextLine();
		
	exp = "(" + exp;
	exp += ")";
	nptr root = build(exp);

	System.out.print("PostOrder Expression Tree Traversal: ");
	postorder(root);
	System.out.println();
	System.out.println();
	
	System.out.print("PreOrder Expression Tree Traversal: ");
	preorder(root);
	System.out.println();
	System.out.println();
	
	System.out.print("InOrder Expression Tree Traversal: ");
	inorder(root);
	System.out.println();
	System.out.println();



}
}



