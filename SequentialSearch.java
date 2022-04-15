import java.util.Scanner;

public class SequentialSearch {
	
	static int Search(int key,int arr[], int N )
    {
		for(int i = 0; i < N; i++)
		{
		    if(arr[i] == key)
		      return i;
		    
		}
		   return -1;
    }
	
	
    public static void main(String[] args) {  
    
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter the total number of elements : ");
	int N = scan.nextInt();
	
	int arr[] = new int[N];
	
	System.out.print("Enter the elements : ");

	for (int i=0; i < N; i++)
		 arr[i] = scan.nextInt();
	
	System.out.print("Enter the element to be searched : ");
	int key = scan.nextInt();
	
	int index = Search(key,arr,N);
	
	if (index >= 0)
		System.out.println("The element " + key +" is present at " + index + " index of given array");
	
	else
		System.out.print("The element " + key +" is not present in the given array");


		

	

}
}
