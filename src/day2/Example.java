package day2;

public class Example {
  public static void main(String args[])
  {
	  int arr[]= {8,4,6,3,2,10};
	  int newarr[]=new int[arr.length];
	  int sum=0;
	  int sqrtValue;
	  for(int i=0;i<arr.length;i++)
	  {
		  sqrtValue=(int)Math.sqrt(arr[i]);
		  if(sqrtValue*sqrtValue==arr[i])
			  sum+=5;
		  if(arr[i]%4==0 &&arr[i]%6==0)
			  sum+=4;
		  if(arr[i]%2==0)
			  sum+=3;
		  newarr[i]=sum;
		  sum=0;
	  }
	  for(int i=0;i<arr.length;i++)
	  {
	     for(int j=0;j<arr.length-1-i;j++)
	      {
			  if(newarr[j]>newarr[j+1])
			  {
				  int temp=newarr[j+1];
				  int temp1=arr[j+1];
				  arr[j+1]=arr[j];
				  newarr[j+1]=newarr[j];
				  arr[j]=temp1;
				  newarr[j]=temp;
				  
			  }
	      }
	  }
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.printf("<%d,%d>",arr[i],newarr[i]);
		  System.out.println();
	  }
  }
}
