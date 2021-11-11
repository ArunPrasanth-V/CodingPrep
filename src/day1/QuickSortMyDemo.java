package day1;

public class QuickSortMyDemo {

public static void main(String[] args) 
    {
	    int arr[]={50,30,10,90,80,20,40,70};
	    int n=arr.length;
	    quickSort(arr,0,n-1);
	    diplay(arr,n);
	}
static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
static int changing(int arr[],int low,int high)
	{
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)
				
			{
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		 return (i+1);
	}
	
static void quickSort(int arr[],int low ,int high)
	{
		if(low<high)
		{
			int p=changing(arr,low,high);
			quickSort(arr,low,p-1);
			quickSort(arr,p+1,high);
		}
	}
static void diplay(int arr[],int size)
	{
		for(int i=0;i<size;i++)
		  {
			  System.out.println(arr[i]+" ");
		  }
		      System.out.println();
	}

}
