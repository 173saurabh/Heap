//Heap Sort
import java.util.*;
public class Heap_Sort 
{
	void sort(int arr[],int n)
	{
		for(int i=n/2 -1;i>=0;i--)
			heapify(arr,n,i);
		for(int i=n-1;i>0;i--)
		{
			int swap=arr[0];
			arr[0]=arr[i];
			arr[i]=swap;
			heapify(arr,i,0);
		}
	}
	void heapify(int arr[],int n,int i)
	{
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		
		if(l<n && arr[l]>arr[largest])
			largest=l;
		if(r<n && arr[r]>arr[largest])
			largest=r;
		if(largest!=i)
		{
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			
			heapify(arr,n,largest);
		}
	}
	void printHeap(int arr[])
	{
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array: ");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Heap_Sort ob=new Heap_Sort();
		ob.sort(arr,n);
		System.out.println("the sorted array is: ");
		ob.printHeap(arr);
	}
}
