
import java.io.*;
import java.util.Scanner;
public class QuickSort {
	
static void swap(int[] arr, int i, int j)
{
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}

static int partition(int[] arr, int low, int high)
{
	
		int pivot = arr[high];
	
	int i = (low - 1);

	for(int j = low; j <= high - 1; j++)
	{
	
		if (arr[j] < pivot)
		{
		
			i++;
			swap(arr, i, j);
		}
	}
	swap(arr, i + 1, high);
	return (i + 1);
}


static void quickSort(int[] arr, int low, int high)
{
	if (low < high)
	{
		
		int pi = partition(arr, low, high);

		quickSort(arr, low, pi - 1);
		quickSort(arr, pi + 1, high);
	}
}

static void printArray(int[] arr, int size)
{
	System.out.print("Elements after Quick Sorting : ");

	for(int i = 0; i < size; i++)
		System.out.print(arr[i] + " ");
		
	System.out.println();
}

public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);

	System.out.print("Enter the total number of elements : ");
	int N = scan.nextInt();
	
	int arr[] = new int[N];
	
	System.out.print("Enter the elements : ");

	for (int i=0; i < N; i++)
		 arr[i] = scan.nextInt();
	
	quickSort(arr, 0, N - 1);
	
	printArray(arr, N);
}
}

