package day1;

public class NumberOfSubstring {
  public static void main(String args[])
   {
	    char chr[]= {'1','2','3'};
	   
	     permutation(0,chr.length-1,chr);
   }
  static void swap(int i,int start,char arr[])
  {
	  char c=' ';
	   c=arr[i];
	   arr[i]=arr[start];
	   arr[start]=c;
  }
   static void permutation(int start,int end,char[] arr)
   {
	   if(start==end)
	   {
		   for(char cc:arr)
              System.out.print(cc);
		   System.out.println();
	   }
	  
	   for(int i=start;i<=end;i++)
	   {
		   swap(i,start,arr);
		   permutation(start+1,end,arr);
		   swap(i,start,arr);
	   }
   }
   static void swap(int a)
   {
	   
   }
}
