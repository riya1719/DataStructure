import java.util.Scanner;

public class BubbleSort {  
    static void bubbleSort(int[] arr) 
    {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++)
         { 
        	 
           for(int j=1; j < (n-i); j++)
           {  
               if(arr[j-1] > arr[j])
               {  
                temp = arr[j-1];  
                arr[j-1] = arr[j];  
                arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    static void printArray(int[] arr, int size)
    {
    	System.out.print("Elements after Quick Sorting : ");

    	for(int i = 0; i < size; i++)
    		System.out.print(arr[i] + " ");
    		
    	System.out.println();
    }
    public static void main(String[] args) {  
    	
    	Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the total number of elements : ");
		int N = scan.nextInt();
		
		int arr[] = new int[N];
		
		System.out.print("Enter the elements : ");

		for (int i=0; i < N; i++)
			 arr[i] = scan.nextInt();
		
                  
       bubbleSort(arr);
       printArray(arr, N);

                 
  
     
   
        }  
}  
