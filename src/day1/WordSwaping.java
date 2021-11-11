package day1;

public class WordSwaping {
   public static void main(String args[])
   {
	   String ss="i love india";
	   char c[]=ss.toCharArray();
	   String s="";
	   int end=c.length;
	  for(int i=c.length-1;i>0;i--)
	   {
		    if(c[i-1]==' ')
		    	continue;
		   if(c[i]==' ')
		   {
			   s+=ss.substring(i+1,end)+" ";
			   end=i;
		   }
	   }
	 
	   s+=ss.substring(0,end);
	   System.out.println(s);
   }
}
