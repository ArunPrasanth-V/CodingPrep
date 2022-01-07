import java.util.Scanner;

public class JaggedArrayGetFromUserAndPrint. {
   public static void main(String args[])
   {
	   Scanner scan=new Scanner(System.in);
	   int arr[];
	   arr=new int[5];
	  if(arr[0]==0)
	   System.out.println(arr[0]);
	  
	  int [][]ar=new int[5][];
	  for(int i=0;i<ar.length;i++)
	  {
		  System.out.println("Enter the size for "+i+" row");
		  ar[i]=new int[scan.nextInt()];  	 
	  }
	  for(int i=0;i<ar.length;i++)
	  {
		  for(int j=0;j<ar[i].length;j++)
		  {
			  System.out.println("Enter the "+i+" th row & "+j+" th column ");
			  ar[i][j]=scan.nextInt();
		  }
	  }
	  
	  for(int[] i:ar)
	  {
		for(int j:i)
			System.out.println(j);
	  }
   }
}
