package day1;

public class mergeSort {
	//it's not actually mergeSort it's quick Sort.
	public static void main(String args[])
	{
		int arr[]= {1,4,3,2,5};
		int n=arr.length;
		quickSort(arr,0,n-1);
		System.out.println("Sorted array ");
		printArray(arr,n);
	}
static void swap(int[] arr,int i,int j)
 {
	 int temp=arr[j];
	 arr[j]=arr[i];
	 arr[i]=temp;
 }

static int partition(int []arr,int low ,int high)
 {
	 int pivot=arr[high];
	 int i=(low-1);
	 for(int j=low;j<high;j++)
	 { 
		 if(arr[j]<pivot)

		 {
		 i++;//1
		 swap(arr,i,j);
	 
		 }
	 }
	 swap(arr,i+1,high);
	 return (i+1);
 }
 static void quickSort(int[] arr,int low,int high)
  {
	  if(low<high)
	  {
		  int pi=partition(arr,low,high);
	  
		  quickSort(arr,low,pi-1);
          quickSort(arr,pi+1,high);
          
	  }
  }
static void printArray(int [] arr,int size)
	{
	  for(int i=0;i<size;i++)
	  {
		  System.out.println(arr[i]+" ");
	  }
	      System.out.println();
	}
	 
  }