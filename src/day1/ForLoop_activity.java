package day1;

public class ForLoop_activity {
   public static void main(String args[])
   {
	   char[]ch= {'g','e','e','k','s','f','o','r','g','e','e','k','s'};
	   int temp=0;
	   char temparr[];
	   for(int start=0,end=ch.length-1;start<ch.length;start++,end--)
	   {
		   temparr=new char[ch.length];
		   temp=0;
		   while(temp<start)
		   {
		       temparr[temp]=' ';
			   temp++;
		   }
		   temparr[start]=ch[start];
		   temp=0;
		   while(temp<end-1&&temp!=start)
		   {
			   temparr[temp]=' ';
			   temp++;
		   }
		   temparr[end]=ch[end];

			   for(char c:temparr)
				   System.out.print(c);
		   System.out.println();
		   temparr=null;
	   }
   }
}
