package OperatingSystem;

import java.util.Scanner;
import java.util.Stack;


public class TreeExp {
	
	char data;
	TreeExp left , right;
	
	TreeExp ()
	{
		
	}
	
	TreeExp (char data)
	{
		this.data = data;
		left = right =null;
	}
	
	
	TreeExp  NewNode (char data)
	 {
		 TreeExp n = new TreeExp(data);
		 return n;
				 
	 }
	 
	  int Prec(char ch)
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

	 
	  TreeExp BuildTree (String s)
	 {

	 	Stack<TreeExp> stN = new Stack<>();

	 	Stack<Character> stkOp = new Stack<>();
	 	
	 	TreeExp t;

	 	

	 	for (int i = 0; i < s.length(); i++)
	 	{
	 		char ch = s.charAt(i);
	 	  if (Character.isLetterOrDigit(ch))
	 		  {
	 		 t = NewNode (ch);
	 		  stN.push(t);
	 		  }
	 	  
	 	  else if (ch == '(')
	 		 stkOp.push(ch);
	 	  
	 	  
	 	 
	 	  
	 	  else if (ch == ')')
	 	  {
	 		  while (!stkOp.empty() && stkOp.peek() != '('  )
	 		  {
	 		  t = NewNode (stkOp.pop());
	 
	 		  t.left = stN.pop();
	 		  t.right= stN.pop();
	 		  
	 		 stN.add(t);
	 		  }
	 		  
	 		 stkOp.pop(); // pop (
	 		  
	 	  }
	 	  
	 	  else
	 	  {
	 		 while (!stkOp.isEmpty() && Prec(ch) <= Prec(stkOp.peek()))
				{
	 			t = NewNode (stkOp.pop());
		 		 
		 		  t.left = stN.pop();
		 		  t.right= stN.pop();
		 		  
		 		 stN.add(t);
				}
	 		stkOp.push(s.charAt(i));
	 	  }
	   
	 	}
	 	
	 	while (!stkOp.isEmpty())
		{
			
	 		t = NewNode (stkOp.pop());
	 		 
	 		  t.left = stN.pop();
	 		  t.right= stN.pop();
	 		  
	 		 stN.add(t);
		}
	 
	 	t = stN.peek();
	 	return t;
	 	
	 	
	 	
	 	
	 }
	  
	  static void postorder( TreeExp root)
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
			
			System.out.print("Enter the string : ");
			String exp = scan.nextLine();
			
			TreeExp obj = new TreeExp();
			
			//String exp = "a+b*(c^d-e)^(f+g*h)-i";
			TreeExp root = obj.BuildTree(exp);
			postorder(root);
			
		}
}
	


