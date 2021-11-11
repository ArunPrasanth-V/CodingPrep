package day2;
import java.util.*;


public class SomeKindOFSorting {
   public static void main(String args[])
   {
	  int arr[]= {8,4,6,3,2,10};
	  int arrtemp[]=new int [arr.length];
  int sum=0;
	   int sq=0;
	  for(int i=0;i<arr.length;i++)
	  {
		  sq=(int)Math.sqrt(arr[i]);
		  if(sq*sq==arr[i])
			  sum+=5;
		  if(arr[i]%4==0&&arr[i]%6==0)
			  sum+=4;
		  if(arr[i]%2==0)
			  sum+=3;
		  arrtemp[i]=sum;
		  sum=0;
	  }
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=0;j<arr.length-1-i;j++)
		  {
			 int temp=arr[j];
			 int temp1=arrtemp[j];
			 arr[j]=arr[j+1];
			 arrtemp[j]=arrtemp[j+1];
			 arr[j+1]=temp;
			 arrtemp[j+1]=temp1;
		  }
	  }
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.println("<"+arr[i]+" "+arrtemp[i]+">");
	  }
   }
}
