import java.util.Scanner;

public class InsertionSort {
	
	
		static void sort(int arr[],int N)
		{
			for (int i = 1; i < N; i++)
			{
				int key = arr[i];
				int j = i - 1;

				while (j >= 0 && arr[j] > key)
				{
					arr[j + 1] = arr[j];
					j = j - 1;
				}
				arr[j + 1] = key;
			}
		}

		static void printArray(int arr[],int N)
		{
			System.out.print("Elements after Insertion Sorting : ");

			for (int i = 0; i < N; ++i)
				System.out.print(arr[i] + " ");

			System.out.println();
		}

		public static void main(String args[])
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Enter the total number of elements : ");
			int N = scan.nextInt();
			
			int arr[] = new int[N];
			
			System.out.print("Enter the elements : ");

			for (int i=0; i < N; i++)
				 arr[i] = scan.nextInt();

			sort(arr,N);

			printArray(arr,N);
		}
	} 

