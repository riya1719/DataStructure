class Queue {   
      
     int front, rear, capacity = 5 ;   
     int queue [] = new int[capacity]; 
     
    Queue() {   
        front = -1;
        rear = -1;   
          
    }   
     void queueEnqueue(int item)  {  
    	 
    	 if ( front == -1)
    	 {
    		 ++front;
    		 ++rear;
    		 queue[rear] = item; //rear =0;front =0
    	 }
    	 else if (capacity == rear+1) {   
            System.out.println("Queue is full");   
        }   
             else {  	 
            queue[++rear] = item; // rear =1
        }   
    }   
    
     void queueDequeue()  {   
        if (front == rear) {   
            System.out.println("Queue is empty");  
            front = -1;
            rear = -1;
        }   
     
        else {   
            int y = queue[front];
            front = ++front;
            }   

    }   
     
     void queueDisplay()   
    {   
        int i;   
        if (front == -1 &&  rear== -1) {   
            System.out.println("Queue is Empty");   
        } 
        else {
        	for (i = front; i < rear+1; i++) 
        	{   
                System.out.print( queue[i] + " ");   
            }  
        }
         
    }   
     
    void queueFront()   
    {   
    	if (front == -1 || rear == -1) {   
            System.out.println("Queue is Empty and front is: " + front);
         
        }   
    	else 
    		System.out.println("Front Element of the queue: " + front + " " + queue[front]);   
    }   
    
     void queueRear()   
    {   
    	 if (front == -1 || rear == -1) {   
            System.out.println("Queue is Empty and rear is: "+ rear);   
        }   
        else
        	System.out.println("Rear Element of the queue: " + rear + " "+ queue[rear]); 
    	 
    }   
}   


public class QueueArr {  
    public static void main(String[] args) {   
        Queue q = new Queue();   
     
        System.out.print("Initial Queue:");  
        q.queueDisplay();   
     
        q.queueEnqueue(50);   
        q.queueEnqueue(80);   
        q.queueEnqueue(510);  
        q.queueEnqueue(57);  
        q.queueEnqueue(890);  

        
        q.queueFront(); 
        q.queueRear();  
        


     
        System.out.print("Queue after Enqueue Operation:");  
        q.queueDisplay();  
        System.out.println();

     
        q.queueFront(); 
        q.queueRear();   

                
        q.queueDisplay();   
     
        q.queueDequeue();   
        q.queueDequeue(); 

        System.out.println();
        System.out.print("Queue after Dequeue operations:");   
        q.queueDisplay();   
        System.out.println();
        
        q.queueEnqueue(80);   
        
        System.out.print("Queue after Enqueue Operation:");  
        q.queueDisplay();  
        System.out.println();

       
      



    }   
}  
