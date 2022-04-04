
class StackArry {
	static final int MAX = 5;
	int top;
	int a[] = new int[MAX];

	boolean isEmpty(){
		return (top < 0);
	}
	StackArry(){
		top = -1;
	}

	 void push(int x)
	{
		if (top >= (MAX - 1)) 
			System.out.println("Stack Overflow");
		
		else {
			a[++top] = x;
			System.out.println(x + " : is pushed in stack" );}
		
	}

	 int pop()
	{
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top--];
			return x;
		}
	}

	int peek()
	{
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top];
			return x;
		}
	}
	
	void print(){
	for(int i = top;i>-1;i--){
	System.out.print(" "+ a[i]);
	}
}
}

class Stack {
	public static void main(String args[])
	{
		StackArry s = new StackArry();

		s.push(50);
		s.push(60);
		s.push(30);
		System.out.println(s.pop() + " Popped from stack");
		
		System.out.println("Top element is :" + s.peek());
		
		System.out.println("Elements present in stack :");
		s.print();
		System.out.println();
		System.out.println(s.pop() + " Popped from stack");
		System.out.println(s.pop() + " Popped from stack");
		System.out.println("Is stack empty : "+ s.isEmpty()  );
		
		s.push(80);
		s.push(100);
		s.push(150);
		s.push(156);
		s.push(180);
		s.push(980);
		
		System.out.println("Is stack empty : "+ s.isEmpty()  );
		System.out.println("Top element is :" + s.peek());
		System.out.println("Elements present in stack :");
		s.print();






		
		



	}
}

