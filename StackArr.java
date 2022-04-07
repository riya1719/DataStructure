class StackPt
{
	int N = 5;
	int a[] = new int [N];
	int top  = -1;
	
	void push(int x)
	{
		if (top == N-1) // 4 == 4 ; loop break as beyond 4 it should not push
			System.out.println("Stack OverFlow");
			
			else	
			{
				a[++top] = x; // -1++ = 0 , 0++ = 1, 1++ = 2, 2++ =3, 3++ =4
				System.out.println(x + " is Pushed");				
			}
		
	}	
	void pop()
	{
		if (top < 0) // 0 < 0 ; loop break as beyond zero nothing left to pop out
			System.out.println("Stack UnderFlow");
			
			else
			{
				int y = a[top];
				--top;
			}
		
	}
	
	void dis()
	{
		if (top < 0)
			System.out.println("Empty Stack");
			
		else {
			System.out.println(" Displaying elements");
			
			for(int i = 0; i <= top; i++)
			{
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
		
	}
	
	void peek()
	{
		System.out.println("Peek value: " + a[top]);
	}
	
}


public class StackArr 
{
	
	
	public static void main(String[] args) {
	
		StackPt s = new StackPt();
		s.dis();// top =-1
		
		s.push(10);// top = -1
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(200);
      
		s.peek();
       s.dis();
       
       s.push(26);
       
       s.pop();
       s.pop();
       s.pop();
       s.pop();

       s.dis();
       s.pop();
       s.pop();

       
       
       


		
		

		


	}
	


}
