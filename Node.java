import java.util.Scanner;

 class Node {
			
	int data;
	Node next;
	
	Node head = null;
	Node tail = null;
	
	Node ()
	{
		
	}
	
	Node(int data) // constructor
	{
			this.data = data;
			this.next = null;
		}
		
     void AddNode(int data)
		{
		Node newNode = new Node(data); 
			
		if (head == null)
			{
			
				head = newNode;
				tail= newNode;
			}
		
		else
		{
			tail.next= newNode;
			tail = newNode;
			
		}
		
	}
     
     void pt()
     {
    	 if (head == null)
 			{System.out.println("Header is pointing at node: " + head);
			System.out.println("Tail is pointing at node: " + tail);}
    	 else {

 			System.out.println("Header is pointing at node: " + head.data);
 			System.out.println("Tail is pointing at node: " + tail.data);

    	 }

     }
     
     
     
     void CountNode ()
     {
    	 Node temp = head;
    	 int count =0;
    	 if (head == null)
			System.out.print("List is empty");
    	 else
    	 {

    	 while(temp != null)
    	 {
    		 count++;
    		temp = temp.next ;
    	 }
			System.out.print("The number of elements in the list: " + count);

    	 }


     }
     
     void disp()
     {
    	 Node temp = head;
    	 if (head == null)
			{
				System.out.print("List is empty");
			}
    	 else
    	 {
				System.out.print("Elements in the list: ");

    	 while(temp != null)
    	 {
    		 System.out.print(temp.data +" ");
    		 temp = temp.next ;
    		 
    	 }
    	 }
			System.out.println();

     }
	
	
	
	
	public static void main(String args[])
	{
		Node obj = new Node();
		
		obj.disp();
		obj.pt();
		
		obj.AddNode(10);
		obj.AddNode(20);
		obj.AddNode(30);
		
		obj.disp();
		obj.pt();
		
		obj.CountNode();
		
		

		
		
		
		
		
		
	
	}

}



		