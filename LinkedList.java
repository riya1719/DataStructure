
 class LinkedList {
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			 next = null;
		}
	}
	
	Node head = null;
	Node tail = null;
		
		void AddNode(int data)
		{
			Node newNode = new Node (data);
			
			if (head == null)
			{
				head = newNode;
				tail = newNode;
			}
			else
			{
				tail.next = newNode;
				tail = newNode;
				
			}
		}
		
		void dis()
		{
			if (head == null)
				System.out.println("Empty List");
			
			else
			{
				System.out.print("Elements in the list: ");
				Node temp = head;
				while(temp != null)
				  {
					System.out.print(temp.data + " ");
					temp = temp.next;
				  }
				System.out.println();
			}
		}
		
		void pt()
		{
			if (head == null)
			{
				System.out.println("Head is point at " + head);
				System.out.println("Tail is point at " + tail);
			}
			
			else
			{
				System.out.println("Head is point at " + head.data);
				System.out.println("Tail is point at " + tail.data);
			}
			

		}

		void DeleteLast()
		{
			if (head == null)
				System.out.println("Empty List");
			
			else if (head.next == null)
			{
				System.out.println("Deleted element is " + head.data);
				head = null;

			}
				

			else
			{
				Node temp = head;

				while (temp.next.next != null)
					temp = temp.next;
				
				System.out.println("Deleted element is " + temp.next.data);
				tail  = temp;
				tail.next = null;
				
			}
				
			
		}
		
		void DeleteHead()
		{
			head = head.next;
		}
		
		
		
	public static void main (String args[])
	{
	           LinkedList ref = new LinkedList();
	           
	           ref.dis();
	           ref.pt();

	           ref.AddNode(10);
	           ref.AddNode(20);
	           ref.AddNode(30);
	           ref.AddNode(40);
	           ref.pt();
	           
	           ref.dis();
	           ref.DeleteHead();
	           ref.dis();
	           
	           ref.DeleteLast();
	           ref.dis();
	           
	           ref.DeleteLast();
	           ref.DeleteLast();
	           ref.DeleteLast();

	           

	           
		
		
		
				
	}
	

}
