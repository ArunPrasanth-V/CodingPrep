package practiceSession;


import java.util.List;
import java.util.function.Consumer;



public class Main {
	public static void main (String args[])
	{
	  int f=5;
	  int l=11;
	  int odd[]=new int[7];
	  int even[]=new int[7];
	  int temp=odd.length>even.length?odd.length:even.length;
	  int oddi=0,eveni=0;
	  for(int i=f;i<=l;i++)
	  {
		  if(i%2!=0)
		  {
			  
			  odd[oddi]=i;
			  System.out.println(odd[oddi]+" is add in odd");
			  oddi++;
		  }
		  else 
		  {
			  
			  even[eveni]=i;
			  System.out.println(even[eveni] +" is add in even");
			  eveni++;
		  }
		  
	  }
 	 int len=(l-f)+1;
 	 oddi=0;
 	 eveni=even.length-1;
       for(int i=0;i<len;i++) {
    	 if(i%2!=0)
 		  {
 			  odd[oddi]=i;
 			  System.out.println(odd[oddi]);
 		  }
    	 else 
		  {
			  
			  even[eveni]=i;
			  System.out.println(even[eveni] );
         } 
       }
	}
}