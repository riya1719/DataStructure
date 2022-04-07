// Java program for linked-list implementation of queue

import static java.lang.System.exit;

class QNode {
	int key;
	QNode next;

	public QNode(int key)
	{
		this.key = key;
		this.next = null;
	}
}

class QueueL {
	QNode front, rear;

	public QueueL()
	{
		this.front = this.rear = null;
	}

	void enqueue(int key)
	{

		QNode temp = new QNode(key);

		if (this.rear == null) {
			this.front = this.rear = temp;
			return;
		}

		this.rear.next = temp;
		this.rear = temp;
	}

	void dequeue()
	{
		if (this.front == null)
			return;

		QNode temp = this.front;
		this.front = this.front.next;

		if (this.front == null)
			this.rear = null;
	}
	
	public void display()
	{
		if (rear == null) {
			System.out.printf("\nStack Underflow");
		}
		else {
			QNode temp = front;
			while (temp != null) {

				System.out.printf("%d->", temp.key);

				temp = temp.next;
			}
		}
	}
}

public class QueueLL {
	public static void main(String[] args)
	{
		QueueL q = new QueueL();
		
		q.display();
		System.out.println();
		
		q.enqueue(710);
		q.enqueue(320);
		q.enqueue(30);
		q.enqueue(40);
		
		System.out.println("Queue After enqueue: ");

		q.display();
		System.out.println();
		
		System.out.println("Queue Front : " + q.front.key);
		System.out.println("Queue Rear : " + q.rear.key);
		
		q.dequeue();
		q.dequeue();
		
		System.out.println("Queue After Denqueue: ");
		q.display();
		System.out.println();

		System.out.println("Queue Front : " + q.front.key);
		System.out.println("Queue Rear : " + q.rear.key);
		
		
		q.dequeue();
		q.dequeue();
		
		q.display();
		System.out.println();	
	}
}
