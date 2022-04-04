// Circular Queue implementation in Java

public class CQueueArr {
  int SIZE = 5; // Size of Circular Queue
  int front, rear;
  int items[] = new int[SIZE];

  CQueueArr() {
    front = -1;
    rear = -1;
  }

  // Check if the queue is full
  boolean isFull() {
    if (front == 0 && rear == SIZE - 1) {
      return true;
    }
    if (front == rear + 1) {
      return true;
    }
    return false;
  }

  // Check if the queue is empty
  boolean isEmpty() {
    if (front == -1)
      return true;
    else
      return false;
  }

  // Adding an element
  void enQueue(int element) {
    if (isFull()) {
      System.out.println("Queue is full");
    } 
    else {
      if (front == -1)
        front = 0;
      
      rear = (rear + 1) % SIZE;
      items[rear] = element;
      System.out.println("Inserted " + element);
    }
  }

  // Removing an element
  int deQueue() {
    int element;
    
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return (-1);
      
    } else {
      element = items[front];
      
      if (front == rear) {
        front = -1;
        rear = -1;
      } /* Q has only one element, so we reset the queue after deleting it. */
      else {
        front = (front + 1) % SIZE;
      }
      return (element);
    }
  }

  void display() {
    /* Function to display status of Circular Queue */
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue");
    } 
    else
    {
      System.out.println("Front -> " + front +" "+ items[front]);
      
      System.out.println("Items -> ");
      
      for (i = front; i != rear; i = (i + 1) % SIZE)
        {System.out.print(items[i] + " ");}// 4 != 4
     
      System.out.println(items[i]);
      
      
      System.out.println("Rear -> " + rear +" "+ items[rear]);
    }
  }

  public static void main(String[] args) {

    CQueueArr q = new CQueueArr();

    // Fails because front = -1
    q.deQueue();

    q.enQueue(10);
    q.enQueue(20);
    q.enQueue(30);
    q.enQueue(40);
    q.enQueue(50);

    // Fails to enqueue because front == 0 && rear == SIZE - 1
    q.enQueue(60);

    q.display();

    int elem = q.deQueue();

    if (elem != -1) {
      System.out.println("Deleted Element is " + elem);
    }
    q.display();

    q.enQueue(70);

    q.display();

    // Fails to enqueue because front == rear + 1
    q.enQueue(80);
    
    int elem2 = q.deQueue();
    if (elem2 != -1) {
        System.out.println("Deleted Element is " + elem2);
      }
      q.display();
    
  }

}