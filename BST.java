package OperatingSystem;
import java.util.Scanner;

class BST {  

        int data;  
        BST left;  
        BST right; 
        BST root;  

  
         BST(int data)
        {  
            this.data = data;  
            this.left = null;  
            this.right = null;  
        }  
        
  
       BST()
       {  
    	   
      }  
  
      public void insert(int data)
      {  
          BST newNode = new BST(data); 
          
            if(root == null)
            root = newNode; //65 

             
          else 
          {  
              BST current = root, parent = null;  
  
              while(true)
              {  
                  parent = current; //parent >> root >> 65
  
                  if(data < current.data) // 10 < 65
                  {  
                      current = current.left; 
                      
                      if(current == null)
                      {
                    	  parent.left = newNode;
                          return;

                      }
                      
                      
                  }  
                  else // if not < then greater then 65
                  {  
                      current = current.right;  
                      if(current == null) 
                      {
                    	  parent.right = newNode;
                          return;

                      }
                      
                   }  
                }  
          }  
      }  
  
      public BST minNode(BST root) {  
          if (root.left != null)  
              return minNode(root.left);  
          else  
              return root;  
      }  
  
      public BST deleteNode(BST node, int value) {  
          if(node == null){  
              return null;  
           }  
          else {  
              if(value < node.data)                                 //Traversing
                  deleteNode(node.left, value);  
  
              else if(value > node.data)                           //Traversing
                  deleteNode(node.right, value);  
  
              else {  
                  if(node.left == null && node.right == null)  // last node 
                      node = null;  
  
                  else if(node.left == null) // one child left
                      node = node.right;  //node.right is poitner addrs
                    
  
                  else if(node.right == null) // one child right  
                      node = node.left;  
                    
  
                  else {  
                      BST temp = minNode(node.right); // temp = min(8);  temp>> 7
                      node.data = temp.data;  // 5 = 7;
                      deleteNode(node.right, temp.data);  // 8,7
                       }  
                    }  
              return node;  
                 }  
      }  
  
      public void inorderTraversal(BST node) {  
  
          if(root == null){  
              System.out.println("Tree is empty");  
              return;  
           }  
          else {  
  
              if(node.left!= null)  
                  inorderTraversal(node.left);  
              System.out.print(node.data + " ");  
              if(node.right!= null)  
                  inorderTraversal(node.right);  
  
          }  
      }  
  
      public static void main(String[] args) {  
  
          BST bt = new BST();  
          bt.insert(65);  
          bt.insert(10);  
          bt.insert(77);  
          bt.insert(34);  
          bt.insert(12);  
          bt.insert(9);  
  
          System.out.println("Binary search tree after insertion:");  
          bt.inorderTraversal(bt.root);
          System.out.println();
  
           
          bt.deleteNode(bt.root, 9);  
          System.out.print("Binary search tree after deleting node 9: ");  
          bt.inorderTraversal(bt.root);
          System.out.println();
          
          bt.deleteNode(bt.root, 34);  
          System.out.print("Binary search tree after deleting node 34:");  
          bt.inorderTraversal(bt.root);
          System.out.println();

  
          bt.deleteNode(bt.root, 65);  
          System.out.print("Binary search tree after deleting node 65:");  
          bt.inorderTraversal(bt.root);  
          System.out.println();

      }  
}  



